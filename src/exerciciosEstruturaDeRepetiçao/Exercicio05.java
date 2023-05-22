package exerciciosEstruturaDeRepetiçao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Variaveis declaradas
		
		
		System.out.println("Quantidade de pessoas Curadas: ");
		double peopleHealth = keyboard.nextDouble();
		System.out.println("Quantidade de pessoas Infectadas: ");
		double peopleInfected = keyboard.nextDouble();
		System.out.println("Taxa de aumento de crescimento de curados: ");
		double healthRate = keyboard.nextDouble();
		System.out.println("Taxa de aumento de crescimento de Infectados ");
		double infectedRate = keyboard.nextDouble();
		int countmounth = 0;

		// Loop para calculo de quantidade de curados vs infectados por mes
		while (peopleHealth < peopleInfected) {
			peopleHealth = peopleHealth + (peopleHealth * healthRate);
			peopleInfected = peopleInfected + (peopleInfected * infectedRate);
			countmounth++;
		}
		keyboard.close();
		System.out.printf(" O numero de meses para Pessoas curadas ultrapassar as pessoas infectadas é %d.",
				countmounth);
		
	}

}
