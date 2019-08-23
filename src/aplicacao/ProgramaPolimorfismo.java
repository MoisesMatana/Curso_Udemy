package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaHeranca;
import entidades.ContaPoupancaHeranca;

public class ProgramaPolimorfismo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaHeranca x = new ContaHeranca(1020, "Moisés", 1000);

		ContaHeranca y = new ContaPoupancaHeranca(1002, "Moises", 1000, 0.01);

		x.saque(50);
		y.saque(50);

		System.out.println("Saldo conta corrente: " + x.getSaldo());
		System.out.println("Saldo conta poupança: " + y.getSaldo());

		sc.close();
	}
}
