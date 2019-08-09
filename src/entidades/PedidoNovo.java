package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.SituacaoPedido;

public class PedidoNovo {
	private Date data;
	private SituacaoPedido situacao;
	private ClientePedido cliente;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private List<ProdutoPedido> produtos = new ArrayList<>();

	public PedidoNovo() {

	}

	public PedidoNovo(Date momento, SituacaoPedido situacao, ClientePedido cliente) {
		this.data = momento;
		this.situacao = situacao;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return data;
	}

	public void setMomento(Date momento) {
		this.data = momento;
	}

	public SituacaoPedido getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoPedido situacao) {
		this.situacao = situacao;
	}

	public ClientePedido getCliente() {
		return cliente;
	}

	public void setCliente(ClientePedido cliente) {
		this.cliente = cliente;
	}

	public List<ProdutoPedido> getProdutos() {
		return produtos;
	}

	public void addProduto(ProdutoPedido produto) {
		produtos.add(produto);
	}

	public void RemoveProduto(ProdutoPedido produto) {
		produtos.remove(produto);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Resumo pedido: " + "\n");
		sb.append("Data: " + sdf.format(data) + "\n");
		sb.append("Situação: " + situacao + "\n");
		sb.append("Cliente: " + cliente.getNome() + "\n");
		sb.append("Email: " + cliente.getEmail() + "\n");
		sb.append("Data de aniversário: " + sdf.format(cliente.getDataAniversario()) + "\n");
		sb.append("----------------------\n");
		sb.append("Itens do pedido: " + "\n");
		sb.append("----------------------\n");

		Double total = (double) 0;
		for (ProdutoPedido p : produtos) {
			sb.append("Descrição: " + p.getDescricao() + "\n");
			sb.append("Quant: " + p.getQtd() + "\n");
			sb.append("Subtotal: R$" + p.subTotal() + "\n");
			total = total + p.subTotal();
			sb.append("----------------------\n");
		}
		sb.append("Total de produtos: " + "\n");
		sb.append("R$" + total + "\n");
		return sb.toString();
	}

}