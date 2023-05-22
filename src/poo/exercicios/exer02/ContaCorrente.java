package poo.exercicios.exer02;

public class ContaCorrente extends ContaBancaria {

	private double limite;

	public ContaCorrente() {
	}

	public ContaCorrente(String titular, double saldo, String numeroDaConta) {
		super(titular, saldo, numeroDaConta);
		if (saldo >= 600) {
			this.limite = 1000;
		}
	}

	public double getLimite() {
		return limite;
	}

	

}
