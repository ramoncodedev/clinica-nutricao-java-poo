package com.clinicahealth.demo.model;

public class Alimento {

    private String nomeDoAlimento;
    private double calorias;
    private double carboidrato;
    private double proteinas;
    private double gordura;

    public Alimento(){
        nomeDoAlimento = "";
        calorias = 0;
        carboidrato = 0;
        proteinas = 0;
        gordura = 0;
    }

    public Alimento(String nomeDoAlimento, double calorias, double carboidrato,
                    double proteinas, double gordura){

        this.nomeDoAlimento = nomeDoAlimento;
        this.calorias = calorias;
        this.carboidrato = carboidrato;
        this.proteinas = proteinas;
        this.gordura = gordura;

    }

    public void InfoAlimentos(){
        System.out.println("Nome do alimento: " + nomeDoAlimento);
        System.out.println("Calorias: " + calorias);
        System.out.println("Carboidrato: " + carboidrato);
        System.out.println("Proteinas: " + proteinas);
        System.out.println("Gordura: " + gordura);
    }

    public String getNomeDoAlimento() {
        return nomeDoAlimento;
    }

    public void setNomeDoAlimento(String nomeDoAlimento) {
        this.nomeDoAlimento = nomeDoAlimento;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(double carboidrato) {
        this.carboidrato = carboidrato;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getGordura() {
        return gordura;
    }

    public void setGordura(double gordura) {
        this.gordura = gordura;
    }
}
