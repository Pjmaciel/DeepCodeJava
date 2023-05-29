package poo.exercicios.interfaces.desafio2;

public class ContaCorrente extends Conta implements Tributavel {
	

	@Override
	public double obterSaldo() {
		System.out.printf("Tipo de Conta: Corrente %nSaldo: %.2f %n ", getSaldo());
		return super.obterSaldo();
	}

	@Override
	public double calculaTributos() {
		double tributo = getSaldo() * 0.01;
		System.out.printf("Tributos: R$%.2f%n", tributo);
		return tributo;
	}

}
