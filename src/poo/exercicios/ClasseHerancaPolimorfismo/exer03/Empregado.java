package poo.exercicios.ClasseHerancaPolimorfismo.exer03;

public class Empregado {
	private String primeiroNome;
	private String sobrenome;
	private double salarioMensal;

	public Empregado(String primeiroNome, String sobrenome, double salarioMensal) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
		if (this.salarioMensal < 0) {
			this.salarioMensal = 0.0;
		}
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public void aumentoDez() {
		double bonus = this.salarioMensal * 0.10;
		this.salarioMensal += bonus;
		System.out.println("Seu salario com 10% de aumento fica: "+this.salarioMensal);
		
	}
	
	public double aumentoDez(double salario) {
		double bonus = this.salarioMensal * 0.10;
		salario += bonus;
		System.out.println("Seu salario com 10% de aumento fica: "+salario);
		return salario;
		
	}

}
