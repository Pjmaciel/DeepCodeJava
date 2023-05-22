package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional16 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// Adornments
		String line = "#=#=#=#=#=#=#=";
		String endLine = "=#=#=#=#=#=#";
		String endApp = line + "END APP" + endLine;

		//
		System.out.println("O programa vai solucionar a equaçao de 2° grau: ");
		System.out.println("ax² + bx + c = 0");

		// Data input
		System.out.print("Digite o numero correspondente a letra a = ");
		int letterA = keyboard.nextInt();

		// Decision letter A
		if (letterA == 0) {
			System.out.print("A equaçao nao é do 2° grau");
		} else {
			System.out.print("Digite o numero correspondente a letra b = ");
			int letterB = keyboard.nextInt();
			System.out.print("Digite o numero correspondente a letra c = ");
			int letterC = keyboard.nextInt();
			System.out.println();

			// Calculat of Delta
			double delta = Math.pow(letterB, 2) - (4 * letterA * letterC);

			// Result of Delta
			if (delta < 0) {
				System.out.println("A equação não possui raízes reais./n");
			} else if (delta == 0) {
				double x = -letterB / (2 * letterA);
				System.out.printf("A equação possui uma raiz real: x = %.2f%n", x);
			} else {
				double x1 = (-letterB + Math.sqrt(delta)) / (2 * letterA);
				double x2 = (-letterB - Math.sqrt(delta)) / (2 * letterA);
				System.out.printf("A equação possui duas raízes reais: x1 = %.2f e x2 = %.2f%n", x1, x2);
			}
		}
		keyboard.close();
		System.out.println("\n"+endApp);
		

	}

}
