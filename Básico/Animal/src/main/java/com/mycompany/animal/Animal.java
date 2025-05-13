package com.mycompany.animal;
public abstract class Animal {
    private String nome;
    
    public Animal (String nome){
        this.nome = nome;
    }
    public void fazerSom(){}
    
    public String getnome(){
        return nome;
    }
    public static void main(String[] args) {
        Animal gato = new Gato("Josias");
        Animal Cachorro = new cachorro("Maciel");
        
        gato.fazerSom();
        Cachorro.fazerSom();
    }
}