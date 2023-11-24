package application;

import desafioDioBanco.Cliente;
import desafioDioBanco.Conta;
import desafioDioBanco.ContaCorrente;
import desafioDioBanco.ContaPoupanca;

public class Main {

	public static void main(String[] args) {


		Cliente cliente = new Cliente();
		cliente.setNome("Pedro");
		
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
	
	
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
