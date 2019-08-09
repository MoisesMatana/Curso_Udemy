package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ClientePedido;
import entidades.PedidoNovo;
import entidades.ProdutoPedido;
import entidades.enums.SituacaoPedido;

public class ProgramaPedido {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat stf = new SimpleDateFormat("DD/MM/YYYY");

		PedidoNovo pedido = new PedidoNovo();
		ClientePedido cliente = new ClientePedido();
		ProdutoPedido produto = new ProdutoPedido();

		System.out.println("--Dados do cliente--");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Data de nascimento (DD/MM/YYYY): ");
		Date dataNascimento = stf.parse(sc.next());
		System.out.println("--Dados do pedido--");		
		System.out.println("Situação do pedido: ");
		sc.nextLine();
		String situacao = sc.nextLine();
		System.out.println("Quantos itens há no pedido: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite o item num " + i+" :");
			sc.nextLine();
			String desc = sc.nextLine();
			System.out.println("Digite o valor: ");
			Double preco = sc.nextDouble();
			System.out.println("Digite a quantidade: ");
			Integer qtd = sc.nextInt();
			
			produto = new ProdutoPedido();
			produto.setDescricao(desc);
			produto.setPreco(preco);
			produto.setQtd(qtd);
			pedido.addProduto(produto);
		}
		Date data = new Date();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setDataAniversario(dataNascimento);
		pedido.setCliente(cliente);
		pedido.setMomento(data);
		pedido.setSituacao(SituacaoPedido.valueOf(situacao));

		System.out.println(pedido);
		sc.close();
	}
}
