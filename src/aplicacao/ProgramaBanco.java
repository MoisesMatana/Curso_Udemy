package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class ProgramaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Número da conta: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do titular: ");
		String nome = sc.nextLine();
		System.out.print("Fazer depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Informe o primeiro depósito: ");
			double saldo = sc.nextDouble();
			conta = new Conta(num, nome, saldo);
		} else {
			conta = new Conta(num, nome);
		}

		System.out.println();
		System.out.println("Atualização dados conta: ");
		System.out.println(conta);
		System.out.println();

		System.out.print("Valor do saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);

		System.out.println();
		System.out.println("Atualização dados conta: ");
		System.out.println(conta);
		System.out.println();

		System.out.print("Valor do deposito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);

		System.out.println();
		System.out.println("Atualização dados conta: ");
		System.out.println(conta);

		sc.close();
	}
}