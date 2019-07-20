package moises.programador;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = max(a, b, c);

		mostrarMaior(maior);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > x && y > z) {
			aux = y;
		} else {
			aux = z;

		}
		return aux;
	}

	public static void mostrarMaior(int valor) {
		System.out.println("O maior número é  a: " + valor);
	}
}
