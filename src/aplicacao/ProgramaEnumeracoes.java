package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.NivelTrabalhador;

public class ProgramaEnumeracoes {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat stf = new SimpleDateFormat("DD/MM/YYYY");

		System.out.print("Entre com o departamento: ");
		String deptoNome = sc.nextLine();
		System.out.print("Entre com o nome do trabalhador: ");
		String nomeTrab = sc.nextLine();
		System.out.print("Nível do trabalhador: ");
		String nivelTrab = sc.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nomeTrab, NivelTrabalhador.valueOf(nivelTrab), salarioBase,
				new Departamento(deptoNome));

		System.out.print("Quantos contratos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite o contrato num: " + i + " data: ");
			System.out.print("Data (DD/MM/YY): ");
			Date Datacontrato = stf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duração contrato: ");
			int horas = sc.nextInt();
			ContratoHora contratoHora = new ContratoHora(Datacontrato, valorHora, horas);
			trabalhador.addContrato(contratoHora);
		}
		System.out.println("");
		System.out.print("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));

		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepto().getNome());
		System.out.println("Ganhou por : " + mesEAno + ":  " + String.format("%.2f", trabalhador.calcular(ano, mes)));

		sc.close();
	}
}