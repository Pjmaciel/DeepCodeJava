package poo.exercicios.exer05;

import static java.lang.System.out;

public class Assistente extends Funcionario {
	private int numeroProjetos;

	public Assistente(String nome, double salario, String departamento, int numeroProjetos) {
		super(nome, salario, departamento);
		this.numeroProjetos = numeroProjetos;
	}

	public int getNumeroProjetos() {
		return numeroProjetos;
	}

	public void setNumeroProjetos(int numeroProjetos) {
		this.numeroProjetos = numeroProjetos;
	}

	/*
	 * assistentes recebam um adicional de acordo com o número de projetos.
	 */

	@Override
	public double calcularSalario() {
		double bonus =0;
		out.println("Cargo: Assistente" );
		if (this.numeroProjetos > 5) {
			bonus = 50*(this.numeroProjetos - 5); 
			System.out.printf("#=# Parabens %s Você ganhou um bonus de : %.2f #=#", getNome(), bonus);
			return super.calcularSalario(bonus);
		} else {
			System.out.println("#=# Você não cumpriu com os requesitos para obter o bonus #=#");
			return super.calcularSalario(bonus);
		}

	}

}
