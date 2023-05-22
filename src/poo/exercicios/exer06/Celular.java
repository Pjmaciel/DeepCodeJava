package poo.exercicios.exer06;

import static java.lang.System.out;

public class Celular extends Produto {
	
	private int tamanhoTela;

	public Celular(String nome, double preco, int estoque,int tamanhoTela) {
		super(nome, preco, estoque);
		this.tamanhoTela = tamanhoTela;
	}

	public int getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	@Override
	public void vender(int quantidade) {
		double bonus = 0;
		if(getEstoque() >= quantidade  && this.tamanhoTela > 4) {
			bonus = (this.tamanhoTela - 4) * 100;
			double valorTotal = (getPreco() * quantidade) - bonus;
			out.printf("Produto: %s %n"
					+ "Quantidade: %d %n"
					+ "Preço unitario: R$ %.2f%n"
					+ "valor do desconto: R$ %.2f%n"
					+ "Valor total =  R$ %.2f %n " ,getNome(), quantidade , getPreco(), bonus ,valorTotal);				
		}else {
			super.vender(quantidade);
		}
	}
	
	

}
