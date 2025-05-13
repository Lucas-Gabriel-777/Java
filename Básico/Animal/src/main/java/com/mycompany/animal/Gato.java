package com.mycompany.animal;
public class Gato extends Animal{
    public Gato (String nome){
        super(nome);
    }
    @Override
    public void fazerSom(){
        System.out.println("Gato "+getnome()+": MIAU MIAU!");
    } 
}