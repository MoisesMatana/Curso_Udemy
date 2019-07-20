package Util;

public class Calculadora {
	public static final double PI = 3.14159;
	
	public static double volume(double raio) {			 
		return 4 *PI * raio * raio * raio / 3;
	}

	public static double comp(double raio) {
		return 2 * PI * raio;
	}
}
