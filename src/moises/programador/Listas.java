package moises.programador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Jose");
		list.add("João");
		list.add("Ana");
		list.add("Paulo");
		list.add(2, "Pablo");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		list.remove(0);
		list.removeIf(x -> x.charAt(0) == 'P');

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		System.out.println("Índice de João: " + list.indexOf("João"));		
		System.out.println("--------------------");
		
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : resultado) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
		
		sc.close();
	}
}
