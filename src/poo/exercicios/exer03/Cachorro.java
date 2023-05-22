package poo.exercicios.exer03;

public class Cachorro extends Animal {
	private String raca;
	
	
	public Cachorro() {
	}


	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void emitirSom() {
		System.out.println(" Au! Au!");
	}
	
	
	

}
