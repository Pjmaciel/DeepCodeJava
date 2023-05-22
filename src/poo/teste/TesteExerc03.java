package poo.teste;

import poo.exercicios.exer03.Animal;
import poo.exercicios.exer03.Cachorro;
import poo.exercicios.exer03.Gato;

public class TesteExerc03 {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();
		
		animal.emitirSom();
		cachorro.emitirSom();
		gato.emitirSom();
		

	}

}
