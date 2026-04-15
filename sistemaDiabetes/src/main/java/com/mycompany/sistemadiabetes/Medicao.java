package com.mycompany.sistemadiabetes;

  
    public class Medicao {

    public String data;
    public double glicose;
    public String tipo;
    public String observacao;

    public Medicao(String data, double glicose, String tipo, String observacao) {
        this.data = data;
        this.glicose = glicose;
        this.tipo = tipo;
        this.observacao = observacao;
    }

    public void exibir() {
        System.out.println("Data: " + data);
        System.out.println("Glicose: " + glicose);
        System.out.println("Tipo: " + tipo);
        System.out.println("Obs: " + observacao);
        System.out.println("---------------------");
    }
}

