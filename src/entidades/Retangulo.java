package entidades;

public class Retangulo {
	public double alt;
	public double larg;

	public double area() {

		return alt * larg;
	}

	public double perimetro() {

		return (2 * alt) + (2 * larg);
	}

	public double diagonal() {
		double a = (alt * alt) + (larg * larg);

		return Math.sqrt(a);
	}
}
