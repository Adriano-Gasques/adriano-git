package br.com.adriano.gerenciador;

import java.util.*;

public class TestaAluno {
    public static void main(String[] args) {
        Collection<String> alunos= new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Stepat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Sagio");
        alunos.add("Mauricio Souza");

        boolean estaMatriculado = alunos.contains("paulo Silveira");
        System.out.println(estaMatriculado);


        System.out.println(alunos);
        alunos.remove("Sergio Lopes");
        System.out.println(alunos);

        //for (String aluno : alunos){
        //    System.out.println(aluno);
        //}

        alunos.forEach(System.out::println);

        List<String> alunosEmLista = new ArrayList<>(alunos);




    }
}
