package atividade.opcionais.condicao;

import java.util.Random;

public class AtividadeOpcional21 {

	public static void main(String[] args) {
		//Automatic value 
		Random random = new Random();
		
		//variables
		String message100,message50Or10, message5Or1;
		int withdraw = random.nextInt(601);
		
		//calculation to capture the decimal places
		int hundred = withdraw / 100 % 10;
		int dozens = withdraw / 10 % 10;
		int units = withdraw / 1 % 10;
		
		
		//mensseger of hundred bills
		if(hundred == 0) {
			message100 ="";
		}else {
			message100 = hundred + " notas de 100, ";
		}
		
		//Calculate for fify bills
		if (dozens >= 5) {
			int fifyBills = dozens - 5;
			int tenBills = fifyBills / 1;
			message50Or10 = "1 nota de 50, "+ tenBills + " notas de 10, ";
		}else {
			message50Or10 = dozens+" notas de 10, ";
		}
		
		//Calculando nota de 5
		if (units >= 5) {
			int oneBills = units - 5;
			if (oneBills == 0) {
				message5Or1 = "1 nota de 5.";
			}else {
				message5Or1 = "1 nota de 5, "+ oneBills + " notas de 1. ";
			}
		}else {
			message5Or1 = units+" notas de 1.";
		}

		System.out.println(withdraw + " = " + message100 + message50Or10 +  message5Or1 );
	}

}