package poo.exercicios.interfaces.desafio2;

public abstract class Conta {
	private double saldo;

	public double sacar(double valor) {
		this.saldo -= valor;
		return this.saldo;
	}
	
	public double depositar(double valor) {
		this.saldo += valor;
		return this.saldo;
	}
	
	public double obterSaldo() {
		return this.saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	


}
