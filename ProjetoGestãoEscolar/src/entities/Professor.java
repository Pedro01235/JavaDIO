package entities;

public class Professor extends Pessoa{

    private String especialidade;
	
    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    @Override
    public String seApresentar() {
        return "Olá, sou o professor " + getNome() + " e minha especialidade é " + especialidade + ".";
    }
}

