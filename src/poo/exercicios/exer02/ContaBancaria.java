package poo.exercicios.exer02;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	private String numeroDaConta;
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(String titular, double saldo, String numeroDaConta) {
		this.titular = titular;
		this.saldo = saldo;
		this.numeroDaConta = numeroDaConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	

}
