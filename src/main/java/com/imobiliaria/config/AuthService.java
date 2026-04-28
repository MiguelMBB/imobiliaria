package com.imobiliaria.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.imobiliaria.exception.NaoEncontradoException;
import com.imobiliaria.model.Usuario;
import com.imobiliaria.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

//busca o usuário pelo email
@Service
@Transactional
public class AuthService implements UserDetailsService{
	
	@Autowired
	UsuarioRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repository.findByEmail(username)
				.orElseThrow(() -> new NaoEncontradoException("não encontrado"));
		return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());
	}

}
