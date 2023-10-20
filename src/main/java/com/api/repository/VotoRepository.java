package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Voto;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {
    
}
