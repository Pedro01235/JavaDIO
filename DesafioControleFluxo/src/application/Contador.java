package application;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		int parametroUm, parametroDois;

		System.out.println("Digite o primeiro parâmetro: ");
		parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro: ");
		parametroDois = terminal.nextInt();

		try {
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");

		}
		terminal.close();

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}

		int cont = parametroDois - parametroUm;
		for (int i = 1; i <= cont; i++) {
			System.out.println("imprimindo número " + i);
		}
	}

}
