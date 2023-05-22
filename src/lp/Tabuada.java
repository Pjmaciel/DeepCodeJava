package lp;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		 // Criar objeto scanner para ler entrada do usuário
        Scanner keyboard = new Scanner(System.in);

        // Ler o número que o usuário quer multiplicar
        System.out.print("Digite um número: ");
        int numero = keyboard.nextInt();

        // Loop para imprimir a tabuada do número
        for (int cont = 1; cont <= 10; cont++ ) {  
            System.out.println(numero + " x " + cont + " = " + (numero * cont));
        }
		keyboard.close();

	}

}

