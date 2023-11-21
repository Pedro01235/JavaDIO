package application;

import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double saldo;
		int numero;
		String agencia, NomeCliente;

		System.out.println("Digite seu Nome: ");
		NomeCliente = sc.nextLine();

		System.out.println("Digite o número da conta: ");
		numero = sc.nextInt();

		System.out.println("Digite a Agência: ");
		agencia = sc.next();

		System.out.println("Digite seu saldo: ");
		saldo = sc.nextDouble();

		System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, " + "sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo é " + saldo + ", " + "já está disponível para saque.");

		sc.close();
	}

}
