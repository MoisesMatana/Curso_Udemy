package moises.programador;

public class EscopoInic {

	public static void main(String[] args) {

		double price = 400.00;
		double descount = 0;

		if (price < 200.00) {
			descount = price * 0.1;
		}
		System.out.println(price);
		System.out.println(descount);

	}

}
