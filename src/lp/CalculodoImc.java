package lp;

import static java.lang.System.out;

import java.util.Scanner;

public class CalculodoImc {

	public static void main(String[] args) {
		 //Active Keyboard
		 Scanner keyboard = new Scanner(System.in);
		 out.println("------Calculating your ideal weight-------");
		 out.println("");
		 
		 //Input Data
		 out.print("Digite sua Altura: ");
		 double height = keyboard.nextDouble();
		 out.println("");
		 
		 // Calculation 
		 double imc = (72.7 * height) - 58;
		
		 //Output Data
		 out.println("--------------------------------------");
		 out.println("Your ideal weight is: " + imc);
		 out.print("-------------Fim----------------------");
		 
		 keyboard.close();
		 

	}

}
