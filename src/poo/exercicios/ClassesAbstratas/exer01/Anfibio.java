package poo.exercicios.ClassesAbstratas.exer01;

public class Anfibio extends Animal {

	private boolean adaptacaoAmbientes;

	public Anfibio(String nome, boolean adaptacaoAmbientes) {
		super(nome);
		this.adaptacaoAmbientes = adaptacaoAmbientes;
	}

	public boolean isAdaptacaoAmbientes() {
		return adaptacaoAmbientes;
	}

	public void setAdaptacaoAmbientes(boolean adaptacaoAmbientes) {
		this.adaptacaoAmbientes = adaptacaoAmbientes;
	}

	@Override
	public void emitirSom() {
		System.out.println("Barulho de Anfibio!");

	}

	@Override
	public String toString() {
		emitirSom();
		return "\nAnfibio [ getNome()=" + getNome() + ", adaptacaoAmbientes=" + adaptacaoAmbientes + "]";
	}
	
	

}
