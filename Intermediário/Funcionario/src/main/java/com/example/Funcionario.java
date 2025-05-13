package com.example;

public class Funcionario extends Pessoa{
    String cargo;
    double salario;
    public Funcionario (String nome, int idade, String cargo, double salario){
        super(nome,idade);
        this.cargo = cargo;
        this.salario = salario;}

    public String getNome(){
        return nome;}

    public int getIdade(){
        return idade;}

    public String getCargo(){
        return cargo;}

    public double getSalario(){
        return salario;}
    
    public String toString(){
        return "Nome: "+nome;
    }
}
