package org.contadores;

public class Contador {

    private int valor;
    private String nome;

    public Contador(String nome){
        valor = 0;
        this.nome = nome;
    }

    public void Contar(){
        valor++;
    }

    @Override
    public String toString() {
        return nome + " = " + valor;
    }

}
