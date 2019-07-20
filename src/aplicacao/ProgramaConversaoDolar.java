package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Util.ConversorMoeda;

public class ProgramaConversaoDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do dolar: ");
		double p = sc.nextDouble();
		System.out.print("Quantos dólares irá comprar: ");
		double q = sc.nextDouble();
		
		double valor = ConversorMoeda.convert(p, q);
		
		System.out.printf("Você irá pagar: %.2f%n", valor);
		
		sc.close();


	}

}
