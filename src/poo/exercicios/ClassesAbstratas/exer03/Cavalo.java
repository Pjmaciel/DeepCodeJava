package poo.exercicios.ClassesAbstratas.exer03;

public class Cavalo extends Pecas {

	public Cavalo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mover() {
		System.out.println(" O cavalo se move em um padrão especial em forma de 'L'. "
				+ "\nEle pode se mover duas casas em uma direção (horizontal ou vertical) "
				+ "\ne depois uma casa em uma direção perpendicular.");
		super.mover();
	}

}
