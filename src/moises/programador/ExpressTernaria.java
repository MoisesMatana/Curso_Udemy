package moises.programador;

import java.util.Scanner;

public class ExpressTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/**
		 * (condição) ? valor_se_verdadeiro : valor_se_falso
		 */

		double preco = 10;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.5;
			if(preco < 20) {
				desconto = preco * 0.1;
			}else {
				desconto = preco * 0.5;
			}
		System.out.println(desconto);

		sc.close();

	}

}
