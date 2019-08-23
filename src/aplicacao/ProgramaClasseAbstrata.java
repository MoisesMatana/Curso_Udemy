package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.ContaHeranca;
import entidades.ContaNegocioHeranca;
import entidades.ContaPoupancaHeranca;

public class ProgramaClasseAbstrata {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ContaHeranca> list = new ArrayList<>();

		list.add(new ContaPoupancaHeranca(1001, "Alex", 500, 0.01));
		list.add(new ContaNegocioHeranca(1002, "Moisés", 1000, 500));
		list.add(new ContaPoupancaHeranca(300, "Bob", 100, 0.05));
		list.add(new ContaNegocioHeranca(1005, "José", 1200, 600));

		double soma = 0;
		for (ContaHeranca contaHeranca : list) {
			soma = soma + contaHeranca.getSaldo();
		}

		System.out.printf("Saldo total: %.2f%n", soma);

		for (ContaHeranca contaHeranca : list) {
			contaHeranca.deposito(10);
		}

		System.out.println();
		for (ContaHeranca contaHeranca : list) {
			System.out.println("Conta: "+contaHeranca.getNumero());
			System.out.println("Titular: "+contaHeranca.getTitular());
			System.out.printf("Saldo: %.2f%n", contaHeranca.getSaldo());
			System.out.println();
		}
		sc.close();
	}
}