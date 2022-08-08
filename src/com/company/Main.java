package com.company;

import com.company.Grafo.Grafo;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // CONJUNTOS

        Set<Conta> contas = new HashSet<>();

        Pessoa p1 = new Pessoa("Daniel", 2002);
        Pessoa p2 = new Pessoa("Pedro", 1999);
        Pessoa p3 = new Pessoa("Lucas", 2012);

        Conta conta1 = new Conta(4, p1, 50.00);
        Conta conta2 = new Conta(1, p2, 80.00);
        Conta conta3 = new Conta(8, p3, 986.00);

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        System.out.println("\n------ Contas antes das alterações ------");
        System.out.println(contas);

        conta2.deposito(561.00);
        conta1.saque(587.50);
        conta3.saque(32.44);

        System.out.println("\n------ Contas depois das alterações ------");
        System.out.println(contas);

        contas.remove(conta2);
        System.out.println("\n------ Contas após remoção ------");
        System.out.println(contas);

        // FILA DE PRIORIDADE

        FilaPrioridade<Conta> filaAtendimento = new FilaPrioridade<>();

        filaAtendimento.add(conta1, contas);
        filaAtendimento.add(conta2, contas);
        filaAtendimento.add(conta3, contas);
        filaAtendimento.remove(conta3);

        System.out.println("\n------ Fila de Atendimento ------");
        System.out.println(filaAtendimento);

        // GRAFO

        System.out.println("\n------ Grafo ------");

        Grafo<Object> grafo = new Grafo<>();

        grafo.adicionarVertice(conta1, contas);
        grafo.adicionarVertice(p1);
        grafo.adicionarAresta(conta1, p1);
        grafo.buscaEmLargura();
    }
}
