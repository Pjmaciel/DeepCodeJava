package poo.exercicios.interfaces.exer03;

public class Bird implements Animal {

	@Override
	public void eat() {
		System.out.print("Passaro: ");
		System.out.printf("%n\u001B[32m%s\u001B[0m%n","Comendo Semente");
		
	}

	@Override
	public void sleep() {
		System.out.print("Passaro: ");
		System.out.printf("%n\u001B[32m%s\u001B[0m%n","Dormindo na toca!");
		
	}

	@Override
	public void makeSound() {
		System.out.print("Passaro: ");
		System.out.printf("%n\u001B[32m%s\u001B[0m%n","piu-piu");
		
	}

}
