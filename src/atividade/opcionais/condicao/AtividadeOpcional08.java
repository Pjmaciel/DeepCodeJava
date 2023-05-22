package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Scanner;

public class AtividadeOpcional08 {

	public static void main(String[] args) {
		// Activate keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Adornments
		String line = "---------------------------";
		String endLine = "-------FIM Do PROGRAMA--------";

		// Variables
		Double numb1, numb2, numb3;
		String product = "";

		// Dados de entrada
		out.println(line + "The lowest price" + line);
		out.println("");
		out.print("Enter the price of 1° product: ");
		numb1 = keyboard.nextDouble();
		out.print("Enter the price of 2° product: ");
		numb2 = keyboard.nextDouble();
		out.print("Enter the price of 3° product: ");
		numb3 = keyboard.nextDouble();
		out.println(line);

		// Decisao
		if (numb1 < numb2 && numb1 < numb3) {
			product = "1° product";
		} else if (numb2 < numb1 && numb2 < numb3) {
			product = "2° product";
		} else if (numb3 < numb2 && numb3 < numb1) {
			product = "3° product";
		}
		
		keyboard.close();
		
		out.println("Buy the " + product);
		out.print(endLine);
	}

}
