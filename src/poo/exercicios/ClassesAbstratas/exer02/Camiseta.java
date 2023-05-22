package poo.exercicios.ClassesAbstratas.exer02;

public class Camiseta extends Produto {
	
	private String cor;

	public Camiseta(String cor,int quantidade) {
		super(quantidade);
		this.cor = cor;
		setPrecoUnitario(25);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public double totalCompa() {
		// TODO Auto-generated method stub
		return super.totalCompa();
	}

	@Override
	public double aplicarDesconto() {
		double porcentagem = 0;
		if (this.cor.equalsIgnoreCase("branca")) {
			porcentagem = 0.25;
		} else {
			porcentagem = 0.10;
		}
		double desconto = totalCompa() - (totalCompa() * porcentagem);
		return desconto;
	}

	@Override
	public String toString() {
		return "Camiseta [cor=" + cor + ", totalCompa=" + totalCompa() + ", aplicarDesconto()=" + aplicarDesconto()
				+ ", getPrecoUnitario()=" + getPrecoUnitario() + "]";
	}
	
	
	

}
