package br.com.adriano.gerenciador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args){
        String aula1 = "conhecendo mais de listas";
        String aula2 = "modelando classe Aula";
        String aula3 = "trabalhando com cursos e sets";

        ArrayList <String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas){
            System.out.println("Aula: " + aulas);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + aulas);

        for(int i=0; i < aulas.size(); i++){
            System.out.println("Aula: " + aulas.get(i));
        }

        aulas.forEach(aula -> {System.out.println("percorrendo: " + aula);
        });

        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}
