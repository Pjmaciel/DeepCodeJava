package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Random;

public class AtividadeOpcional07 {

	public static void main(String[] args) {
		Random random = new Random();
		
		// Ardonments		
		String linha = "---------------------------";
		String fim = "------- END APP --------";
	
		//Variaveis
		int numb1 = random.nextInt(11);
		int numb2 = random.nextInt(11);
		int numb3 = random.nextInt(11);
		int biggest = 0 ;
		int smallest = 0;
				
	    //Dados de entrada
		out.println(linha + "the biggest and the smallest number" + linha);
		out.println("");
		out.println("→ 1° Number: " + numb1);
		out.println("→ 2° Number: " + numb2);
		out.println("→ 3° Number: " + numb3);
		out.println(linha);
		out.println("");
				
		//Decisao
		if(numb1 > numb2 && numb1 > numb3) {
			biggest =  numb1;
		}else if(numb1 < numb2 && numb1 < numb3) {
			smallest =  numb1;
		}
		
		if(numb2 > numb1 && numb2 > numb3) {
			biggest =  numb2;
		}else if(numb2 < numb1 && numb2 < numb3){
			smallest =  numb2;
		}
		
		if(numb3 > numb1 && numb3 > numb2){
			biggest =  numb3;
		}else if(numb3 < numb2 && numb3 < numb1){
			smallest =  numb3;
		}
		
		out.println("→ The biggest number is " + biggest);
		out.println("→ The smallest number is " + smallest);
		out.print("\n"+fim);
	}
}
