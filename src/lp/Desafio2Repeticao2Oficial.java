/*Instruções:

Você foi contratado para desenvolver um sistema de supermercado.

O sistema deverá perguntar ao usuário o nome do produto, a quantidade e o valor unitário. FINALIZADO

O sistema deve permitir que o usuário insira mais de um produto e só finaliza quando o usuário desejar encerrar a inserção de produtos. FINALIZADO

Ao final, o programa deve informar o valor total que o usuário deverá pagar. FINALIZADO

Obs: O supermercado possui um sistema de bonificação e caso a quantidade de produtos seja maior que 5 é dado um desconto de 10% no valor da compra do produto informado

 * 
 */

package lp;

import java.util.Scanner;

public class Desafio2Repeticao2Oficial {

	public static void main(String[] args) {
		//Active keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//variables
		
		@SuppressWarnings("unused")
		String productName;
		int qtyProducts = 0;
		double unityPrce = 0.00;
		double totalPricePerProduct =0;
		double finalPrice = 0.00;
		double discount = 0;
		String choice;
		
		//Counters
		int contQtyProductTotal = 0;
		double contTotalPrice = 0;
		
		
		System.out.println("Deseja cadastrar um produto? [S - Sim] ou [N - Não]");
        choice = keyboard.next();

		while (choice.equalsIgnoreCase("S")) {//Same to "select == number" but for letter and ignoring whether it is in upper or lower case.
			
			System.out.println("Digite o nome do produto:");
			productName = keyboard.next();

			System.out.println("Digite a quantidade desejada:");
			qtyProducts = keyboard.nextInt();
			contQtyProductTotal += qtyProducts;// Store the total amount of products entered by the user during the loop.

			System.out.println("Digite o valor unitario: ");
			unityPrce = keyboard.nextDouble();
			
			totalPricePerProduct = qtyProducts * unityPrce;	//store the total purchase amount for the individual user.
			
			contTotalPrice += totalPricePerProduct; //store the total purchase amount.
			
			System.out.println("Deseja cadastrar mais um produto? [S - Sim] ou [N - Não]");
            choice = keyboard.next();
			
		}
		
		//Condition for apply discount
		if(contQtyProductTotal > 5) {
			discount = (contTotalPrice * 0.1);
			finalPrice = contTotalPrice - discount ;
		}else {
			finalPrice = contTotalPrice;
		}
		keyboard.close();
		
		System.out.printf("Valor total da compra: R$ %.2f%n" , finalPrice);

        System.out.println("Obrigado, Volte Sempre");

	}

}
