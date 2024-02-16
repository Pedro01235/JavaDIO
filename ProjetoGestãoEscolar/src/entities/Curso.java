package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Curso {

	 private String nome;
	 private String codigo;
	 private Professor professorResponsavel;
	 private List<Aluno> alunosMatriculados;

	
	 public Curso(String nome, String codigo) {
	        this.nome = nome;
	        this.codigo = codigo;
	        this.alunosMatriculados = new ArrayList<>();
	    }
	
	    public String getNome() { return nome; }
	    public void setNome(String nome) { this.nome = nome; }

	    public String getCodigo() { return codigo; }
	    public void setCodigo(String codigo) { this.codigo = codigo; }

	    public Professor getProfessorResponsavel() { return professorResponsavel; }
	    public void setProfessorResponsavel(Professor professorResponsavel) {
	        this.professorResponsavel = professorResponsavel;
	    }

	    public List<Aluno> getAlunosMatriculados() { return alunosMatriculados; }

	    public void matricularAluno(Aluno aluno) {
	        alunosMatriculados.add(aluno);
	    }

	    @Override
	    public String toString() {
	        return "Curso{" +
	                "nome='" + nome + '\'' +
	                ", codigo='" + codigo + '\'' +
	                ", professorResponsavel=" + (professorResponsavel != null ? professorResponsavel.getNome() : "Nenhum") +
	                ", alunosMatriculados=" + alunosMatriculados.stream().map(Aluno::getNome).collect(Collectors.joining(", ")) +
	                '}';
	    }
	}
