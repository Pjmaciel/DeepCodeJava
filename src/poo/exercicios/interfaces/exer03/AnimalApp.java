package poo.exercicios.interfaces.exer03;

public class AnimalApp {

	public static void main(String[] args) {
		Animal cachorro = new Dog();
		Animal gato = new Cat();
		Animal passarinho = new Bird();
		
		cachorro.eat();
		cachorro.sleep();
		cachorro.makeSound();
		System.out.println("==========================");
		gato.eat();
		gato.sleep();
		gato.makeSound();
		System.out.println("==========================");
		passarinho.eat();
		passarinho.sleep();
		passarinho.makeSound();
		System.out.println("==========================");
		
		
		
		

	}

}
