package atividade.opicionais;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// Active keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Input data
		System.out.print("Enter the temperature in Celsius( °c ) : ");
		double celsius = keyboard.nextDouble();

		// Logical Calculate
		double fahrenheit = (celsius * (9/5)) + 32;

		// Output data
		System.out.printf(" %.2f°C is %.2f°F", celsius, fahrenheit);

		keyboard.close();
	}

}
