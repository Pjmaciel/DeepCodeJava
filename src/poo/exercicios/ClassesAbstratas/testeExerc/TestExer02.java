package poo.exercicios.ClassesAbstratas.testeExerc;

import poo.exercicios.ClassesAbstratas.exer02.Calca;
import poo.exercicios.ClassesAbstratas.exer02.Camiseta;
import poo.exercicios.ClassesAbstratas.exer02.Vestido;

public class TestExer02 {
	public static void main(String[] args) {
		Calca reta = new Calca("reta", 3);
		Calca skiny = new Calca("skiny", 2);

		System.out.println(reta.toString());
		System.out.println("===== Com Desconto 10% ====");
		System.out.println(skiny.toString());
		System.out.println("=========================");

		Vestido longo = new Vestido("Vestido Longo", 3);
		System.out.println(longo.toString());
		System.out.println("=========================");


		Camiseta branca = new Camiseta("branca", 5);
		Camiseta vermelha = new Camiseta("vermelha", 5);
		System.out.println(branca.toString());
		System.out.println("===== Com Desconto 10% ====");
		System.out.println(vermelha.toString());

	}

}
