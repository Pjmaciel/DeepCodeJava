package atividade.opicionais;

import java.util.Scanner;

public class Atividade17 {

	public static void main(String[] args) {
		// Active Keyboard
		Scanner keyboard = new Scanner(System.in);

		// Input Data
		System.out.print("Enter the size of the area to be painted(in m²): ");
		double area = keyboard.nextDouble();

		double qtyOfLiterOfPaint = (area * 1) / 6; // result in liter

		// Conditions and Output data
		if (qtyOfLiterOfPaint >= 3.6 && qtyOfLiterOfPaint < 18) {
			double qtyOf36PaintCan = qtyOfLiterOfPaint / 3.6; // Result in cans
			double priceOf36PaintCan = Math.round(qtyOf36PaintCan) * 25; // price
			System.out.printf("You need in round : %.2f%n Liters", qtyOfLiterOfPaint);
			System.out.printf("Quantity of paint cans of 3.6 liters : %.0f%n", qtyOf36PaintCan);
			System.out.printf("You will pay: R$ %.2f", priceOf36PaintCan);
		} else if (qtyOfLiterOfPaint >= 18) {
			double qtyOf18PaintCan = qtyOfLiterOfPaint / 18; // Result in paint cans of 18 liters
			double qtyOf36PaintCan = qtyOf18PaintCan / 3.6; //
			double price18PaintCan = Math.round(qtyOf18PaintCan) * 80; // price 18 paint can
			double price36PaintCan = Math.round(qtyOf36PaintCan) * 25; // price 3.6 paint can
			double sumCans = price18PaintCan + price36PaintCan;
			System.out.printf("You need in round: %.2f%n Liters", qtyOfLiterOfPaint);
			System.out.printf("Quantity of paint cans of 18 liters: %.0f%n", qtyOf18PaintCan);
			System.out.printf("Quantity of paint cans of 3.6 liters: %.0f%n", qtyOf36PaintCan);
			System.out.printf("You will pay: R$ %.2f", sumCans);

		} else {
			System.out.println("You need in round: " + qtyOfLiterOfPaint + " Liters " + "\nQuantity of paint can : 1 "
					+ "\nYou will pay: : R$ 25,00");

		}

		keyboard.close();

	}

}
