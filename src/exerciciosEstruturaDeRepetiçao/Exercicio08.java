package exerciciosEstruturaDeRepetiçao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("quantos numeros voce quer sortear?");
		int qtdSorteio = keyboard.nextInt();
		
		for (int i = 1; i < qtdSorteio + 1; i++) {
			
			int numb = random.nextInt(15) + 1;
			
			System.out.println(i+ "° Numero: " + numb);
			
		}
		keyboard.close();
		
	}

}
