package entidades;

public class ProdutoImportadoHeranca extends ProdutoHeranca{

	private double precoAlfandega;

	public ProdutoImportadoHeranca() {
		super();
	}

	public ProdutoImportadoHeranca(String descricao, double preco, double precoAlfandega) {
		super(descricao, preco);
		this.precoAlfandega = precoAlfandega;
	}

	public double getPrecoAlfandega() {
		return precoAlfandega;
	}

	public void setPrecoAlfandega(double precoAlfandega) {
		this.precoAlfandega = precoAlfandega;
	}
	
	@Override
	public double getPreco() {
		return super.getPreco() + getPrecoAlfandega();
	}

	@Override
	public String toString() {
		return "\n" + "Tipo de produto: Importado"+
					"\n" + "Nome: " + super.getDescricao() + 
					"\n" + "Preço:  $" + String.format("%.2f", super.getPreco()) +
					"\n" + "Preço alfândega:  $" + String.format("%.2f", getPrecoAlfandega()) +
					"\n" + "Preço total:  $" + String.format("%.2f", getPreco());
	}
}