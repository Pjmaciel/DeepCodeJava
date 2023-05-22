package poo.exercicios.ClassesAbstratas.exer03;

public class Torre extends Pecas {

	public Torre(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void mover() {
		System.out.println("A torre se move em linha reta, horizontalmente ou verticalmente, \npor qualquer número de casas.");
		super.mover();
	}

}
