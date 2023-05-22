package poo.exercicios.exer01;

public class Aluno extends Pessoa {
	// Atributo privado da classe Aluno
	private int matricula;
	
    // Construtor da classe Aluno, que chama o construtor da classe Pai (Pessoa)
	public Aluno(String nome, int idade, String endereco, int matricula) {
		super(nome, idade, endereco);
		this.matricula = matricula;
	}
	// Método getter e setter do atributo matricula
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
