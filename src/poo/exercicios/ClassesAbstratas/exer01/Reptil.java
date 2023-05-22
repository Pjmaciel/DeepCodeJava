package poo.exercicios.ClassesAbstratas.exer01;

public class Reptil extends Animal {

	private double tempSangue;

	public Reptil(String nome, double tempSangue) {
		super(nome);
		this.tempSangue = tempSangue;
	}

	public double getTempSangue() {
		return tempSangue;
	}

	public void setTempSangue(double tempSangue) {
		this.tempSangue = tempSangue;
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Reptil");
		super.emitirSom();
	}

	@Override
	public String toString() {
		emitirSom();
		return "Reptil [ getNome()=" + getNome() +" tempSangue=" + tempSangue + "]";
	}
	
	

}
