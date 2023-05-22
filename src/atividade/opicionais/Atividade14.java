package atividade.opicionais;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		// Active Keyboard
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hello João Papo-de-Pescador, Enter the weight of you fish in kg: ");
		double weightFish = keyboard.nextDouble();
		
		//Condition
		if(weightFish > 50) {
			double priceOfFish = (weightFish - 50) * 4;
			System.out.printf("For you Fish weight you need pay of fee: R$ %.2f", priceOfFish);
		}else {
			System.out.println("The weight of the fish does not exceed the limit of 50 kg. " + " \nThere is no need to pay the fee. ");
		}
		
		keyboard.close();
	}

}
