package com.api.model;

import jakarta.persistence.ManyToOne;

public class Voto {
    private boolean sim;
    @ManyToOne
    private Funcionario funcionario;

    
    public Voto(boolean sim, Funcionario funcionario) {
        this.sim = sim;
        this.funcionario = funcionario;
    }

    
    public boolean isSim() {
        return sim;
    }

    public void setSim(boolean sim) {
        this.sim = sim;
    }

    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    
}
