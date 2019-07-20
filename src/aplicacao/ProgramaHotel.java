package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Hospede;

public class ProgramaHotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de quartos: ");
		int n = sc.nextInt();
		Hospede[] vet = new Hospede[n];
		int i;
		for (i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite o emal: ");
			String email = sc.nextLine();
			System.out.println("Digite o número do quarto: ");
			int num = sc.nextInt();
			vet[i] = new Hospede(nome, email, num);
		}

		for (i = 0; i < n; i++) {
			if (vet[i] != null) {
				System.out.println();
				System.out.println("Nome: " + vet[i].getNome());
				System.out.println("Email: " + vet[i].getEmail());
				System.out.println("Número quarto: " + vet[i].getNumQuarto());
				System.out.println();
			}
		}
		sc.close();
	}
}