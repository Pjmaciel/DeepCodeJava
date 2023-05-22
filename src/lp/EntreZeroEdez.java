package lp;

import java.util.Scanner;

public class EntreZeroEdez {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um numero entre 0 e 10");
        int numb = keyboard.nextInt();

        while(numb < 0 || numb > 10) {
            System.out.println("Codigo invalido");
            System.out.println("Informe um numero entre 0 e 10");
            numb = keyboard.nextInt();
        }

        System.out.println("Codigo valido: " + numb);
        
        keyboard.close();
    }

}
