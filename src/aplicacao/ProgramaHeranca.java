package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaHeranca;
import entidades.ContaNegocioHeranca;
import entidades.ContaPoupancaHeranca;

public class ProgramaHeranca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// UpCasting:
		ContaHeranca conta2 = new ContaNegocioHeranca(1003, "Moises", 0.0, 500);
		ContaHeranca conta3 = new ContaPoupancaHeranca(1004, "Paulo", 0, 0.01);

		// DownCasting:
		ContaNegocioHeranca conta4 = (ContaNegocioHeranca) conta2;
		conta4.deposito(100);

		if (conta3 instanceof ContaNegocioHeranca) {
			ContaNegocioHeranca conta5 = (ContaNegocioHeranca) conta3;
			conta5.emprestimo(200);
			System.out.println("Empréstimo");
		}

		if (conta3 instanceof ContaPoupancaHeranca) {
			ContaPoupancaHeranca conta5 = (ContaPoupancaHeranca) conta3;
			conta5.atualizarSaldo();
			System.out.println("Saldo atualizado!");
		}

		// Override:
		ContaHeranca cont = new ContaHeranca(1001, "Moises", 1000);
		cont.saque(200);
		System.out.println("Saldo conta corrente: " + cont.getSaldo());

		ContaHeranca cont1 = new ContaPoupancaHeranca(1002, "Moises", 1000, 0.01);
		cont1.saque(200);
		System.out.println("Saldo conta poupança: " + cont1.getSaldo());

		ContaHeranca cont2 = new ContaNegocioHeranca(1002, "Moises", 1000, 500);
		cont2.saque(200);
		System.out.println("Saldo conta poupança: " + cont2.getSaldo());
		sc.close();
	}
}
