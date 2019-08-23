package entidades;

import entidades.enums.CorAbstrata;

public class CirculoAbstrata extends FormaAbstrata {

	private double raio;

	public CirculoAbstrata() {
		super();
	}

	public CirculoAbstrata(CorAbstrata cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
}
