package poo.exercicios.interfaces.exer03;

public class Dog implements Animal {

	@Override
	public void eat() {
		
		System.out.print("Cachorro: ");
		System.out.printf("%n\u001B[33m%s\u001B[0m%n","Roendo Osso");

	}

	@Override
	public void sleep() {
		System.out.print("Cachorro: ");
		System.out.printf("%n\u001B[33m%s\u001B[0m%n","Dormindo com as patas para cima!");

	}

	@Override
	public void makeSound() {
		System.out.print("Cachorro: ");
		System.out.printf("%n\u001B[33m%s\u001B[0m%n","Au! Au! Au!");

	}

}
