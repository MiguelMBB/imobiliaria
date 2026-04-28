package com.imobiliaria.service;

import com.imobiliaria.exception.NaoEncontradoException;
import com.imobiliaria.model.Imovel;
import com.imobiliaria.repository.ImovelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService {

    private final ImovelRepository repository;

    public ImovelService(ImovelRepository repository) {
        this.repository = repository;
    }

    public List<Imovel> listar() {
        return repository.findAll();
    }

    public Imovel salvar(Imovel imovel) {
        return repository.save(imovel);
    }
    
    public String editar(Long id, Imovel imovel) {
    	Imovel response = repository.findById(id)
    			.orElseThrow(() -> new NaoEncontradoException("Imóvel não encontrado"));;
    	response.setDescricao(imovel.getDescricao());
    	response.setEndereco(imovel.getEndereco());
    	response.setPreco(imovel.getPreco());
    	response.setStatus(imovel.getStatus());
    	response.setTitulo(imovel.getTitulo());
    	response.setCliente(imovel.getCliente());
    	repository.save(response);
    	return "Dados atualizados";
    }

    public Imovel buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NaoEncontradoException("Imóvel não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}