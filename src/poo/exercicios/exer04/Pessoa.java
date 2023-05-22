package poo.exercicios.exer04;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void devolverLivro(Emprestimo Emprestimo) {
		System.out.println("Livro Devolvido com sucesso!");
		Emprestimo.getLivro().setDisponibilidade(true);
		
	}
	
	

}
