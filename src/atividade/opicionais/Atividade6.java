package atividade.opicionais;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		// Activate Keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Declaration from Values of variables
		double pi = 3.14159;
		
		
		//input data
		System.out.print("Enter Radius of circle number: ");
		double radius = keyboard.nextDouble();
		
		//Calculation structure
		double area = pi * radius * radius;
		
		// Output Data
		System.out.printf("A = %.1f", area);

		keyboard.close();

	}

}
