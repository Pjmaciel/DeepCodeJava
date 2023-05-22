package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional28 {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		
		double totalPrice = 0;
		double priceMeat = 0;
		String typePay;
		String showCard;
		double discount = 0;
		double totalWillPay = 0;
				
		System.out.println("              Até 5 Kg       Acima de 5 Kg ");
		System.out.println("File Duplo R$ 4,90 por Kg | R$  5,80 por Kg \n" +
		                   "Alcatra    R$ 5,90 por Kg | R$  6,80 por Kg \n" +
				           "Picanha    R$ 6,90 por Kg | R$  7,80 por Kg \n");
		
		System.out.print("Escolha qual Corte de carne: ");
		String meat = keyboard.nextLine();
		

		System.out.print("Escolha a quantidade em kg: ");
		int quantity = keyboard.nextInt();
		
		//File duplo
		if (meat.equalsIgnoreCase("file Duplo") && quantity > 5) {
			priceMeat = 5.80;

		} else if (meat.equalsIgnoreCase("file Duplo") && quantity <= 5) {
			priceMeat = 4.90;
		}
		
		//Alcatra
		if (meat.equalsIgnoreCase("alcatra") && quantity > 5) {
			priceMeat = 6.80;

		} else if (meat.equalsIgnoreCase("alcatra") && quantity <= 5) {
			priceMeat = 5.90;
		}
		
		//Picanha
		if (meat.equalsIgnoreCase("picanha") && quantity > 5) {
			priceMeat = 7.80;

		} else if (meat.equalsIgnoreCase("picanha") && quantity <= 5) {
			priceMeat = 6.90;
		}
		
		totalPrice = quantity * priceMeat;
		
		//Cartao Tabajara
		System.out.println("Vai pagar com o Cartao Tabajara? [S - Sim] ou [N - Não]");
		typePay = keyboard.next();
		
		if(typePay.equalsIgnoreCase("S")) {
			showCard = "cartão Tabajara.";
			discount = totalPrice * 0.05;
			totalWillPay = totalPrice - discount;
		}else {
			showCard = "outro Metodo.";
			totalWillPay = totalPrice;
			
		}
		
		keyboard.close();
		System.out.printf("#=#=#=#= cupom fiscal =#=#=#=#=# %n " +
				         "tipo Carne: %S %n" +
				         " Quantidade: %d %n" +
				         " Preço total: %.2f %n" +
				         " tipo de pagamento: %S %n"+
				         " valor do desconto: %.2f %n"+
				         " valor a pagar: %.2f %n",meat, quantity, totalPrice, showCard, discount,totalWillPay); 
	}

}
 