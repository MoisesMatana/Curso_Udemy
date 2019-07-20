package moises.programador;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class VetoresII {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite n: ");
		int n = sc.nextInt();
		Produto[] vet = new Produto[n];
		int i;
		for (i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite o valor: ");
			Double preco = sc.nextDouble();
			System.out.println("Digite a quant: ");
			int qtd = sc.nextInt();
			vet[i] = new Produto(nome, preco, qtd);
		}
		double soma = 0;
		for (i = 0; i < n; i++) {
			soma = soma + vet[i].getPreco();
			System.out.println();
			System.out.println("Produto: " + vet[i].getNome());
			System.out.println("Valor: " + vet[i].getPreco());
			System.out.println("Qtd: " + vet[i].getQtd());
			System.out.println();
		}

		double media = soma / n;

		System.out.println("Média: " + media);

		sc.close();
	}

}
