package moises.programador;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com valor:");
		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "segunda";
			break;
		case 2:
			dia = "terça";
			break;
		case 3:
			dia = "quarta";
			break;
		case 4:
			dia = "quinta";
			break;
		case 5:
			dia = "sexta";
			break;
		default:
			dia = "inválido";
		}
		System.out.println("Hoje é: " + dia);

		sc.close();
	}
}
