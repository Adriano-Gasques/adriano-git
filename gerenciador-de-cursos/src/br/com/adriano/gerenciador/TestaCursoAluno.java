package br.com.adriano.gerenciador;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class TestaCursoAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

        javaColecoes.adiciona(new Aula("trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("todos os alunos matriculados");

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();

        while (iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }
        Vector<Aluno> vetor = new Vector<>();



//        for (Aluno a: javaColecoes.getAlunos()){
//            System.out.println(a);
//        }

//        javaColecoes.getAlunos().forEach(a -> {
//            System.out.println(a);
//        });

//        System.out.println("O aluno" +a1+ " está matriculado?");
//        System.out.println(javaColecoes.estaMatriculado(a1));
//
        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("O turine" +a1+ " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1é igual ao Turini?");
        System.out.println(a1.equals(turini));

        System.out.println(a1.hashCode() == turini.hashCode());




    }
}
