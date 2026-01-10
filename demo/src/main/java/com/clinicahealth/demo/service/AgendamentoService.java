package com.clinicahealth.demo.service;

import com.clinicahealth.demo.model.Consulta;
import com.clinicahealth.demo.model.Paciente;
import com.clinicahealth.demo.repository.ConsultaRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgendamentoService {

    private ConsultaRepository repo = new ConsultaRepository();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH: mm");


    public void agendar(Scanner entrada, Paciente paciente){
        System.out.println("--- NOVO AGENDAMENTO ---");
        System.out.println("Paciente: " + paciente.getNome());

        System.out.println("Digite a data e hora (Ex: 10/05/2026 14:30):");
        String dataTexto = entrada.nextLine();

        LocalDateTime dataHora = LocalDateTime.parse(dataTexto, formato);

        System.out.println("Especialidade");
        String esp = entrada.nextLine();

        Consulta novaConsulta = new Consulta(paciente, dataHora, esp);
        repo.salvar(novaConsulta);

        System.out.println("Consulta agendada com sucesso!");

    }
}
