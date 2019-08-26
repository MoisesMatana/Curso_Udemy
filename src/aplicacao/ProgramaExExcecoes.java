package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaExExcecoes {
	public static void main(String[] args) {
		metodoUm();
		System.out.println("Fim do programa");
	}

	public static void metodoUm() {
		System.out.println("In�cio m�todo um");
		metodoDois();
		System.out.println("Final m�todo um");
	}

	public static void metodoDois() {
		System.out.println("In�cio m�todo dois");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vet = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vet[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada");
		}
		sc.close();
		System.out.println("Final m�todo dois");
	}

}
