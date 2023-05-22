package atividade.opcionais.condicao;

import java.util.Random;

public class AtividadeOpcional22 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		//Variables
		String result;
		int numb = random.nextInt(101);
		
		//Decision
		if(numb % 2 == 0) {
			result = "é par!";
		}else {
			result = "é impar!";
		}
		
		System.out.printf("o numero %d %S",numb,result);

	}

}
