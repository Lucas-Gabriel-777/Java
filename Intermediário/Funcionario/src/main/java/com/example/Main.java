package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Uzias", 32, "Administrador", 1700));
        funcionarios.add(new Funcionario("Abadias", 21, "Engenheiro", 3000));
        funcionarios.add(new Funcionario("Gamaliel", 53, "Conselheiro", 2500));
        funcionarios.add(new Funcionario("Joacaz", 36, "Artista", 3600));
        funcionarios.add(new Funcionario("Zofar", 39, "Arquiteto", 5000));

        System.out.println("Funcionarios por cargo: ");
        Map<String, List<Funcionario>> cargofunc = funcionarios.stream()
            .collect(Collectors.groupingBy(Funcionario :: getCargo));

        cargofunc.forEach((cargo, lista) -> {System.out.println(cargofunc);});
            
        System.out.println("Funcionarios: ");
        List<String> nomefunc = funcionarios.stream().map(Funcionario :: getNome).collect(Collectors.toList());
        
        nomefunc.forEach(System.out::println);

        System.out.println("Media salarial: ");
        Map<String, Double> mediasalarial = funcionarios.stream()
        .collect(Collectors.groupingBy(Funcionario :: getCargo, Collectors.averagingDouble(Funcionario :: getSalario)));

        System.out.println(mediasalarial);
    }
}