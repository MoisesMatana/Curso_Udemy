package entidades;

public class ProdutoPedido {
	private String descricao;
	private double preco;
	private int qtd;

	public ProdutoPedido() {

	}
	
	public ProdutoPedido(String descricao, double preco, int qtd) {
		this.descricao = descricao;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public Double subTotal () {
		return qtd * preco;
	}
}
