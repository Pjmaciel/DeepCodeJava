package poo.exercicios.ClassesAbstratas.exer02;

public class Vestido extends Produto {
	
	private String tipo;

	public Vestido(String tipo, int quantidade) {
		super( quantidade);
		this.tipo = tipo;
		setPrecoUnitario(200);
	}

	public String getTamanho() {
		return tipo;
	}

	public void setTamanho(String tamanho) {
		this.tipo = tamanho;
	}

	@Override
	public double totalCompa() {
		return super.totalCompa();
	}

	@Override
	public double aplicarDesconto() {
		double desconto = totalCompa() - (totalCompa() * 0.1);
		return desconto;
	}

	@Override
	public String toString() {
		return "Vestido [tipo=" + tipo + ", getPrecoUnitario()=" + getPrecoUnitario() + ", totalCompa()=" + totalCompa()
				+ ", aplicarDesconto()=" + aplicarDesconto() + "]";
	}
	
	

}
