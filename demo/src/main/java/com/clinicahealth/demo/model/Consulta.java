package com.clinicahealth.demo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {

    private Paciente paciente;
    private LocalDateTime dataHora;
    private String especialidade;

    public Consulta(Paciente paciente, LocalDateTime dataHora, String especialidade){
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.especialidade = especialidade;

    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Paciente: " + paciente.getNome() + " | Data: " + dataHora.format(fmt) + " | Especialidade: " + especialidade;
    }

}
