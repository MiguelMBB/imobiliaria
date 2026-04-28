package com.imobiliaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imobiliaria.model.Imovel;


public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}