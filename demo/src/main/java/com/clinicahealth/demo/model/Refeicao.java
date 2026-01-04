package com.clinicahealth.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Refeicao {

    private String nome;
    private List<Alimento> alimentos;

    public Refeicao(String nome){
        this.nome = nome;
        this.alimentos = new ArrayList<>();
    }

    public void adicionarAlimentos(Alimento alimento){
        alimentos.add(alimento);
    }

    public String getNome() {
        return nome;
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }
}
