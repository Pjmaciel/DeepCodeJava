package exerciciosEstruturaDeRepetiçao;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {

		   Scanner keyboard = new Scanner(System.in);

			int num1, num2, num3, num4, num5, maior;

			System.out.print("Digite o primeiro número: ");
			num1 = keyboard.nextInt();

			System.out.print("Digite o segundo número: ");
			num2 = keyboard.nextInt();

			System.out.print("Digite o terceiro número: ");
			num3 = keyboard.nextInt();

			System.out.print("Digite o quarto número: ");
			num4 = keyboard.nextInt();

			System.out.print("Digite o quinto número: ");
			num5 = keyboard.nextInt();

			maior = num1;

			if (num2 > maior) {
				maior = num2;
			}

			if (num3 > maior) {
				maior = num3;
			}

			if (num4 > maior) {
				maior = num4;
			}

			if (num5 > maior) {
				maior = num5;
			}

			System.out.println("O maior número é: " + maior);

			keyboard.close();
	}
}

