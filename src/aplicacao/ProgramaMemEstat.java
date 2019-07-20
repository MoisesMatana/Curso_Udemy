package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Util.Calculadora;

public class ProgramaMemEstat {	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio: ");		
		
		double raio = sc.nextDouble();

		double c = Calculadora.comp(raio);

		double v = Calculadora.volume(raio);

		System.out.printf("Comp: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		sc.close();
	}


}
