package entidades;

import Excecoes.DominioException;

public class ContaExcecao {
	private String numero;
	private String titular;
	private double saldo;
	private double limiteSaque;

	public ContaExcecao() {
	}

	public ContaExcecao(String numero, String titular, double saldo, double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {

		this.limiteSaque = limiteSaque;
	}

	public double saque(double valor) {
		if (valor > this.getSaldo()) {
			throw new DominioException("ERRO! Saque de: " + valor + " é superior ao saldo da conta: " + saldo);
		} else if (valor > this.getLimiteSaque()) {
			throw new DominioException("ERRO! Saque de:" + valor + " superior ao limite de saque: " + limiteSaque);
		} else {
			return valor;
		}
	}

	public double deposito(double valor) {
		return valor;
	}
	
	public double saldoAnterior() {
		return saldo;
	}

	public String toString() {
		return "\n" + "Dados da conta: " + 
					"\n" + "Número: "+ getNumero() + 
					"\n" + "Titular: "+ getTitular()+ 
					"\n" + "Limite de saque: R$ "+ getLimiteSaque() + 
					"\n" + "Saldo anterior: R$ "+ String.format("%.2f", getSaldo());
	}
}
