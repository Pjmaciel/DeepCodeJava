package poo.teste;

import poo.exercicios.exer02.ContaCorrente;
import poo.exercicios.exer02.ContaPoupanca;

public class TesteExerc02 {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente("Francisco", 700, "0123x");
		ContaPoupanca cp = new ContaPoupanca("Ferdinando", 400, "0234x");
		
		
		System.out.println("Corrente: "+ cc.getNumeroDaConta() + " | " + cc.getSaldo()+" | " + cc.getTitular()+" | " + cc.getLimite());
		System.out.println("Pupança: "+ cp.getNumeroDaConta() + " | " + cp.getSaldo()+" | " + cp.getTitular()+" | " + cp.getTaxaDeJuros());

	}

}
