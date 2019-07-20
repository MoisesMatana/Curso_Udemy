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
		System.out.println("Quant de funcion�rios: ");
		int n = sc.nextInt();

		for (i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Nome do funcionario: ");
			String nome = sc.nextLine();
			System.out.println("Sal�rio: ");
			double salario = sc.nextDouble();
			System.out.println("ID: ");
			int id = sc.nextInt();

			func = new FuncionarioLista(id, nome, salario);
			funcionarios.add(func);
		}
		System.out.println("Lista de funcion�rios: ");
		for (FuncionarioLista f : funcionarios) {
			System.out.println("Matr�cula: " + f.getId());
			System.out.println("Funcion�rio: " + f.getNome());
			System.out.println("Sal�rio: " + f.getSalario());
		}
		System.out.println("_____________________");
		System.out.println("Voc� deseja aumentar o sal�rio de algum funcin�rio?");
		System.out.println("Digite 1-SIM ou qualquer outro n�mero para sair: ");
		int op = sc.nextInt();
		if (op == 1) {
			System.out.println("Informe a matr�cula do funcion�rio: ");
			int num = sc.nextInt();
			for (i = 0; i < funcionarios.size(); i++) {
				if (num == funcionarios.get(i).getId()) {
					System.out.println("Matr�cula: " + funcionarios.get(i).getId());
					System.out.println("Funcion�rio: " + funcionarios.get(i).getNome());
					System.out.println("Sal�rio atual: " + funcionarios.get(i).getSalario());
					System.out.println("_____________________");
					System.out.println("Informe o percentual de aumento: ");
					double valor = sc.nextDouble();
					func.aumentoSalario(valor);

					System.out.println("_____________________");
					System.out.println("Dados atualizados:");
					for (i = 0; i < funcionarios.size(); i++) {
						System.out.println("Matr�cula: " + funcionarios.get(i).getId());
						System.out.println("Funcion�rio: " + funcionarios.get(i).getNome());
						System.out.println("Sal�rio atual: " + funcionarios.get(i).getSalario());
						System.out.println("Programa encerrado!!!!");
					}
				} else {
					System.out.println("ERRO!!! Matr�cula: " + num + " n�o existe");
					System.out.println("Programa encerrado!!!!");
				}
			}

		} else {
			System.out.println("Programa encerrado!!!!");
			System.out.println("_____________________");
			System.out.println("Lista de funcion�rios: ");
			for (FuncionarioLista f : funcionarios) {
				System.out.println("Matr�cula: " + f.getId());
				System.out.println("Funcion�rio: " + f.getNome());
				System.out.println("Sal�rio: " + f.getSalario());
			}
		}

		sc.close();
	}
}
