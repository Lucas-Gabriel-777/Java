package com.application.contabanc;

public class Contabanc extends ContaCorrente{
    
    
    public static void main(String[] args) {
        
        System.out.println("Saldo atual"+saldo);
        Contabanc.depositar(500.0);
        System.out.println("Deposito de 500 R$");
        System.out.println("Saldo atual:"+saldo);
        Contabanc.sacar(200.0);
        System.out.println("Saque de 200 R$");
        System.out.println("Saldo atual"+saldo);
        Contabanc.sacar(1500.0);
        System.out.println("Saque de 1500 R$");
        System.out.println("Saldo atual"+saldo);
        
    }
}
