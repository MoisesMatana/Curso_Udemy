package entidades;

public class Produto {
	private String nome = null;
	private double preco = 0;
	private int qtd = 0;

	public Produto() {

	}

	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double valorTotalEstique() {
		return preco * qtd;
	}

	public void adicionaProduto(int qtdProduto) {
		this.qtd = qtd + qtdProduto;
	}

	public void removeProduto(int qtdProduto) {
		this.qtd = qtd - qtdProduto;
	}

	public String toString() {
		return "\n" + "Nome: " + nome + 
					"\n" + "Valor:  R$" + String.format("%.2f", preco) + 
					"\n" + "Quant:  R$" + qtd+ " unidades" + 
					"\n" + "Total: R$" + String.format("%.2f", valorTotalEstique());
	}
}
