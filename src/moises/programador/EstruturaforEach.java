package moises.programador;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaforEach {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vet = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i< vet.length; i++) {
			System.out.println(vet[i]);			
		}		
		System.out.println("----------");
		
		for (String obj : vet) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
