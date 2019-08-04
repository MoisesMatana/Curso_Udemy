package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador level;
	private Double salarioBase;

	private Departamento depto;
	private List<ContratoHora> contratos = new ArrayList<>();

	public Trabalhador() {
	}

	public Trabalhador(String nome, NivelTrabalhador level, Double salarioBase, Departamento depto) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.depto = depto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getLevel() {
		return level;
	}

	public void setLevel(NivelTrabalhador level) {
		this.level = level;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepto() {
		return depto;
	}

	public void setDepto(Departamento depto) {
		this.depto = depto;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}

	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}

	public double calcular(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();

		for (ContratoHora contratoHora : contratos) {
			cal.setTime(contratoHora.getData());
			
			int contrato_ano = 1+ cal.get(Calendar.YEAR);
			int contrato_mes = cal.get(Calendar.MONTH) - 3;

			if (ano == contrato_ano && mes == contrato_mes) {
				soma = soma + contratoHora.valorTotal();
			}
		}
		return soma;
	}

}
