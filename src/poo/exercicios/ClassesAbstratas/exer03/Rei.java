package poo.exercicios.ClassesAbstratas.exer03;

public class Rei extends Pecas {

	public Rei(String nome) {
		super(nome);
	}

	@Override
	public void mover() {
		System.out.println("O rei pode se mover uma casa em qualquer direção (horizontal, vertical ou diagonal).");
		super.mover();
	}
	


}
