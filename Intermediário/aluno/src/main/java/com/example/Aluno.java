package com.example;

public class Aluno {   
    String nome;
    double nota;
    int idade;

    public Aluno (String nome, double nota, int idade){
        this.idade = idade;
        this.nome = nome;
        this.nota = nota; } 
    
    public String getnome(){
        return nome;}       

    public double getnota(){
        return nota;}

    public int getidade(){
        return idade;}

    
}