package poo.desafioModulo.model;

public class Curso {
	
	private String nome;

	public Curso() {
	}

	public Curso(String nome) {
		this.nome = nome;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}


	@Override
	public String toString() {
		return "Curso ↴" + "\n → Nome: " + getName()  + "\n";
	}


}
