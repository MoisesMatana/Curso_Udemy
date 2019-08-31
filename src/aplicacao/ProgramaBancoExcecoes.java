package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaExcecao;

public class ProgramaBancoExcecoes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número da conta: ");
		String num = sc.nextLine();
		System.out.print("Nome do titular: ");
		String nome = sc.nextLine();
		System.out.print("Informe o saldo: ");
		double saldo = sc.nextDouble();
		System.out.print("Informe o limite de saque: ");
		double limiteSaque = sc.nextDouble();
		ContaExcecao conta = new ContaExcecao(num, nome, saldo, limiteSaque);

		System.out.println();
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Informe o valor do saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.print("Informe o valor do depósito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		conta = new ContaExcecao(num, nome, saldo, limiteSaque);
		
		System.out.println();
		System.out.println(conta);
		double saldoAtual;
		saldoAtual = conta.getSaldo() - saque + deposito;
		System.out.println("Saldo atual: R$ "+ String.format("%.2f", saldoAtual)); 
		System.out.println("Total de saques: R$ "+ String.format("%.2f", conta.saque(saque))); 
		System.out.println("Total de depósitos: R$ "+ String.format("%.2f", conta.deposito(deposito)));
		System.out.println();
		sc.close();
	}
}