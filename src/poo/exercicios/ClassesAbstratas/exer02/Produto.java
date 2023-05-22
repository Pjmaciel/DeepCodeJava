package poo.exercicios.ClassesAbstratas.exer02;

public abstract class Produto {
	
	private double precoUnitario;
	private int quantidade;
	
		
	public Produto(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public double totalCompa() {
		double calculoFinal = this.precoUnitario * this.quantidade;
		return calculoFinal;
		
	}
	
	public double aplicarDesconto() {
		double desconto =0;
		return desconto;
		
	}

}
