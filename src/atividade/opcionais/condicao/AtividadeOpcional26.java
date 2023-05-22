package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Scanner;

public class AtividadeOpcional26 {

	public static void main(String[] args) {
		// Activate keyboard input
				Scanner keyboard = new Scanner(System.in);

				// Adornments
				String dottedLine = "--------------------------";

				// Variables
				int literAlcohol;
				int litertGasoline;
				double priceAlcohol = 2.90;
				double priceGasoline = 3.30;
				double totalWhitoutDiscount;
				double discount;
				String showDiscount;
				String choice;

				// Input Data
				out.println(dottedLine + " The Litle Gas Station" + dottedLine);
				out.println("");
				out.println("Avaliables Fuels: ");
				out.println("Alcohol - [ A ]");
				out.println("Gasoline - [ G ]");
				out.print("Enter the Letter Corresponding to the product:  ");
				choice = keyboard.next();
				choice = choice.toUpperCase();

				// Choice A
				if (choice.equals("A")) {
					out.println(dottedLine);
					out.println("You Chose The Product  ALCOHOL...");
					out.println("The price per liter R$" + priceAlcohol);
					out.print("Enter how many liters you want to buy: ");
					literAlcohol = keyboard.nextInt();

					// Calculate Total Whitout Discount Alcohol
					totalWhitoutDiscount = literAlcohol * priceAlcohol;

					// Calculate Discount ALCOHOL
					if (literAlcohol > 20) {
						discount = totalWhitoutDiscount - (totalWhitoutDiscount * 0.05);
						showDiscount = "5%";
					} else {
						discount = totalWhitoutDiscount - (totalWhitoutDiscount * 0.03);
						showDiscount = "3%";
					}
					// Output Data ALCOHOL
					out.println(dottedLine);
					out.println("");
					out.println("Total R$" + totalWhitoutDiscount);
					out.println("You Got a Discount :  " + showDiscount);
					out.println("You will pay : R$" + discount);
					out.println("");

				} else if (choice.equals("G")) { // Choice G
					out.println(dottedLine);
					out.println("You Chose The Product GASOLINE...");
					out.println("The price per liter R$" + priceGasoline);
					out.print("Enter how many liters you want to buy: ");
					litertGasoline = keyboard.nextInt();

					// Calculate Total Whitout Discount Gasoline
					totalWhitoutDiscount = litertGasoline * priceGasoline;

					// Calculate Discount Gasoline
					if (litertGasoline > 20) {
						discount = totalWhitoutDiscount - (totalWhitoutDiscount * 0.06);
						showDiscount = "6%";
					} else {
						discount = totalWhitoutDiscount - (totalWhitoutDiscount * 0.04);
						showDiscount = "4%";
					}
					// Output Data GASOLINE
					out.println(dottedLine);
					out.println("Total R$" + totalWhitoutDiscount);
					out.println("You Got a Discount " + showDiscount);
					out.println("You will pay: R$" + discount);
				}
				out.print(dottedLine + "END APP" + dottedLine);
				keyboard.close();

	}

}
