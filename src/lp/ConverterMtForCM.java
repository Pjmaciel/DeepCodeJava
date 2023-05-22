package lp;

import static java.lang.System.out;

import java.util.Scanner;

public class ConverterMtForCM {

	public static void main(String[] args) {
		// Activate Keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// input date
		out.println("------meters to centimeters converter-------");
		out.print("Enter the value in meters: ");
		long met = keyboard.nextLong();
		long convert = met * 100;

		// output date
		out.println("------------------------------------");
		out.println("The value in centimeters is : " + convert);
		out.print("------------------------------------");
		keyboard.close();
	}

}
