package atividade.opcionais.condicao;

import java.util.Random;

public class AtividadeOpcional14 {

	public static void main(String[] args) {
		//Generate random notes
		Random random = new Random();
		
		//variables
		double exam1 = random.nextDouble(11);
		double exam2 = random.nextDouble(11);
		String status;
		
		//Data input
		System.out.printf("Nota da 1° prova: %.1f%n", exam1);
		System.out.printf("Nota da 2° prova: %.1f%n", exam2);
		
		//Calculate notes
		double media = (exam1 + exam2) / 2;
		
		// Decision
		if (media >= 9.0 && media <= 10.0) {
			status = "A";
		}else if(media > 7.5 && media <= 8.9) {
			status = "B";
		}else if(media > 6.0 && media <= 7.4) {
			status = "C";
		}else if(media > 4.0 && media <5.9) {
			status = "D";
		}else {
			status = "E";
		}
		System.out.println("\n-----------------------------");
		System.out.println("→ Conceito: " + status);
		System.out.println("-----------------------------");
		System.out.println("\n---------- END APP ----------");
		
	}

}
