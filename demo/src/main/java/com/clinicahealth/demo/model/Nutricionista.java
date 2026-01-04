package com.clinicahealth.demo.model;

public class Nutricionista extends Pessoa {

  private String numeroDaCrn;
  private String especialidade;


    public Nutricionista(){
        super();
        numeroDaCrn = "";
        especialidade = "";
    }

    public Nutricionista(String nome, String cpf, int idade, char sexo, int telefone, String numeroDaCrn, String especialidade){
        super(nome, cpf,idade, sexo, telefone);
        this.numeroDaCrn = numeroDaCrn;
        this.especialidade = especialidade;

    }
    @Override
    public void cadastrar(){
        super.cadastrar();
        System.out.println("Numero da CRN: " + numeroDaCrn);
        System.out.println("Especialidade: " + especialidade);
    }

    public String getNumeroDaCrn() {
        return numeroDaCrn;
    }

    public void setNumeroDaCrn(String numeroDaCrn) {
        this.numeroDaCrn = numeroDaCrn;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
