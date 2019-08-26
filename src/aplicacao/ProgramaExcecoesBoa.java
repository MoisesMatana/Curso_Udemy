package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Excecoes.DominioException;
import entidades.ReservaBoa;

public class ProgramaExcecoesBoa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Número do quarto: ");
			int num = sc.nextInt();
			System.out.println("Data de entrada (dd/MM/yyyy): ");
			Date dtaEntrada = sdf.parse(sc.next());
			System.out.println("Data de saída (dd/MM/yyyy): ");
			Date dtaSaida = sdf.parse(sc.next());

			ReservaBoa reserva = new ReservaBoa(num, dtaEntrada, dtaSaida);
			System.out.println(reserva);

			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva: ");
			System.out.println("Data de entrada (dd/MM/yyyy): ");
			dtaEntrada = sdf.parse(sc.next());
			System.out.println("Data de saída (dd/MM/yyyy): ");
			dtaSaida = sdf.parse(sc.next());

			reserva.atualizarData(dtaEntrada, dtaSaida);
			System.out.println(reserva);

		} catch (ParseException e) {
			System.out.println("Formato de data inválido");
		} catch (DominioException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		sc.close();
	}
}
