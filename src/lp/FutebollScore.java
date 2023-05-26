package lp;

import java.util.Random;

public class FutebollScore {

	public static void main(String[] args) {
		//Iniciar os numeros aleatorios
		Random random = new Random();
		
		//Adornments
		String initialLines = "#=#=#=#=" ;
		String finalLines = "=#=#=#=#";
		
		//Input Data
		int goalTime1 =  random.nextInt(6); // Generates random integers between 0-5
		int goalTime2 =  random.nextInt(6); // Generates random integers between 0-5
		
		System.out.println("Quantidade de gols do time 1: " + goalTime1);
		System.out.println("Quantidade de gols do time 2: " + goalTime2);
		
		//Conditions
		if(goalTime1 == goalTime2) {
			//Output Data
			System.out.println(initialLines + " Empate! " + finalLines);
		}else if(goalTime1 > goalTime2) {
			//Output Data
			System.out.println(initialLines + " Vitoria do Time 1 " + finalLines);
		}else {
			System.out.println(initialLines + " Vitoria do Time 2 " + finalLines);
		}
		
		//Finishing
		System.out.println("\n=========== End DbApp ==========");

	}

}
