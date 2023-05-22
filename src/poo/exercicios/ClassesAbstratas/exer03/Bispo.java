package poo.exercicios.ClassesAbstratas.exer03;

public class Bispo extends Pecas {

	public Bispo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mover() {
		System.out.println("O bispo se move em linha reta, \ndiagonalmente, por qualquer número de casas.");
		super.mover();
	}

}
