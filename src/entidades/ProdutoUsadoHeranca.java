package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsadoHeranca extends ProdutoHeranca {

	private Date dataManufatura;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ProdutoUsadoHeranca() {
		super();
	}
	
	public ProdutoUsadoHeranca(String descricao, double preco, Date dataManufatura) {
		super(descricao, preco);
		this.dataManufatura = dataManufatura;
	}

	public Date getDataManufatura() {
		return dataManufatura;
	}

	public void setDataManufatura(Date dataManufatura) {
		this.dataManufatura = dataManufatura;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return "\n" + "Tipo de produto: Usado"+
					"\n" + "Nome: " + super.getDescricao() + 
					"\n" + "Preço:  $" + String.format("%.2f", getPreco())+
					"\n" + "Data manufatura: " + sb.append(sdf.format(getDataManufatura()));
	}
}