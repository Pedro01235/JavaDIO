package entities;

public class Aluno extends Pessoa {

	private String matricula;
	
	public Aluno(String nome, int idade, String matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}

    @Override
    public String seApresentar() {
        return "Olá, sou o aluno " + getNome() + " e minha matrícula é " + matricula + ".";
    }
}
	

