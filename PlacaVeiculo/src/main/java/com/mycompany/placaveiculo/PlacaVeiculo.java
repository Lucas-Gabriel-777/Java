package com.mycompany.placaveiculo;
import java.util.Scanner;

public class PlacaVeiculo {
    public String codigoPlaca;
    
    public void vfp(){
        boolean validacao = codigoPlaca.matches("[A-Z]{3}-\\d{4}");
        if (validacao == false){
            System.out.println("Placa: '"+codigoPlaca+"' fora do padrao [AAA-9999]");
        }
        else if (validacao == true){
            System.out.println("Placa: '"+codigoPlaca+"' dentro do padrao [AAA-9999], placa validada com sucesso!");
        }      
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PlacaVeiculo placa = new PlacaVeiculo();
        
        System.out.println("Digite a placa a ser validada no padrao [AAA-9999](LETRAS MAIUSCULAS E HIFEN):");
        placa.codigoPlaca = scan.nextLine();
        
        placa.vfp();
        scan.close();
    }
}