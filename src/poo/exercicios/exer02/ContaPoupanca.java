package poo.exercicios.exer02;

public class ContaPoupanca extends ContaBancaria {
	
	private double taxaDeJuros;
	
	

	public ContaPoupanca() {
	}

	public ContaPoupanca(String titular, double saldo, String numeroDaConta) {
		super(titular, saldo, numeroDaConta);
		this.taxaDeJuros = 0.0337;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}
	
	

}
