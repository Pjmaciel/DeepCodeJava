package atividade.opicionais;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		//Active keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Input data
		System.out.println("Enter the value of the side of the square: ");
		int side = keyboard.nextInt();
		
		// Logical calculate
		int area = side * side;
		int areaDouble = area * 2;
		//Output data
		System.out.println("The value of square area is: " + area);
		System.out.println("And the double of area is: " + areaDouble);
		keyboard.close();		
	}

}
