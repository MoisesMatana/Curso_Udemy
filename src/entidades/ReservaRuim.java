package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservaRuim {
	private Integer numQuarto;
	private Date dataEntrada;
	private Date dataSaida;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ReservaRuim(Integer numQuarto, Date dataEntrada, Date dataSaida) {
		this.numQuarto = numQuarto;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public Integer getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public long duracao() {
		long diferenca = dataSaida.getTime() - dataEntrada.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}

	public String atualizarData(Date dataEntrada, Date dataSaida) {
		Date agora = new Date();

		if (dataEntrada.before(agora) || dataSaida.before(agora)) {
			return "Erro na reserva, as datas de entrada e saída devem ser futuras!!!";
		}
		if (!dataSaida.after(dataEntrada)) {
			return "Erro na reserva, a data de saída deve ser maior que a data de entrada!!!";
		}
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		return null;
	}

	@Override
	public String toString() {
		return "\n" + "Dados da reserva: " + "\n" + "Número do quarto: " + getNumQuarto() + "\n" + "Data de entrada: "
				+ sdf.format(getDataEntrada()) + "\n" + "Data de saída: " + sdf.format(getDataSaida()) + "\n"
				+ "Quant de noites: " + duracao();
	}
}
