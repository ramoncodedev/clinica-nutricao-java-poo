package com.clinicahealth.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Dieta {

    private List<Refeicao> refeicoes;

    public Dieta(){
        this.refeicoes = new ArrayList<>();
    }

    public void adicionarRfeicao(Refeicao refeicao){
        refeicoes.add(refeicao);
    }

    public List<Refeicao> getRefeicoes(){
        return refeicoes;
    }
}
