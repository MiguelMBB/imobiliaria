package com.imobiliaria.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//usuários com perfil comum tem acesso aos métodos GET
//usuários com perfil admim tem acesso aos métodos POST, PUT, e DELETE
@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.GET, "/usuario").hasAuthority("COMUM")
                .requestMatchers(HttpMethod.GET, "/usuario/*").hasAuthority("COMUM")
                .requestMatchers(HttpMethod.POST).hasAuthority("ADMIN")
                .requestMatchers(HttpMethod.PUT).hasAuthority("ADMIN")
                .requestMatchers(HttpMethod.DELETE).hasAuthority("ADMIN")
                .anyRequest().authenticated()
            ).httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    //método para criptografar as senhas
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}