package entidades;

public class ContaNegocioHeranca extends ContaHeranca {

	private double limiteEmprestimo;

	public ContaNegocioHeranca() {
		super();
	}

	public ContaNegocioHeranca(Integer numero, String titular, double saldo, double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double valor) {
		if (valor <= limiteEmprestimo) {
			saldo = valor - 10;
		}
	}

	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo = saldo - 2;
	}
}
