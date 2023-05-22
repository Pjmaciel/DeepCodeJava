package atividade.opicionais;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		//Active keyboard input
	    Scanner keyboard = new Scanner(System.in);
	    
	    //input data
	    System.out.println("Enter the hourly rate: ");
	    double valuePerHour = keyboard.nextDouble();
	   
	    System.out.println("Enter your time worked in the month: ");
	    int timeWorked = keyboard.nextInt();
	    
	    //logical calculate
	    double wage = valuePerHour * timeWorked;
	    
	    //output data
	    System.out.printf("Your wage this month was: R$ %.2f", wage);
	    
	    keyboard.close();		
	}

}
