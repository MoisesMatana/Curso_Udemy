package entidades;

public class FuncionarioTerceHeranca extends FuncionarioHeranca {
	
	private Double adicionalHora;

	public  FuncionarioTerceHeranca() {
		super();
	}
	
	public FuncionarioTerceHeranca(String nome, Integer horas, Double valorHora, Double adicionalHora) {
		super(nome, horas, valorHora);
		this.adicionalHora = adicionalHora;
	}

	public Double getAdicionalHora() {
		return adicionalHora;
	}

	public void setAdicionalHora(Double adicionalHora) {
		this.adicionalHora = adicionalHora;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + adicionalHora * 1.1;
	}
}
