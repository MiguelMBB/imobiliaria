package com.imobiliaria.controller;

import com.imobiliaria.model.Imovel;
import com.imobiliaria.service.ImovelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/imoveis")
public class ImovelController {

    private final ImovelService service;

    public ImovelController(ImovelService service) {
        this.service = service;
    }

    @GetMapping
    public List<Imovel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Imovel buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public ResponseEntity<Imovel> salvar(@RequestBody Imovel imovel) {
        return ResponseEntity.status(201).body(service.salvar(imovel));
    }

    @PutMapping("/{id}")
    public Imovel atualizar(@PathVariable Long id, @RequestBody Imovel imovel) {
        imovel.setId(id);
        return service.salvar(imovel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}