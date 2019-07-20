package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class ProgramaTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite os lados do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite os lados do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
						
		double areaX = x.area();

		double areaY = y.area();
		

		System.out.printf("�rea tri�ngulo X: %.4f%n", areaX);
		System.out.printf("�rea tri�ngulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.printf("�rea X � a maior: %.4f%n", areaX);
		} else {
			System.out.printf("�rea Y � a maior: %.4f%n", areaY);
		}

		sc.close();
	}

}
