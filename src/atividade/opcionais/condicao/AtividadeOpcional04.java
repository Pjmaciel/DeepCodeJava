package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Scanner;

public class AtividadeOpcional04 {

	public static void main(String[] args) {
		///Activate keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Dados de entrada
		out.print("Enter the Letter: ");
		String letter = keyboard.next();
		
		letter = letter.toUpperCase(); // Make the string capitalized
		
		//Decisao
		if(letter.equals("A") ||
		   letter.equals("E") || 
		   letter.equals("O") || 
		   letter.equals("I") || 
		   letter.equals("U")) {
			out.print("[" + letter + "] its a vowel!");
	    }else {
	    	out.print("[" + letter + "] its a consonant!");
	    }
		
		keyboard.close();
	}

}
