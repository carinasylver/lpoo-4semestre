package obj3Lista1.alunoDisciplina.controller;

import obj3Lista1.alunoDisciplina.model.Aluno;
import obj3Lista1.alunoDisciplina.model.Disciplina;

import java.util.Comparator;

public class AlunoDisciplinaController {
    public static void main(String[] args) {
        // a. Crie dois objetos de cada classe, e insira valores válidos em seus atributos;
        System.out.println("\na. Crie dois objetos de cada classe, e insira valores válidos em seus atributos;");
        Aluno aluno1 = new Aluno(
                1L,
                "maria",
                "silveira"
        );
        System.out.println(aluno1);

        Aluno aluno2 = new Aluno(
                2L,
                "catarina",
                "santos"
        );
        System.out.println(aluno2);


        Disciplina disciplina1 = new Disciplina(
                1L,
                "linguagem de programação orientada a objetos"
        );
        System.out.println(disciplina1);

        Disciplina disciplina2 = new Disciplina(
                2L,
                "metodologia cientifica"
        );
        System.out.println(disciplina2);

        //b. Matricule cada um dos alunos nas duas disciplinas.");
        aluno1.getDisciplinas().add(disciplina1);
        aluno1.getDisciplinas().add(disciplina2);
        aluno2.getDisciplinas().add(disciplina1);
        aluno2.getDisciplinas().add(disciplina2);

        System.out.println("\nc. Imprima o relatório de disciplinas por aluno, em ordem crescente, critério nome\n" +
                "da disciplina.");
        aluno1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        aluno2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));

        System.out.println("aluno: " + aluno1.getNome()+ " está matriculado em: " + aluno1.getDisciplinas());
        System.out.println("------------------------------------------------------");
    }
}