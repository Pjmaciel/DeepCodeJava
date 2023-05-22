package poo.exercicios.ClassesAbstratas.exer02;

public class Calca extends Produto {

	private String tipoCorte;

	public Calca(String tipoCorte,int quantidade) {
		super(quantidade);
		this.tipoCorte = tipoCorte;
	}

	public String getModelo() {
		return tipoCorte;
	}

	public void setModelo(String tipoCorte) {
		this.tipoCorte = tipoCorte;
	}

	@Override
	public double totalCompa() {
		if (this.tipoCorte.equalsIgnoreCase("reta")) {
			setPrecoUnitario(50);
		} else if (this.tipoCorte.equalsIgnoreCase("skiny")) {
			setPrecoUnitario(100);
		}
		return super.totalCompa();
	}

	@Override
	public double aplicarDesconto() {
		double porcentagem = 0;
		if (this.tipoCorte.equalsIgnoreCase("reta")) {
			porcentagem = 0.05;
		} else if (this.tipoCorte.equalsIgnoreCase("skiny")) {
			porcentagem = 0.10;
		}
		double desconto = totalCompa() - (totalCompa() * porcentagem);
		return desconto;
	}

	@Override
	public String toString() {
		return "Calca [tipoCorte=" + tipoCorte + ", getPrecoUnitario()=" + getPrecoUnitario() + ", totalCompa()="
				+ totalCompa() + ", aplicarDesconto()=" + aplicarDesconto() + "]";
	}
	

}
