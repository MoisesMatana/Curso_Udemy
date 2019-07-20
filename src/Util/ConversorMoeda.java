package Util;

public class ConversorMoeda {
	public static double convert (double preco, double qtd) {
		double res = qtd *( preco * 1.06 ); 
		return res;
	}
}
