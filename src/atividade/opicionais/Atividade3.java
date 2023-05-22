package atividade.opicionais;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// Activate Keyboard input
		Scanner keyboard = new Scanner(System.in);
			
		//Input Data
		System.out.print("Enter The First Number: ");
		int number1 = keyboard.nextInt();
		System.out.print("Enter the Second Number: ");
		int number2 = keyboard.nextInt();
		
		//Structure logical
		int result = number1 + number2;
			
		//Output Data
		System.out.println("The sum of number:  " + number1 + " and number: " + number2 + " was: " + result);
		keyboard.close();
	
	}

}
