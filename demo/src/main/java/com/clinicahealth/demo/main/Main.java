package com.clinicahealth.demo.main;


import com.clinicahealth.demo.model.Paciente;
import com.clinicahealth.demo.service.AgendamentoService;
import com.clinicahealth.demo.service.PacienteService;

import java.util.List;
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
                    List<Paciente> pacientes = paciente.listarTodos();
                    if (pacientes.isEmpty()){
                        System.out.println("Nenhum paciente cadastrado. Cadastre um paciente primeiro.");
                    }else {
                        System.out.println("Digite o CPF do paciente para agendar");
                        leitor.nextLine();
                        String cpf = leitor.nextLine();
                        Paciente pacienteEncontrado = paciente.buscarPorCpf(cpf);
                        if (pacienteEncontrado != null){
                            agendamento.agendar(leitor, pacienteEncontrado);
                        } else {
                            System.out.println("Paciente não encontrado");
                        }
                    }
                    break;
                    case 0:
                    executando = false;
                        System.out.println("Encerrando sistema....");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        }
        leitor.close();


    }
}
