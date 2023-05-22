package poo.exercicios.JogoDaVelha;

public abstract class Pecas {
	
	private Type type;
	
	public Pecas(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}


	public abstract String toString();	
	

}
