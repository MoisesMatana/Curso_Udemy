package moises.programador;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		Double num = sc.nextDouble();

		while (num >= 0) {
			double raiz = Math.sqrt(num);
			System.out.printf("%.3f%n",raiz);
			System.out.print("Digite outro n�mero: ");
			num = sc.nextDouble();
		}
		System.out.println("N�mero negativo: " + num);
		sc.close();
	}

}
