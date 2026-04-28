package com.imobiliaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.imobiliaria")
public class ImobiliariaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImobiliariaApplication.class, args);
    }
}