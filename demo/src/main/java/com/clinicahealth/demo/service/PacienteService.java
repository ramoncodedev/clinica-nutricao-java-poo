package com.clinicahealth.demo.service;

import com.clinicahealth.demo.model.Paciente;
import com.clinicahealth.demo.repository.PacienteRepository;

import java.util.List;
import java.util.Scanner;

public class PacienteService {

    private PacienteRepository repository = new PacienteRepository();

    public void executarProcesso(Scanner leitor){

        System.out.println("--- CADASTRAR PACIENTE ---");
        leitor.nextLine();

        System.out.println("Nome do Paciente: ");
        String nome = leitor.nextLine();

        System.out.println("Idade do Paciente: ");
        String idade = leitor.nextLine();

        System.out.println("CPF do Paciente: ");
        String cpf = leitor.nextLine();

        System.out.println("Telefone do Paciente: ");
        String telefone = leitor.nextLine();

        System.out.println("Peso do Paciente: ");
        double peso = leitor.nextDouble();

        System.out.println("Altura do Paciente: ");
        double altura = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Endereço do Paciente:");
        String endereco = leitor.nextLine();

        System.out.println("Estado civil do Paciente: ");
        String estadoCivil = leitor.nextLine();

        System.out.println("Profissão do Paciente: ");
        String profissao = leitor.nextLine();


        Paciente novoPaciente = new Paciente(nome, idade, cpf, telefone, peso, altura, endereco, estadoCivil, profissao);

        repository.salvar(novoPaciente);

        System.out.println("Paciente " + nome + " Salvo com sucesso");

    }

    public void listarTodos(){
        List<Paciente> bancoDeDados = repository.listarTodos();

        if (bancoDeDados.isEmpty()){
            System.out.println("Nenhum paciente cadastrado até o momento");
            return;

        }

        System.out.println("Lista de Pacientes cadastrado:");

        for (Paciente p : bancoDeDados){
            System.out.println("Nome: " + p.getNome() + " | CPF: " + p.getCpf());
        }

    }






}


// for para verificar minha lista
// apos isso sé não tiver vazia buscar pelo nome
