package com.imobiliaria.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.validation.constraints.*;
import java.util.*;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String senha;
	private String telefone;
	private String email;
	
	//UM PRA MUITOS, UM CLIENTE PODE TER VÁRIOS IMÓVEIS
	@OneToMany(mappedBy = "cliente")
	@JsonManagedReference
	private Set<Imovel> imovel;
	
	//CONSTRUTORES
	public Cliente() {}
	
	public Cliente(Long idCliente, String nome, String senha, String telefone, String email, Set<Imovel> imovel) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.senha = senha;		
		this.telefone = telefone;
		this.email = email;
		this.imovel = imovel;
	}
	
	//GETTERS E SETTERS
	public Long getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSenha (String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setImovel(Set<Imovel> imovel){
		this.imovel = imovel;
	}
	
	public Set<Imovel> getImovel(){
		return imovel;
	}
}
