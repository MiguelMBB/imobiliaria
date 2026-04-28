package com.imobiliaria.repository;

import com.imobiliaria.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
