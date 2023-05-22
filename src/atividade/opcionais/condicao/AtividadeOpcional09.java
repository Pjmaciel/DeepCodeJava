package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Scanner;

public class AtividadeOpcional09 {

	public static void main(String[] args) {
		// Activate Keyboard Input
		Scanner keyboard = new Scanner(System.in);
		
		// Adornments
		String line = "---------------------------";
		String endLine = "----- END APP --------";

		// Variables
		int numb1, numb2, numb3, first = 0, second = 0, third = 0;

		// Dados de entrada
		out.println(line + "From the largest number to the smallest" + line);
		out.println("");
		out.print("Enter the First Number: ");
		numb1 = keyboard.nextInt();
		out.print("Enter the Second Number: ");
		numb2 = keyboard.nextInt();
		out.print("Enter the Third Number: ");
		numb3 = keyboard.nextInt();
		out.println(line);

		// Decision
		// For number 1
		if (numb1 > numb2 && numb1 > numb3) {
			third = numb1;
		} else if (numb1 < numb2 && numb1 < numb3) {
			first = numb1;
		} else {
			second = numb1;
		}
		
		// For number 2
		if (numb2 > numb1 && numb2 > numb3) {
			third = numb2;
		} else if (numb2 < numb3 && numb2 < numb1) {
			first = numb2;
		} else {
			second = numb2;
		}
		
		// For number 3
		if (numb3 > numb2 && numb3 > numb1) {
			third = numb3;
		} else if (numb3 < numb2 && numb3 < numb1) {
			first = numb3;
		} else {
			second = numb3;
		}
		
		keyboard.close();
		
		out.println(third + " -> " + second + " -> " + first);
		out.print(endLine);
	}

}
