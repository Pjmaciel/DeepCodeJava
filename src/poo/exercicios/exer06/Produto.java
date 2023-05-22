package poo.exercicios.exer06;

import static java.lang.System.out;

public class Produto {
	private String nome;
	private double preco;
	private int estoque;
	

	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	/*
	 * verifica se a quantidade solicitada 
	 * está disponível em estoque,
	 * caso positivo atualiza o valor do estoque 
	 * e retorna o valor total da venda
	 * 
	 */
	public void vender(int quantidade) {
		double valorTotal = 0;
		if(this.estoque >= quantidade) {
			valorTotal = this.preco * quantidade;
			out.printf("Produto: %s %n"
					+ "Quantidade: %d %n"
					+ "Preço unitario: %.2f%n"
					+ "Valor total =  %.2f %n" ,this.nome,quantidade,this.preco, valorTotal);		
		}else if(this.estoque <= quantidade && this.estoque > 0 ) {
			out.println("Não temos estoque disponiveis para a quantidade desejada");
			out.printf("Estoque atual para o produto %s : %d %n" , this.nome,this.estoque);			
		}else {
			out.println("Não temos estoque disponiveis para a quantidade Desejad");
		}
	}
	
	
}
