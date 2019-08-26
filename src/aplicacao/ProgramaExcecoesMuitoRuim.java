package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ReservaMuitoRuim;

public class ProgramaExcecoesMuitoRuim {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Número do quarto: ");
		int num = sc.nextInt();
		System.out.println("Data de entrada (dd/MM/yyyy): ");
		Date dtaEntrada = sdf.parse(sc.next());
		System.out.println("Data de saída (dd/MM/yyyy): ");
		Date dtaSaida = sdf.parse(sc.next());

		if (!dtaSaida.after(dtaEntrada)) {
			System.out.println("Erro na reserva, a data de saída deve ser maior que a data de entrada!!!");
		} else {
			ReservaMuitoRuim reserva = new ReservaMuitoRuim(num, dtaEntrada, dtaSaida);
			System.out.println(reserva);

			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva: ");
			System.out.println("Data de entrada (dd/MM/yyyy): ");
			dtaEntrada = sdf.parse(sc.next());
			System.out.println("Data de saída (dd/MM/yyyy): ");
			dtaSaida = sdf.parse(sc.next());

			Date agora = new Date();

			if (dtaEntrada.before(agora) || dtaSaida.before(agora)) {
				System.out.println("Erro na reserva, as datas de entrada e saída devem ser futuras!!!");
			} else if (!dtaSaida.after(dtaEntrada)) {
				System.out.println("Erro na reserva, a data de saída deve ser maior que a data de entrada!!!");
			} else {
				reserva.atualizarData(dtaEntrada, dtaSaida);
				System.out.println(reserva);
			}
		}
		sc.close();
	}
}
