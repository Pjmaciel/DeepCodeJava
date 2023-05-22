package atividade.opicionais;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		//Keyboard Capture
		Scanner keyboard = new Scanner(System.in);
		
		//Input data
		System.out.print("Digite um numero ");
		int number = keyboard.nextInt();
		
		//Output data
		System.out.println("O número informado foi " + number);
		keyboard.close();

	}

}
