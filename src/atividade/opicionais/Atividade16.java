package atividade.opicionais;

import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		// Active Keyboard
		Scanner keyboard = new Scanner(System.in);

		// Frescurinhas
		String messegerOnlyOne = "\nQuantity of paint cans : 1 \nPrice : R$ 80,00";

		// Input Data
		System.out.print("Enter the size of the area to be painted(in m²): ");
		double area = keyboard.nextDouble();

		double qtyOfLier = (area * 1) / 3; // result in liter
		if (qtyOfLier <= 18) {
			if (qtyOfLier > 1) { // Insert the char S in final of Liter
				String insertS = "s";
				System.out.printf("You will need approximately : %.2f Liter%s ", qtyOfLier, insertS);
				System.out.print(messegerOnlyOne);
			} else {
				System.out.printf("You need in round: %.2f liter", qtyOfLier);
				System.out.print(messegerOnlyOne);
			}
		} else {
			double qtyCanOfPaint = qtyOfLier / 18;// result in Paint Cans
			double price = qtyCanOfPaint * 80;// Result in cash
			System.out.printf(
					"You need in round : %.0f liters %nQuantity of paint cans : %.0f Cans %nYou will pay: R$ %.2f",
					qtyOfLier, qtyCanOfPaint, price);

		}

		keyboard.close();

	}

}
