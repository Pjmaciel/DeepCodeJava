package poo.exercicios.exer04;

public class Livro {
	
	private String titulo;
	private String autor;
	private String editora;
	private boolean disponibilidade;
	
	
	public Livro(String titulo, String autor, String editora, boolean disponibilidade) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.disponibilidade = disponibilidade;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	

}
