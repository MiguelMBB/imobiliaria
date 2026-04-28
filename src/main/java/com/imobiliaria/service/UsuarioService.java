package com.imobiliaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.imobiliaria.exception.NaoEncontradoException;
import com.imobiliaria.model.Usuario;
import com.imobiliaria.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	public List<Usuario> procuraTodos(){
		return repository.findAll();
	}
	public Usuario procurarPorId(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new NaoEncontradoException("ID Inválido! Usuário não encontrado"));
	}
	public String editarUsuario(Integer id, Usuario usuario) {
		Usuario response = repository.findById(id).get();
		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setSenha(usuario.getSenha());
		repository.save(response);
		return "Usuário salvo com sucesso";
	}
	
	public String adicionarUsuario(Usuario usuario) {
		usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
		repository.save(usuario);
		return "Usuário adicionado com sucesso!";
	}
	public void excluirUsuario(Integer id) {
		Usuario response = repository.findById(id).get();
		repository.delete(response);
	}
}
