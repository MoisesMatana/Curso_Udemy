package aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramaExExcecoesAbrirArquivo {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			File file = new File("C:\\temp\\in.txt");
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir o arquivo: \n" + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Final de bloco executado!");
		}
	}
}
