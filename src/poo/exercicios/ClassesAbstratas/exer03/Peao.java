package poo.exercicios.ClassesAbstratas.exer03;

public class Peao extends Pecas {

	public Peao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void mover() {
		System.out.println("Os peões têm movimentos mais complexos. \nEles se movem para frente uma casa, \nexceto no primeiro movimento, quando podem se mover duas casas para frente. \nOs peões capturam as peças inimigas na diagonal e têm regras especiais de movimento para o en passant (captura ao passar) \ne a promoção do peão quando ele alcança a oitava fileira.");
		super.mover();
	}

}
