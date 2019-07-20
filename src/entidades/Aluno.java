package entidades;

public class Aluno {
	public String nome;
	public double n1;
	public double n2;
	public double n3;

	public double notaFinal() {
		
		double soma = this.n1 + this.n2 + this.n3;

		return soma;
	}

}
