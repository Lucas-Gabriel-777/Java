package com.mycompany.animal;
public class cachorro extends Animal {
    public cachorro(String nome){
        super(nome);
    }
    
    @Override
    public void fazerSom(){
        System.out.println("Cachorro "+getnome()+": AU AU!");
    }
}