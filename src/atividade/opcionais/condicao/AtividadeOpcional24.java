package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional24 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double result = 0;
		String mensagerParouImpar,mensagerPositivoOuNegativo,mensagerInteiroOuDecimal;
		
		System.out.println("Digite o 1° numero");
		double number1 = keyboard.nextInt();
		System.out.println("Digite o 2° numero");
		double number2 = keyboard.nextInt();
		
		System.out.println("Escolha qual operação você quer fazer:"
				+"\n1 - Soma"
				+"\n2 - Subtração"
				+"\n3 - Multiplicação"
				+"\n4 - Divisão"
				+"\nDigite o numero correspondente: ");
		int choice = keyboard.nextInt();
		
		//Choice 
		if(choice == 1) {
			 result = number1 + number2; 	
		}else if(choice == 2) {
			 result = number1 - number2;
		}else if (choice == 3) {
			 result = number1 * number2;
		}else if (choice == 4) {
			 result = number1 / number2;
		}else {
			System.out.println("Funçao invalida");
		}
		
		//Calcule Par ou impar
		if (result %2 ==0) {	
			mensagerParouImpar = "→ é par!";
		}else {
			mensagerParouImpar = "→ é impar!";
		}
		
		//calculo positive or negative
		if (result >= 0) {
			mensagerPositivoOuNegativo = "→ é positivo!";
		}else {
			mensagerPositivoOuNegativo = "→ é negativo!";
		}
		
		//Calculate inteiro ou decinal
		double inteiroOuDecimal = result / 1 % 1;
		if (inteiroOuDecimal == 0) {
			
			mensagerInteiroOuDecimal = "→ é inteiro!";
		} else {
			mensagerInteiroOuDecimal = "→ é decimal!";
		}
		keyboard.close();
		
		System.out.printf("Resultado : %.1f%n"
				        + "%S%n"
				        + "%S%n"
				        + "%S%n", result,mensagerParouImpar,mensagerPositivoOuNegativo,mensagerInteiroOuDecimal);
	}

}
