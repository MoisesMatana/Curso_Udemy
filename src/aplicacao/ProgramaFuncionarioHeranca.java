package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.FuncionarioHeranca;
import entidades.FuncionarioTerceHeranca;

public class ProgramaFuncionarioHeranca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<FuncionarioHeranca> list = new ArrayList<>();

		System.out.print("Quantos funcionários: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário: " + i);
			System.out.print("Terceirizado ou não? S/N: ");
			char terc = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Quant. horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			if (terc == 'S') {
				System.out.print("Adicional hora: ");
				double adicionalHora = sc.nextDouble();
				list.add(new FuncionarioTerceHeranca(nome, horas, valorHora, adicionalHora));
			} else {
				list.add(new FuncionarioHeranca(nome, horas, valorHora));
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		for  (FuncionarioHeranca emp : list) {
			System.out.println(emp.getNome() + " - $" + String.format("%.2f", emp.pagamento()));
		}	sc.close();
	}
}
