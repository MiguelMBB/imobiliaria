package com.imobiliaria.service;

import com.imobiliaria.exception.NaoEncontradoException;
import com.imobiliaria.model.Cliente;

import org.springframework.stereotype.Service;
import com.imobiliaria.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {
	
	private final ClienteRepository repository;
	
	public ClienteService(ClienteRepository repository) {
		this.repository = repository;
	}
	
	public List<Cliente> listar(){
		return repository.findAll();
	}
	
	public Cliente buscar(Long idCliente) {
        return repository.findById(idCliente)
                .orElseThrow(() -> new NaoEncontradoException("Cliente não encontrado"));
    }
	
	public Cliente salvar(Cliente cliente) {
		return repository.save(cliente);
	}
	
	public String editar(Long idCliente, Cliente cliente) {
		Cliente response = repository.findById(idCliente)
                .orElseThrow(() -> new NaoEncontradoException("Cliente não encontrado"));
		response.setNome(cliente.getNome());
		response.setSenha(cliente.getSenha());
		response.setTelefone(cliente.getTelefone());
		response.setEmail(cliente.getEmail());
		response.setImovel(cliente.getImovel());
		repository.save(response);
		return "Usuário atualizado";
	}
	
	public void deletar(Long idCliente) {
		repository.deleteById(idCliente);
	}

}
