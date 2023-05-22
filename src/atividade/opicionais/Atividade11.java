package atividade.opicionais;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		// Active keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Input data
		System.out.print("Enter the First number interger : ");
		int numberInt1 = keyboard.nextInt();
		System.out.print("Enter ter Second number interger: ");
		int numberInt2 = keyboard.nextInt();
		System.out.print("Enter the First number Real : ");
		double numberReal = keyboard.nextDouble();

		// Structure logical calculate
		int multiplyAB = (numberInt1 * 2) * (numberInt2 / 2);
		double sumAC = (numberInt1 * 3) + numberReal;
		double cubeC = Math.pow(numberReal, 3);
		
		// Output data
		System.out.println("the product of twice the first and half of the second: " + multiplyAB);
		System.out.println("the sum of three times the first and the third: " + sumAC);
		System.out.println("the third raised to the cube: " + cubeC);
		
		keyboard.close();
	}

}
