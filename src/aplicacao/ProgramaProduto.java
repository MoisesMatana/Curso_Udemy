package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ProgramaProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.println("Preço do produto: ");
		double preco = sc.nextDouble();
		System.out.println("Quant do produto: ");
		int qtd = sc.nextInt();

		Produto produto = new Produto(nome, preco, qtd);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		System.out.println();

		System.out.println("Entre com o número de produtos a adicionar estoque: ");
		qtd = sc.nextInt();
		produto.adicionaProduto(qtd);

		System.out.println();
		System.out.println("Atualização dados do produto: " + produto);

		System.out.println("Entre com o número de produtos a remover estoque: ");
		qtd = sc.nextInt();
		produto.removeProduto(qtd);

		System.out.println();
		System.out.println("Atualização dados do produto: " + produto);

		sc.close();
	}

}
