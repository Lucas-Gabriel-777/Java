package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Tobias", 70,18));
        alunos.add(new Aluno("Uziel", 95,19));
        alunos.add(new Aluno("Urias", 60,18));
        alunos.add(new Aluno("Aminadab", 45,17));
        alunos.add(new Aluno("Joacaz", 58,20));

        List<Aluno> aprovados = alunos.stream().filter(a -> a.getnota() >=70)
            .sorted(Comparator.comparing(Aluno :: getnota).reversed().thenComparing(Aluno :: getidade))
            .collect(Collectors.toList());

        List<String> NomesAprovados = aprovados.stream().map(Aluno :: getnome).collect(Collectors.toList());

        System.out.println("Alunos aprovados");
        System.out.println(NomesAprovados);
    }
}