package com.application.contabanc;
public class ContaCorrente {
    static double saldo;
    
    public static void depositar(double valor){
         if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    
    public static void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            
        } else {
            System.out.println("Saldo insuficiente ou valor invalido.");
        }
    }
}
