package poo.exercicios.exer05;

import static java.lang.System.out;

public class Gerente extends Funcionario {
	private String senha;

	public Gerente(String nome, double salario, String departamento, String senha) {
		super(nome, salario, departamento);
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/*
	 * gerentes recebam um bônus adicional de acordo com a senha
	 */

	@Override
	public double calcularSalario() {
		double bonus = 0;
		out.println("Cargo: Gerente" );
		if (this.senha.length() > 6) {
			bonus = 100 * (this.senha.length() - 6);
			out.printf("#=# Parabens %s Você ganhou um bonus de : %.2f #=#",getNome(), bonus);
			return super.calcularSalario(bonus);
		} else {
			out.println("#=# Você não cumpriu com os requesitos para obter o bonus #=#");
			return super.calcularSalario(bonus);
		}
	}

	
}
