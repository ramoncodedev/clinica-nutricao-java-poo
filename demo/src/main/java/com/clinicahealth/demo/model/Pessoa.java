package com.clinicahealth.demo.model;



public class Pessoa {
   private String nome;
   private String cpf;
   private int idade;
   private char sexo;
   private int telefone;


    public Pessoa(){
        nome = "";
        cpf = "";
        idade = 12;
        sexo = 'm';
        telefone = 0;
    }

    public Pessoa(String nome, String cpf, int idade, char sexo, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public void cadastrar(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Telefone " + telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
