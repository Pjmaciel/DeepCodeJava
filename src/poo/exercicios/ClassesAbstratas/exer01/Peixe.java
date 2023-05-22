package poo.exercicios.ClassesAbstratas.exer01;

public class Peixe extends Animal {
	
	private String cor;

	public Peixe(String nome, String cor) {
		super(nome);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Peixe!");
		super.emitirSom();
	}

	@Override
	public String toString() {
		emitirSom();
		return "Peixe [getNome()=" + getNome() + ",cor=" + cor + "]";
	}
	
	
	

}
