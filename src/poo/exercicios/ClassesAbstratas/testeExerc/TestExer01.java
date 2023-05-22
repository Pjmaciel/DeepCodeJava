package poo.exercicios.ClassesAbstratas.testeExerc;

import poo.exercicios.ClassesAbstratas.exer01.Anfibio;
import poo.exercicios.ClassesAbstratas.exer01.Ave;
import poo.exercicios.ClassesAbstratas.exer01.Mamifero;
import poo.exercicios.ClassesAbstratas.exer01.Peixe;
import poo.exercicios.ClassesAbstratas.exer01.Reptil;

public class TestExer01 {

	public static void main(String[] args) {
		Anfibio Sapo = new Anfibio("Sapo", true);

		Ave Aguia = new Ave("Passaro", 7000);

		Mamifero Cachorro = new Mamifero("Cachorro", 4);

		Peixe Dourado = new Peixe("Peixe Dourado", "Dourada");

		Reptil Jacare = new Reptil("Jacaré de Açu", 20);

		System.out.println(Sapo.toString());
		System.out.println("----------------------------------");
		System.out.println(Aguia.toString());
		System.out.println("----------------------------------");
		System.out.println(Cachorro.toString());
		System.out.println("----------------------------------");
		System.out.println(Dourado.toString());
		System.out.println("----------------------------------");
		System.out.println(Jacare.toString());
	}

}
