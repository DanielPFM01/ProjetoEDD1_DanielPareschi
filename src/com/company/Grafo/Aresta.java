package com.company.Grafo;

public class Aresta<TIPO> {
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;

    public Aresta(Vertice<TIPO> inicio, Vertice<TIPO> fim){
        if (inicio.getDado() != fim.getDado()){
            this.inicio = inicio;
            this.fim = fim;
        }
    }

    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    public Vertice<TIPO> getFim() {
        return fim;
    }

    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }
}