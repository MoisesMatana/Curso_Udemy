package entidades;

public class PessoaFisica extends Pessoa {

	public double valorGastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, double valorGastosSaude) {
		super(nome, rendaAnual);
		this.valorGastosSaude = valorGastosSaude;
	}

	public double getValorGastosSaude() {
		return valorGastosSaude;
	}

	public void setValorGastosSaude(double valorGastosSaude) {
		this.valorGastosSaude = valorGastosSaude;
	}

	@Override
	public double calculoImposto() {
		double valorImposto;
		if (getRendaAnual() < 20000) {
			valorImposto =  getRendaAnual() * 0.15;
		} else {
			valorImposto = getRendaAnual() * 0.25;
		}
		if (getValorGastosSaude() > 0) {
			valorImposto = valorImposto - (getValorGastosSaude() * 0.5);
		}
		return valorImposto;
	}

	@Override
	public String toString() {
		return "\n" + "Tipo de pessoa: Física"+
					"\n" + "Nome: " + super.getNome() + 
					"\n" + "Renda anual: " + super.getRendaAnual() +
					"\n" + "Gastos com saúde:  R$" + String.format("%.2f", getValorGastosSaude()) +
					"\n" + "Valor total imposto pago:  R$" + String.format("%.2f", this.calculoImposto()); 
	}
}
