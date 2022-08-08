package com.company;

import java.util.PriorityQueue;
import java.util.Set;


public class FilaPrioridade<Conta> extends PriorityQueue {

    public boolean add(com.company.Conta c, Set<Conta> contas) {
        if (contas.contains(c)){
            return super.add(c);
        }
        return false;
    }
}
