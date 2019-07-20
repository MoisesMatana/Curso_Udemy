package entidades;

public class Funcionario {
	public String nome;
	public double salBruto;
	public double taxa;
	
	public double salLiquido() {
		
		return salBruto - taxa;
	}
	
	public double aumentoSalario (double porc) {
		return this.salBruto = salBruto + ((salBruto * porc)/100);
	}
	
}
