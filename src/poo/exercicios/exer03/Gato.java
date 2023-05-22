package poo.exercicios.exer03;

public class Gato extends Animal {
	private String corPelo;
	
	
	public Gato() {
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void emitirSom() {
		System.out.println(" Miau!");
		
	}
	
	

}
