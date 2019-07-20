package moises.programador;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.print("Digite um número: ");
			Double num = sc.nextDouble();
			Double raiz = Math.sqrt(num);
			System.out.printf("Raiz quadrada= %.3f%n", raiz);
			sc.nextLine();
			System.out.print("Você quer calcular outra raiz? ");
			op = sc.nextInt();

		} while (op == 0);
		System.out.printf("Programa encerrado");

		sc.close();

	}

}