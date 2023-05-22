package atividade.opicionais;

import static java.lang.System.out;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		// Active Keyboard
		Scanner keyboard = new Scanner(System.in);
		out.println("------Calculating your ideal weight-------");
		out.println("");

		// Input Data

		out.print("Enter you Gender [M - Male]| [F - Female] :  ");
		String gender = keyboard.next();

		// Codition
		if (gender.equalsIgnoreCase("m")) {

			out.print("Digite sua Altura: ");
			double heightMale = keyboard.nextDouble();

			double imc = (72.7 * heightMale) - 58;
			
			out.println("--------------------------------------");
			out.println("For gender Male, your ideal weight is : " + imc);

		} else {
			out.print("Digite sua Altura: ");
			double heightFemale = keyboard.nextDouble();

			double imc = (62.1 * heightFemale) - 44.7;
			
			out.println("--------------------------------------");
			out.println("For gender Female, your ideal weight is : " + imc);

		}


		// Output Data
		
		out.print("-------------Fim----------------------");

		keyboard.close();
	}

}
