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
		
		System.out.println("Digite os lados do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite os lados do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
						
		double areaX = x.area();

		double areaY = y.area();
		

		System.out.printf("Área triângulo X: %.4f%n", areaX);
		System.out.printf("Área triângulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.printf("Área X é a maior: %.4f%n", areaX);
		} else {
			System.out.printf("Área Y é a maior: %.4f%n", areaY);
		}

		sc.close();
	}

}
