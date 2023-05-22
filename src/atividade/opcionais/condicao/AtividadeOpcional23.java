package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional23 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Digite um numero:");
		double num = keyboard.nextDouble();

		double whoNumber = num / 1 % 1;

		if (whoNumber == 0) {
			System.out.printf("%.0f é inteiro!", num);
		} else
			System.out.printf("%.1f é decimal!", num);
		
		keyboard.close();
	}
}
