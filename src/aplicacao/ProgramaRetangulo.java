package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class ProgramaRetangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.println("Digite os lados do ret�ngulo: ");
		retangulo.alt = sc.nextDouble();
		retangulo.larg = sc.nextDouble();

		double area = retangulo.area();
		double perimetro = retangulo.perimetro();
		double diagonal = retangulo.diagonal();

		System.out.println("Valores ret�ngulo: ");
		System.out.println("Altura: " + retangulo.alt);
		System.out.println("Largura: " + retangulo.larg);
		System.out.printf("�rea: %.4f%n", area);
		System.out.printf("Per�metro: %.4f%n", perimetro);
		System.out.printf("Diagonal: %.4f%n", diagonal);

		sc.close();
	}
}