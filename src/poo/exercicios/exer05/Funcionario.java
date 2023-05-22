package poo.exercicios.exer05;

public class Funcionario {
	private String nome;
	private double salario;
	private String departamento;

	public Funcionario(String nome, double salario, String departamento) {
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/*
	 * que calcula o salário final do funcionário de acordo com o valor do salário
	 * base e o cargo do funcionário
	 */

	public double calcularSalario(double bonus) {
		double salarioFinal = this.salario + bonus;
		System.out.println("Seu Salario Final é: " + salarioFinal);
		return salarioFinal;
	}
	
	/*
	 *  Método para calcular o salário final do funcionário. 
	 *  Este método deve ser sobrescrito pelas classes filhas.
	 *  ele foi criado pela propria IDE.
	 */
	public double calcularSalario() {
		return 0; //Implementar o cálculo do salário final nas classes filhas.
	}
	
}
