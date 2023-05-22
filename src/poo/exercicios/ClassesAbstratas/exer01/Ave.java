package poo.exercicios.ClassesAbstratas.exer01;

public class Ave extends Animal {
	private int qtyPenas;

	public Ave(String nome, int qtyPenas) {
		super(nome);
		this.qtyPenas = qtyPenas;
	}

	public int getQtyPenas() {
		return qtyPenas;
	}

	public void setQtyPenas(int qtyPenas) {
		this.qtyPenas = qtyPenas;
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave!");
		super.emitirSom();
	}

	@Override
	public String toString() {
		emitirSom();
		return "Ave [getNome()=" + getNome() +",qtyPenas=" + qtyPenas + "]";
	}

	
	
	
	
	
}
