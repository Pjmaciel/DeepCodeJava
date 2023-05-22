package poo.exercicios.exer04;

import static java.lang.System.out;

public class Emprestimo {
	
	private String dataEmprestimo;
	private Pessoa pessoa;
	private Livro livro;
	
	public Emprestimo(Pessoa pessoa, Livro livro,String dataEmprestimo) {
		this.pessoa = pessoa;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public void realizarEmprestimo(Emprestimo emprestimo) {
		if(livro.isDisponibilidade()) {
			out.println("Livro: "+getLivro().getTitulo()+ " foi emprestado com Sucesso! Para o Cliente: " + pessoa.getNome());
			out.println("Data de emprestimo: " + this.dataEmprestimo);
			livro.setDisponibilidade(false);
		}else {
			System.out.println("Não foi possivel emprestar para o cliente: "+ pessoa.getNome() + ", pois o livro " + getLivro().getTitulo() + " ainda não foi devolvido!" );
		}
	}

}
