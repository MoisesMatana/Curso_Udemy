package entidades;

import entidades.enums.CorAbstrata;

public class RetanguloAbstrata extends FormaAbstrata {

	private double larg;
	private double alt;

	public RetanguloAbstrata() {
		super();
	}

	public RetanguloAbstrata(CorAbstrata cor, double larg, double alt) {
		super(cor);
		this.larg = larg;
		this.alt = alt;
	}

	public double getLarg() {
		return larg;
	}

	public void setLarg(double larg) {
		this.larg = larg;
	}

	public double getAlt() {
		return alt;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}

	@Override
	public double area() {
		return larg * alt ;
	}
}
