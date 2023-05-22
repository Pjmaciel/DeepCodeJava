package poo.exercicios.ClassesAbstratas.exer01;

public class Mamifero extends Animal {
	
	private int numeroPatas;
	
	

	public Mamifero(String nome, int numeroPatas) {
		super(nome);
		this.numeroPatas = numeroPatas;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Mamifero");
		super.emitirSom();
	}

	@Override
	public String toString() {
		emitirSom();
		return "Mamifero [getNome()=" + getNome() +",numeroPatas=" + numeroPatas +  "]";
	}
	
	
	
	

	

}
