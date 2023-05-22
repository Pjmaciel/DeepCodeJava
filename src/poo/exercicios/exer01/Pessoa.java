package poo.exercicios.exer01;

public class Pessoa {
	// Atributos privados da classe Pessoa
	private String nome;
	private int idade;
	private String endereco;

	// Construtor da classe Pessoa
	public Pessoa(String nome, int idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	// Métodos getters e setters dos atributos nome, idade e endereco
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdadade() {
		return idade;
	}

	public void setIdadade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
