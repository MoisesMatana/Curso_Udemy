package entidades;

public class PessoaJuridica extends Pessoa {

	public double numFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, double rendaAnual, double numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public double getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(double numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double calculoImposto() {
		double valorImposto = 0;
		if (getNumFuncionarios() > 10) {
			valorImposto = getRendaAnual() * 0.14;
		} else {
			valorImposto = getRendaAnual() * 0.16;
		}
		return valorImposto;
	}

	@Override
	public String toString() {
		return "\n" + "Tipo de pessoa: Jurídica" + "\n" + "Nome: " + super.getNome() + "\n" + "Renda anual: "
				+ super.getRendaAnual() + "\n" + "Total de funcionários:  " + getNumFuncionarios() + "\n"
				+ "Valor total imposto pago:  R$" + String.format("%.2f", this.calculoImposto());
	}
}
