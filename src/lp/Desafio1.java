package lp;

/**A Qualiti precisa de você!

 Faça um programa para pegar e exibir os dados dos novos alunos do DeepCode:

 Idade; Email; Nome e; Telefone para contato
 
 * 
 */

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); // class that will need to capture what the user will type.

		System.out.print("Enter you Age: ");
		int age = keyboard.nextInt();
		
		System.out.print("Enter you E-mail: ");
		String email = keyboard.next();
		
		System.out.print("Enter you Name: ");
		keyboard.nextLine();// consumes the line break left by the user
		String name = keyboard.nextLine();
		
		System.out.print("Enter you Phone Number( with DDD and without spaces) : ");
		String phoneNumber = keyboard.next();

		System.out.println(" Successful Register ! "); 	
		
		//will join the typed variables and concatenate with the text, I added the .substring command to separate the ddd from the mumbers.
		System.out.println("\nName: " + name + 
						   "\nAge: " + age +
						   "\nEmail: " + email + 
						   "\nPhone Number: ("+ phoneNumber.substring(0,2) + ")" + phoneNumber.substring(2)); 
		keyboard.close();
	}
	
	

}
