package application;

import entities.Aluno;
import entities.Curso;
import entities.Professor;

public class Main {

	public static void main(String[] args) {

		Professor professor1 = new Professor("Carlos Silva", 40, "Matemática");
		Professor professor2 = new Professor("Ana Paula", 35, "Literatura");


		Aluno aluno1 = new Aluno("João Pedro", 20, "A12345678");
		Aluno aluno2 = new Aluno("Maria Clara", 19, "A87654321");
		Aluno aluno3 = new Aluno("Clara", 20, "A96589321");


		Curso cursoMatematica = new Curso("Matemática", "MAT101");
		cursoMatematica.setProfessorResponsavel(professor1);

		Curso cursoLiteratura = new Curso("Literatura", "LIT202");
		cursoLiteratura.setProfessorResponsavel(professor2);


		cursoMatematica.matricularAluno(aluno1);
		cursoLiteratura.matricularAluno(aluno2);
		cursoMatematica.matricularAluno(aluno3);


		System.out.println("=== Sistema de Gestão Escolar ===");
		System.out.println(cursoMatematica);
		System.out.println(cursoLiteratura);

		System.out.println(aluno1.seApresentar());
		System.out.println(professor1.seApresentar());
	}
}
