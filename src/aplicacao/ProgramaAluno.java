package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class ProgramaAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.print("Nome do aluno: ");
		aluno.nome = sc.nextLine();

		System.out.print("Nota 1: ");
		aluno.n1 = sc.nextDouble();
		while (aluno.n1 > 30) {
			System.out.println("ERRO!!! Nota 1 não pode ser maior que 30: ");
			System.out.print("Nota 1: ");
			aluno.n1 = sc.nextDouble();
		}

		System.out.print("Nota 2: ");
		aluno.n2 = sc.nextDouble();
		while (aluno.n2 > 35) {
			System.out.println("ERRO!!! Nota 2 não pode ser maior que 35: ");
			System.out.print("Nota 2: ");
			aluno.n2 = sc.nextDouble();
		}

		System.out.print("Nota 3: ");
		aluno.n3 = sc.nextDouble();
		while (aluno.n3 > 35) {
			System.out.println("ERRO!!! Nota 3 não pode ser maior que 35: ");
			System.out.print("Nota 3: ");
			aluno.n3 = sc.nextDouble();
		}

		aluno.notaFinal();

		System.out.println();
		System.out.println("Dados Aluno: ");
		System.out.println("Nome: " + aluno.nome);
		System.out.printf("Nota 1: %.2f%n", aluno.n1);
		System.out.printf("Nota 2: %.2f%n", aluno.n2);
		System.out.printf("Nota 3: %.2f%n", aluno.n3);
		System.out.printf("Nota final: %.2f%n", aluno.notaFinal());
		if (aluno.notaFinal() >= 60) {
			System.out.println("Resultado: Aprovado");
		} else {
			double diferenca = 60 - aluno.notaFinal();
			System.out.printf("Resultado: Reprovado, faltou: %.2f%n", diferenca, "pontos");
		}

		System.out.println();

		sc.close();
	}

}
