package atividade.opicionais;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		//Active keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Input data
		System.out.print("Enter the temperature in Fahrenheit( °F ) : ");
		double fahrenheit = keyboard.nextInt();
				
		//Logical Calculate
		double celsius = 5*((fahrenheit - 32)/9);
		
		//Output data
		System.out.printf("The %.0f°F is %.2f°C", fahrenheit, celsius);	
		
		keyboard.close();
	}

}
