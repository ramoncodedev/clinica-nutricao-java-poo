package com.clinicahealth.demo.repository;

import com.clinicahealth.demo.model.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PacienteRepository {

    private List<Paciente> bancoDeDados = new ArrayList<>();

    public void salvar(Paciente paciente){
        bancoDeDados.add(paciente);
    }

    public List<Paciente> listarTodos(){
        return bancoDeDados;
    }

    public Paciente buscarPorCpf(String cpf){
        for (Paciente p : bancoDeDados){
            if (p.getCpf().equals(cpf)){
                return p;
            }
        }
        return null;
    }


}
