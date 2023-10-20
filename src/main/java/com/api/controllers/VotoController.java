package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.model.Voto;
import com.api.service.VotoService;

@RestController
@RequestMapping("/votos")
public class VotoController {
    @Autowired
    private VotoService votoService;

    @GetMapping
    public List<Voto> listarVotos() {
        return votoService.listarVotos();
    }

    @PostMapping("/votar")
    public Voto votar(@RequestBody Voto voto) {
        
        return votoService.receberVoto(voto);
    }
}