package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaExExcecoes {
	public static void main(String[] args) {
		metodoUm();
		System.out.println("Fim do programa");
	}

	public static void metodoUm() {
		System.out.println("Início método um");
		metodoDois();
		System.out.println("Final método um");
	}

	public static void metodoDois() {
		System.out.println("Início método dois");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vet = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vet[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada");
		}
		sc.close();
		System.out.println("Final método dois");
	}

}
