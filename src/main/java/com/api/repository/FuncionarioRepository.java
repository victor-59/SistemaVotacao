package com.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.model.Funcionario;



	@Repository
	public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	    
	}


