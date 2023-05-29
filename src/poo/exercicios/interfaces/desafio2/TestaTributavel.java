package poo.exercicios.interfaces.desafio2;

public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		ContaCorrente cc = new ContaCorrente();
		
		Tributavel SeguroDeVida = new SeguroDeVida();
		
		cp.depositar(20);
		cp.sacar(10);
		cp.obterSaldo();
		
		System.out.println("");
		System.out.println("===========");
		cc.depositar(20);
		cc.depositar(100);
		cc.sacar(15);
		cc.obterSaldo();
		System.out.println(cc.calculaTributos());
		System.out.println("");
		System.out.println("===========");
		double contratoSeguro = cc.obterSaldo() - SeguroDeVida.calculaTributos();
		System.out.println("saldo atual: " +contratoSeguro);
		

	}

}
