package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutoHeranca;
import entidades.ProdutoImportadoHeranca;
import entidades.ProdutoUsadoHeranca;

public class ProgramaProdutoHeranca {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat stf = new SimpleDateFormat("DD/MM/YYYY");

		List<ProdutoHeranca> list = new ArrayList<>();

		System.out.print("Quantos produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do produto: " + i);
			System.out.print("Comum, usado ou importado? C/U/I: ");
			char tipo = sc.next().charAt(0);
			System.out.print("Descrição: ");
			sc.nextLine();
			String descricao = sc.nextLine();
			System.out.print("Valor produto: ");
			double valor = sc.nextDouble();

			if (tipo == 'U') {
				System.out.print("Data de manufatura: ");
				System.out.print("Data (DD/MM/YY): ");
				Date dataManuf = stf.parse(sc.next());
				list.add(new ProdutoUsadoHeranca(descricao, valor, dataManuf));
			} else if (tipo == 'I') {
				System.out.print("Custo de alfândega: ");
				double custo = sc.nextDouble();
				list.add(new ProdutoImportadoHeranca(descricao, valor, custo));
			} else {
				list.add(new ProdutoHeranca(descricao, valor));
			}
		}

		System.out.println();
		System.out.print("ETIQUETA:");
		for (ProdutoHeranca produto : list) {
			System.out.println(produto);
		}

		sc.close();
	}
}
