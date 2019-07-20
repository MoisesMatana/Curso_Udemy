package moises.programador;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhileFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// double maior = 0;

		System.out.print("Digite um n�mero positivo: ");
		Double qtd = sc.nextDouble();
		int maior = 1;
		while (qtd <= 0) {
			System.out.print("Digite um n�mero positivo: ");
			qtd = sc.nextDouble();
		}
		for (int i = 1; i <= qtd; i++) {
			System.out.print("Digite o n�mero " + (i) + ": ");
			int n = sc.nextInt();
			if (n > maior) {
				maior = n;
			}
		}

		System.out.print("Maior: " + maior);

		sc.close();
	}
}
