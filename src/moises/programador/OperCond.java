package moises.programador;

import java.util.Scanner;

public class OperCond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Simples:
//		System.out.println("Entre com um número inteiro:");
//		int n1 = sc.nextInt();
//		if (n1 % 2 ==0) {
//			System.out.println("É par");
//		}else {
//			System.out.println();
//		}
		
		//Encadeado:
		System.out.println("Entre com a hora:");
		int n1 = sc.nextInt();
		if(n1 < 12) {
			System.out.println("Bom dia!!!!");
		}else if (n1 >= 12 && n1 < 18){
			System.out.println("Boa tarde!!!!");
		}else {
			System.out.println("Boa noite!!!");
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
