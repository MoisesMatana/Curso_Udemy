package moises.programador;

import java.util.Locale;
import java.util.Scanner;

public class TiposDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome completo:");
		String nome = sc.nextLine();

		System.out.println("Quantos quartos na sua casa:");
		int qt = sc.nextInt();

		System.out.println("Digite o valor de um produto:");
		double val = sc.nextDouble();

		System.out.println("Digite sua idade:");
		int age = sc.nextInt();

		System.out.println("Digite sua altura:");
		double alt = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite seu sobrenome:");
		String sobNome = sc.nextLine();

		System.out.println();
		System.out.println("Valores: ");
		System.out.println("Nome completo: " + nome);
		System.out.println("Qtd quartos: " + qt);
		System.out.println("Valor produto: " + val);
		System.out.println("Sobrenome: " + sobNome);		
		System.out.println("Idade: " + age);		
		System.out.println("Altura: " + alt);

//		int n1 = sc.nextInt(); //35
//		sc.nextLine(); 
//		String name = sc.nextLine(); //moises
//		char gender = sc.next().charAt(5); //ubirajara		
//		//b5
//		String s = sc.next();//b
//		char letter = s.charAt(0); //5
//		int digit = Integer.parseInt(s.substring(1));
//		
//		//4.32		
//		double n2 = sc.nextDouble();	
//		
//		//Maria F 23 1.68
//		String nome2 = sc.next();
//		char ch = sc.next().charAt(0);
//		int age = sc.nextInt();
//		double height = sc.nextDouble();		
//		

//		System.out.println(n1);
//		System.out.println(name);
//		System.out.println(gender);
//		System.out.println(letter);
//		System.out.println(digit);
//		System.out.println(n2);	
//		
//		System.out.println(nome2);
//		System.out.println(ch);
//		System.out.println(age);
//		System.out.println(height);

		sc.close();
	}

}
