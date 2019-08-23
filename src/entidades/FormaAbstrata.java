package entidades;

import entidades.enums.CorAbstrata;

public abstract class FormaAbstrata {

	private CorAbstrata cor;
	
	public FormaAbstrata() {
		
	}

	public FormaAbstrata(CorAbstrata cor) {
		this.cor = cor;
	}

	public CorAbstrata getCor() {
		return cor;
	}

	public void setCor(CorAbstrata cor) {
		this.cor = cor;
	}

	public abstract double area();
}
