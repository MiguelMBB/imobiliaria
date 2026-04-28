package com.imobiliaria.controller;

import com.imobiliaria.model.Cliente;
import com.imobiliaria.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	private final ClienteService service;
	
	public ClienteController(ClienteService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Cliente> listar(){
		return service.listar();
	}
	
	@GetMapping(value = "/{idCliente}")
	public Cliente buscar(@PathVariable Long idCliente) {
		return service.buscar(idCliente);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
		return ResponseEntity.status(201).body(service.salvar(cliente));
    }
	
	@PutMapping(value = "/{idCliente}")
	public String atualizar(@PathVariable Long idCliente, @RequestBody Cliente cliente) {
		String response = service.editar(idCliente, cliente);
		return response;
	}
	
	@DeleteMapping("/{idCliente}")
    public ResponseEntity<Void> deletar(@PathVariable Long idCliente) {
        service.deletar(idCliente);
        return ResponseEntity.noContent().build();
	}
}
