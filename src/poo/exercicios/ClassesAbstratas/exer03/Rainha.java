package poo.exercicios.ClassesAbstratas.exer03;

public class Rainha extends Pecas {

	public Rainha(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		System.out.println("A rainha \npode se mover em qualquer direção (horizontal, vertical ou diagonal) \npor qualquer número de casas.");
		super.mover();
	}
	
	

}
