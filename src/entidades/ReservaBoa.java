package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Excecoes.DominioException;

public class ReservaBoa {
	private Integer numQuarto;
	private Date dataEntrada;
	private Date dataSaida;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ReservaBoa(Integer numQuarto, Date dataEntrada, Date dataSaida) {
		if (!dataSaida.after(dataEntrada)) {
			throw new DominioException("A data de sa�da deve ser maior que a data de entrada!!!");
		}
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

	public void atualizarData(Date dataEntrada, Date dataSaida) {
		Date agora = new Date();

		if (dataEntrada.before(agora) || dataSaida.before(agora)) {
			throw new DominioException("As datas de entrada e sa�da devem ser futuras!!!");
		}

		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	@Override
	public String toString() {
		return "\n" + "Dados da reserva: " + 
					"\n" + "N�mero do quarto: " + getNumQuarto() + 
					"\n" + "Data de entrada: " + sdf.format(getDataEntrada()) + 
					"\n" + "Data de sa�da: " + sdf.format(getDataSaida()) + 
					"\n" + "Quant de noites: " + duracao();
	}
}
