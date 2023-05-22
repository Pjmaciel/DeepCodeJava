package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional18 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String status;

		System.out.println("Digite o dia do mês: ");
		String day = keyboard.next();
		System.out.println("Digite numero correspondente ao mês:");
		String month = keyboard.next();
		System.out.println("Digite o ano:");
		String year = keyboard.next();
		
		// Caputre the size of string
		int dayLength = day.length();
		int monthLength = month.length();
		int yearLength = year.length();
		
		//Transformation String to Interger
		int dayStringToInt = Integer.parseInt(day);
		int monthStringToInt = Integer.parseInt(month);

		if ((dayLength == 2 &&dayStringToInt >= 1 && dayStringToInt <= 31) && ( monthLength == 2 && dayStringToInt >= 1 && monthStringToInt <= 12) && (yearLength == 4)) {
			if (monthStringToInt == 2 && dayStringToInt > 28) { // Month feb not contain plus 28 days
				
				status = "NÃO é uma data Valida";
				
			} else {
				
				status = "É uma data Valida";

			}

		} else {
			
			status = "NÃO é uma data Valida";

		}
		System.out.printf("%s/%s/%s %s", day, month, year, status);
		

		keyboard.close();

	}

}
