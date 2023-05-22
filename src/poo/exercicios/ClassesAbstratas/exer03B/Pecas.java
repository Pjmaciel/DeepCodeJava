package poo.exercicios.ClassesAbstratas.exer03B;

public abstract class Pecas {
	
	private Cor cor;

    public Pecas(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public abstract String toString();

}
