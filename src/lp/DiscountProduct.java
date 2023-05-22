package lp;


public class DiscountProduct {

	public static void main(String[] args) {
		
		//Variables
		String productName = "Computador";
		int quantityPurchased = 20;
		double unityPrice = 5;
		double total = quantityPurchased * unityPrice;
		double discount = 0;
		String showDiscount;
		
		
		//Conditions
		if(quantityPurchased > 10) {
			discount = total * 0.05;
			showDiscount = "5%";
		}else if(quantityPurchased > 5 && quantityPurchased <= 10) {
			discount = total * 0.03;
			showDiscount = "3%";
		}else {
			discount = total * 0.02;
			showDiscount = "2%";
		}
		
		double totalToPay = total - discount;
		
		//Output Data
		
		System.out.println("Product: " + productName);
		System.out.printf("Total : R$ %.2f%n" , total);
		System.out.printf("Discount of %s: R$ %.2f %n",showDiscount, discount);
		System.out.printf("You Will Pay: R$ %.2f",totalToPay);		

	}

}
