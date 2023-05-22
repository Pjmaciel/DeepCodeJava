package poo.exercicios.exer06;

import static java.lang.System.out;

public class Notebook extends Produto {
	
	private int capacidadeArmazenamento;
	
	

	public Notebook(String nome, double preco, int estoque, int capacidadeArmazenamento) {
		super(nome, preco, estoque);
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}

	public int getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}

	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}

	@Override
	public void vender(int quantidade) {
		double bonus = 0;
		if(getEstoque() >= quantidade  && this.capacidadeArmazenamento > 2) {
			bonus = (this.capacidadeArmazenamento - 2) * 100;
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
