package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.Voto;
import com.api.repository.VotoRepository;

@Service
public class VotoService {
    @Autowired
    private VotoRepository votoRepository;

    public List<Voto> listarVotos() {
        return votoRepository.findAll();
    }

    public Voto receberVoto(Voto voto) {
        
        return votoRepository.save(voto);
    }
}
