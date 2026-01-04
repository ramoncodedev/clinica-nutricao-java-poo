package com.clinicahealth.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paciente {

    private String nome;
    private String idade;
    private String cpf;
    private String telefone;
    private double peso;
    private double altura;
    private String endereco;
    private String estadoCivil;
    private String profissao;


    public Paciente(){
        nome = "";
        idade = "";
        cpf = "";
        telefone = "";
        peso = 0;
        altura = 0;
        endereco = "";
        estadoCivil = "";
        profissao = "";

    }

    public Paciente(String nome, String cpf, String idade,String telefone, double peso, double altura,
                   String endereco, String estadoCivil, String profissao){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.peso = peso;
        this.altura = altura;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


}


