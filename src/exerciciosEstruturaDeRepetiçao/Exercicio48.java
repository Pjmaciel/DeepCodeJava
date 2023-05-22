package exerciciosEstruturaDeRepetiçao;


import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
	      out.print("Digite um número inteiro positivo: ");
	      int num = input.nextInt();
	      String str_num = Integer.toString(num);
	      
	      StringBuilder str_num_inverted = new StringBuilder(str_num).reverse();
	      
	      int num_inverted = Integer.parseInt(str_num_inverted.toString());
	      
	      out.println("O número invertido é: " + num_inverted);
	      
	      input.close();

	}

}
