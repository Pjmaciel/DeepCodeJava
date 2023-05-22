package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional13 {

	public static void main(String[] args) {
		// Activate keyboard Input
		Scanner keyboard = new Scanner(System.in);

		// Variables
		String message = "";
		
		//Data input
		System.out.print("Digite um numero entre 1 a 7: ");
		int dayOfWeek = keyboard.nextInt();
		
		//decision
		if (dayOfWeek == 1) {
			message = "Domingo";
		} else if (dayOfWeek == 2) {
			message = "Segunda";
		} else if (dayOfWeek == 3) {
			message = "Terça";
		} else if (dayOfWeek == 4) {
			message = "Quarta";
		} else if (dayOfWeek == 5) {
			message = "Quinta";
		} else if (dayOfWeek == 6) {
			message = "Sexta";
		} else if(dayOfWeek == 7) {
			message = "Sabado";
		}else {
			System.out.println("Valor invalido!");
		}
		
		System.out.printf("O dia correspondente ao numero %d - %s", dayOfWeek, message);
		keyboard.close();
	}

}
