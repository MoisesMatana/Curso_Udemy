package entidades;

public class ContaPoupancaHeranca extends ContaHeranca {
	private double taxaJuro;

	public ContaPoupancaHeranca() {
		super();
	}

	public ContaPoupancaHeranca(Integer numero, String titular, double saldo, double taxaJuro) {
		super(numero, titular, saldo);
		this.taxaJuro = taxaJuro;
	}

	public double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}

	public void atualizarSaldo() {
		saldo = saldo * taxaJuro;
	}
	
	@Override
	public final void saque(double valor) {
		saldo = saldo - valor;
	}
}
