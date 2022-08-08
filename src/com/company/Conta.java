package com.company;

import java.util.Objects;

public class Conta implements Comparable<Conta> {

    private Pessoa dono;
    private double saldo;
    private int nConta;
    private int prioridade;

    public Conta(int nConta, Pessoa dono, double saldo) {
        if (2022 - dono.getAnoNascimento() >= 18){
            this.nConta = nConta;
            this.dono = dono;
            this.saldo = saldo;
            setPrioridade(dono.getAnoNascimento());
        }
        else{
            System.out.println("Idade insuficiente, criação da conta falhou");
        }
    }

    public void deposito(double valor){
        setSaldo(getSaldo() + valor);
    }

    public void saque(double valor){
        if (getSaldo() < valor){
            System.out.println("Saque não pode ser realizado: saldo insuficiente");
            return;
        }

        setSaldo(getSaldo() - valor);
    }

    @Override
    public String toString() {
        return "{" +
                "Numero da conta = " + nConta +
                ", Dono = '" + dono.getNome() + '\'' +
                ", Saldo = " + saldo +
                ", Prioridade = " + prioridade +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return nConta == conta.nConta && dono.equals(conta.dono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nConta, dono);
    }

    @Override
    public int compareTo(Conta o) {
        if (this.prioridade > o.getPrioridade()){
            return 1;
        } else if (this.prioridade < o.getPrioridade()){
            return -1;
        }

        return 0;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int anoNascimento) {
        if (2022 - anoNascimento >= 65){
            this.prioridade = 1;
        }
        else
            this.prioridade = 2;
    }


}
