package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.CirculoAbstrata;
import entidades.FormaAbstrata;
import entidades.RetanguloAbstrata;
import entidades.enums.CorAbstrata;

public class ProgramaMetodoAbstrata {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<FormaAbstrata> list = new ArrayList<>();

		System.out.print("Quantas figuras: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da figura: " + i);
			System.out.print("Retângulo ou círculo? r/c: ");
			char tipo = sc.next().charAt(0);
			System.out.print("Cor(PRETO/AZUL/VERMELHO): ");
			sc.nextLine();
			CorAbstrata cor = CorAbstrata.valueOf(sc.nextLine());
			if (tipo == 'r') {
				System.out.print("Largura: ");
				double larg = sc.nextDouble();
				System.out.print("Altura: ");
				double alt = sc.nextDouble();
				list.add(new RetanguloAbstrata(cor, larg, alt));
			} else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				list.add(new CirculoAbstrata(cor, raio));
			}
		}

		System.out.println();
		System.out.println("Área das fuguras:");
		for (FormaAbstrata formaAbstrata : list) {
			System.out.println("Área: " + String.format("%.2f", formaAbstrata.area()));
		}
		sc.close();
	}
}