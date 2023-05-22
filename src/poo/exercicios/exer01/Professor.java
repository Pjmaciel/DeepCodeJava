package poo.exercicios.exer01;

public class Professor extends Pessoa {
	
	// Atributo privado da classe Professor
	private String disciplinas;
	
    // Construtor da classe Professor, que chama o construtor da classe Pai (Pessoa)
	public Professor(String nome, int idade, String endereco, String disciplinas) {
		super(nome, idade, endereco);
		this.disciplinas = disciplinas;
	}
    // Método getter e setter do atributo disciplinas
	public String getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	

}
