package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional27 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		double priceFruit = 0;
		double totalWillPay = 0;

		System.out.println("           Até 5 Kg       Acima de 5 Kg ");
		System.out.println("Morango R$ 2,50 por Kg | R$  2,20 por Kg \n" + "Maçã    R$ 1,80 por Kg | R$  1,50 por Kg \n");

		System.out.print("Escolha qual fruta: ");
		String fruit = keyboard.next();

		System.out.print("Escolha a quantidade em kg: ");
		int quantity = keyboard.nextInt();

		if (fruit.equalsIgnoreCase("Morango") && quantity > 5) {
			priceFruit = 2.20;

		} else if (fruit.equalsIgnoreCase("Morango") && quantity <= 5) {
			priceFruit = 2.50;
		}

		if (fruit.equalsIgnoreCase("Maca") && quantity > 5) {
			priceFruit = 1.50;

		} else if(fruit.equalsIgnoreCase("Maca") && quantity <= 5) {
			priceFruit = 1.80;
		}
		
		totalWillPay = quantity * priceFruit;
		
		if (quantity > 8 || priceFruit > 25) {
			totalWillPay = totalWillPay - (totalWillPay * 0.1);
		}
		keyboard.close();
		
		System.out.println(priceFruit);
		System.out.printf("voce escolheu %S e a quantidade %dkg%n", fruit, quantity);
		System.out.printf("Valor a ser pago: %.2f", totalWillPay);
	}

}
