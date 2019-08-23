package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class ProgramaPessoaAbstrata {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.print("Quantas pessoas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da pessoa: " + i);
			System.out.print("F�sica ou jur�dica? f/j: ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Renda anual: ");
			double renda = sc.nextDouble();
			if (tipo == 'f') {
				System.out.print("Valor de gastos com sa�de: ");
				double gastos = sc.nextDouble();
				list.add(new PessoaFisica(nome, renda, gastos));
			} else {
				System.out.print("N�mero de funcion�rios: ");
				int qtd = sc.nextInt();
				list.add(new PessoaJuridica(nome, renda, qtd));
			}
		}
		System.out.println();
		for (Pessoa pes : list) {
			System.out.println(pes);
		}
		sc.close();
	}
}