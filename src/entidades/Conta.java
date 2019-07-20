package entidades;

public class Conta {
	private int num;
	private String nome;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int num, String nome) {
		this.num = num;
		this.nome = nome;
	}

	public Conta(int num, String nome, double depositoInicial) {
		this.num = num;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double saque(double valor) {

		this.saldo = saldo - valor - 5;

		return saldo;
	}

	public double deposito(double valor) {

		this.saldo = saldo + valor;

		return saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [Número=" + num + ", Nome=" + nome + ", Saldo=" + saldo + "]";
	}
}


