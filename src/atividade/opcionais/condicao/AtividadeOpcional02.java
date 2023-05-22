package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Random;

public class AtividadeOpcional02 {
	public static void main(String[] args) {
		//Generate random number positve or negative
		Random random = new Random();
		
		// Frescurinhas
		String linha = "---------------------------";
		String fim = "-----END APP--------";
		
		int numb = random.nextInt();
		String result;
		
		out.println(linha);
		
		//Decisao
		if(numb >= 0) {
			result = "is Positive";	
		} else {
			result = "is Negative";
		}
		
		out.println("Numero: " + numb);
		out.println("\nThis number " + result );
		out.println(linha);
		out.println(fim);
	}

}
