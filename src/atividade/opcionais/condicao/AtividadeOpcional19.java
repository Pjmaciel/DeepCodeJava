package atividade.opcionais.condicao;

import java.util.Random;

public class AtividadeOpcional19 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int numb = random.nextInt(1000);
		
		int cent = numb / 100 % 10;
		int dez = numb / 10 % 10;
		int uni = numb / 1 % 10;
		
		if (cent == 0) {
			System.out.println(numb + " = " + dez + " Dezenas, " + uni +" Unidades");
			
		}else if(dez == 0) {
			System.out.println(numb + " = " + cent +" Centenas, " + uni +" Unidades)");
		}else if(uni == 0) {
			System.out.println(numb + " = " + cent +" Centenas, " +dez+" Dezenas");
		}else {
			System.out.println(numb + " = " + cent +" Centenas, " +dez+" Dezenas, " + uni +" Unidades)");
		}
		
	}

}
