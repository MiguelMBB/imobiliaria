package com.imobiliaria.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;
    private String descricao;

    @NotNull
    private Double preco;
    private String endereco;
    private String status;
    
    
    //MUITOS PARA UM, CADA IMÓVEL PERTENCE A UM CLIENTE, UM CLIENTE PODE TER VÁRIOS IMÓVEIS
    @ManyToOne
    @JsonBackReference
	@JoinColumn(name = "idCliente", nullable = true) //IDCLIENTE PODE SER NULL JÁ QUE UM IMÓVEL PODE NÃO POSSUIR NENHUM PROPRIETÁRIO
    private Cliente cliente;
    
    //CONSTRUTORES
    public Imovel() {}
    
    public Imovel(Long id, String descricao, Double preco, String endereco, String status, Cliente cliente) {
    	this.id = id;
    	this.descricao = descricao;
    	this.preco = preco;
    	this.endereco = endereco;
    	this.status = status; //VENDIDO OU DISPONÍVEL, APENAS OS IMOVEIS VENDIDOS POSSUEM IDCLIENTE
    	this.cliente = cliente;
    }

    // GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setCliente(Cliente cliente) {
    	this.cliente = cliente;
    }
    
    public Cliente getCliente() {
    	return cliente;
    }
}