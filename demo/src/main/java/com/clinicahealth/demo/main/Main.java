package com.clinicahealth.demo.main;


import com.clinicahealth.demo.service.AgendamentoService;
import com.clinicahealth.demo.service.PacienteService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PacienteService paciente = new PacienteService();


        AgendamentoService agendamento = new AgendamentoService();
        Scanner leitor = new Scanner(System.in);

        boolean executando = true;

        while (executando){
            System.out.println("\n ----- CLINICA HEALTH ----");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Listar Pacientes");
            System.out.println("3. Agendamento");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    paciente.executarProcesso(leitor);
                    break;
                case 2:
                    paciente.listarTodos();
                    break;
                case 3:
                    agendamento.agendar();
                    break;
                    case 0:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        }
        leitor.close();


    }
}
