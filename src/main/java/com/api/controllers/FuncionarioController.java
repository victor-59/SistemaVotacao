package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.model.Funcionario;
import com.api.service.FuncionarioService;


public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/funcioarios")
    public List<Funcionario> listarFuncionario(){
    	return funcionarioService.listarFuncionarios();
    }
    
    }
