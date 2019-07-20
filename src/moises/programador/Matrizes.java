package moises.programador;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite n: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Diagonal principal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");

		}
		int cont = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					if (mat[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println();
		
		System.out.print("Numeros negativos= "+ cont);
		sc.close();
	}
}