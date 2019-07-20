package aplicacao;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entidades.FuncionarioLista;

public class ProgramaFuncionarioLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		FuncionarioLista func = new FuncionarioLista();
		ArrayList<FuncionarioLista> funcionarios = new ArrayList<FuncionarioLista>();

		int i;
		System.out.println("Quant de funcionários: ");
		int n = sc.nextInt();

		for (i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Nome do funcionario: ");
			String nome = sc.nextLine();
			System.out.println("Salário: ");
			double salario = sc.nextDouble();
			System.out.println("ID: ");
			int id = sc.nextInt();

			func = new FuncionarioLista(id, nome, salario);
			funcionarios.add(func);
		}
		System.out.println("Lista de funcionários: ");
		for (FuncionarioLista f : funcionarios) {
			System.out.println("Matrícula: " + f.getId());
			System.out.println("Funcionário: " + f.getNome());
			System.out.println("Salário: " + f.getSalario());
		}
		System.out.println("_____________________");
		System.out.println("Você deseja aumentar o salário de algum funcinário?");
		System.out.println("Digite 1-SIM ou qualquer outro número para sair: ");
		int op = sc.nextInt();
		if (op == 1) {
			System.out.println("Informe a matrícula do funcionário: ");
			int num = sc.nextInt();
			for (i = 0; i < funcionarios.size(); i++) {
				if (num == funcionarios.get(i).getId()) {
					System.out.println("Matrícula: " + funcionarios.get(i).getId());
					System.out.println("Funcionário: " + funcionarios.get(i).getNome());
					System.out.println("Salário atual: " + funcionarios.get(i).getSalario());
					System.out.println("_____________________");
					System.out.println("Informe o percentual de aumento: ");
					double valor = sc.nextDouble();
					func.aumentoSalario(valor);

					System.out.println("_____________________");
					System.out.println("Dados atualizados:");
					for (i = 0; i < funcionarios.size(); i++) {
						System.out.println("Matrícula: " + funcionarios.get(i).getId());
						System.out.println("Funcionário: " + funcionarios.get(i).getNome());
						System.out.println("Salário atual: " + funcionarios.get(i).getSalario());
						System.out.println("Programa encerrado!!!!");
					}
				} else {
					System.out.println("ERRO!!! Matrícula: " + num + " não existe");
					System.out.println("Programa encerrado!!!!");
				}
			}

		} else {
			System.out.println("Programa encerrado!!!!");
			System.out.println("_____________________");
			System.out.println("Lista de funcionários: ");
			for (FuncionarioLista f : funcionarios) {
				System.out.println("Matrícula: " + f.getId());
				System.out.println("Funcionário: " + f.getNome());
				System.out.println("Salário: " + f.getSalario());
			}
		}

		sc.close();
	}
}
