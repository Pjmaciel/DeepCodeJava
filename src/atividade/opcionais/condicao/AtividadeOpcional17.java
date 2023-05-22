package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional17 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// Data Input
		System.out.println("Digite o ano que quer analisar: ");
		int year = keyboard.nextInt();
		
		//Coditions
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {

			System.out.printf("O ano %s é Bissexto", year);
			
		} else {
			
			System.out.printf("O ano %s NÃO é Bissexto", year);
			
		}

		keyboard.close();
	}

}
