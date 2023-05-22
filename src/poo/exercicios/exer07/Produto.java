package poo.exercicios.exer07;

import java.util.ArrayList;

public class Produto {
	/*
	 * Essa variável é um atributo da classe "Produto" e armazena uma lista de objetos do tipo "Produto".
	 *  Por ser estática, essa variável é compartilhada por todas as instâncias desta classe.
	 *  é igual ao contadot universal explicado na aula de projeto de java com poo Thiago Aguiar
	 */
    private static ArrayList<Produto> listaProdutos = new ArrayList<>(); 

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        listaProdutos.add(this); // adiciona o produto na lista de produtos ao ser criado
    }

    public static void listarProdutos() {
    	System.out.println("=== ITENS DO SUPERMERCADO ===");
        for (Produto produto : listaProdutos) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco() + " - " + produto.getQuantidade() + " unidades");
        }
    }
    
    /*
     *  recebe a quantidade de itens que será retirada do estoque do produto. 
     *  Ele subtrai essa quantidade do atributo "quantidade" do objeto "Produto" que chamou o método.
     */
    
    public void retirarQuantidade(int quantidade) {
        this.quantidade -= quantidade; //
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
