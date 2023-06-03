package poo.desafioModulo.model;

public class Departamento {
	private String name;

	public Departamento() {
	}

	public Departamento(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n→ Departamento ↴ " + "\n    • Nome: " + getName();
	}

}
