package com.company;

public class Pessoa {

    private String nome;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "{" +
                "Nome= '" + nome + '\'' +
                ", AnoNascimento = " + anoNascimento +
                '}';
    }
}
