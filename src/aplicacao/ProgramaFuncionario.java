package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.println("Nome do funcionario: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Salário bruto: ");
		funcionario.salBruto = sc.nextDouble();
		System.out.println("Taxa de impostos: ");
		funcionario.taxa = sc.nextDouble();

		double liq = funcionario.salLiquido();

		System.out.println("Dados funcionário: ");
		System.out.println("Nome: " + funcionario.nome);
		System.out.printf("Salário bruto: %.2f%n", funcionario.salBruto);
		System.out.printf("Salário líquido: %.2f%n", liq);
		System.out.println();

		System.out.println("Porcentagem de aumento: ");
		double aumento = sc.nextDouble();

		int novo = (int) funcionario.aumentoSalario(aumento);
		liq = funcionario.salLiquido();
		System.out.println();
		System.out.println("Novo salário bruto: " + novo);
		System.out.printf("Novo salário líquido: %.2f%n", liq);
		sc.close();
	}

}
