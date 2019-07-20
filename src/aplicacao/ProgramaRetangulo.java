package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class ProgramaRetangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.println("Digite os lados do retângulo: ");
		retangulo.alt = sc.nextDouble();
		retangulo.larg = sc.nextDouble();

		double area = retangulo.area();
		double perimetro = retangulo.perimetro();
		double diagonal = retangulo.diagonal();

		System.out.println("Valores retângulo: ");
		System.out.println("Altura: " + retangulo.alt);
		System.out.println("Largura: " + retangulo.larg);
		System.out.printf("Área: %.4f%n", area);
		System.out.printf("Perímetro: %.4f%n", perimetro);
		System.out.printf("Diagonal: %.4f%n", diagonal);

		sc.close();
	}
}