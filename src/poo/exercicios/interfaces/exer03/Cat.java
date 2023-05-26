package poo.exercicios.interfaces.exer03;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.print("Gato: ");
		System.out.printf("%n\u001B[31m%s\u001B[0m%n","Comendo Peixe");

	}

	@Override
	public void sleep() {
		System.out.print("Gato: ");
		System.out.printf("%n\u001B[31m%s\u001B[0m%n","Dormindo Enrrolado dentro de uma caixa.");

	}

	@Override
	public void makeSound() {
		System.out.print("Gato: ");
		System.out.printf("%n\u001B[31m%s\u001B[0m%n","Miau, Prrrr!");

	}

}
