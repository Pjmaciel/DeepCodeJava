package poo.exercicios.ClasseHerancaPolimorfismo.exer06;

import java.util.ArrayList;


public class Produto {
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private static int cont = 0;
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	
	
	public Produto() {
	}

	public Produto(String nome, String descricao, double precoUnitario) {
		this.nome = nome;
		this.descricao = descricao;
		if (this.precoUnitario < 0) {
			this.precoUnitario = 0.0;
		}
		this.precoUnitario = precoUnitario;
		produtos.add(cont,this);
		this.id = ++cont;
		
	}


	public static void listarProdutos() {
		System.out.println("====== Nome e Descrição =====");
		for (Produto produto : produtos) {
			if (produto != null) {
				System.out.println("ID: "+ produto.getId()  + " \nNome: " + produto.nome + "\nDescrição: " + produto.descricao + " Preço Unitario: "+produto.precoUnitario);
				System.out.println("---------------------------------------------------------------------------------------------");
				
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public static void setProdutos(ArrayList<Produto> produtos) {
		Produto.produtos = produtos;
	}	

}
