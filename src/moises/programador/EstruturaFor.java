package moises.programador;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		System.out.print("Quantos números você vai digitar: ");
		int qtd = sc.nextInt();
		
		for (int i = 1; i <= qtd; i++) {
			System.out.print("Digite o número "+(i)+": ");
			int n = sc.nextInt();
			
			soma  += n; // É igual a: soma = soma + n
		}
		System.out.println("Soma = "+soma);
		
		
		sc.close();
	}

}
