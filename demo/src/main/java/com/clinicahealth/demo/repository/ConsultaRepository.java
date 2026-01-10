package com.clinicahealth.demo.repository;

import com.clinicahealth.demo.model.Consulta;

import java.util.ArrayList;
import java.util.List;

public class ConsultaRepository {

    private List<Consulta> consultas = new ArrayList<>();

    public void salvar(Consulta consulta){
        consultas.add(consulta);
    }

    public List<Consulta> listarTodas(){
        return consultas;
    }
}
