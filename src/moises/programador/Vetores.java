package moises.programador;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite n: ");
		int n = sc.nextInt();
		double[] vet  = new double[n];
		
		System.out.println("Digite as alturas: ");
		for (int i = 0; i < n; i++) {
			vet [i]  = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vet[i];
			
		}
		System.out.println("Soma"+soma);
			
		
	
		
		
		sc.close();
	}

}
