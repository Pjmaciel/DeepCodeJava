package poo.exercicios.interfaces.desafio2;

public class ContaPoupanca extends Conta {

	@Override
	public double obterSaldo() {
		System.out.printf("Tipo de Conta: Poupanca %nSaldo: %.2f %n ", getSaldo());
		return super.obterSaldo();
	}
	
	

}
