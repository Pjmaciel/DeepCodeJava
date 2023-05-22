package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional25 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String status;
		int counterPoints = 0; 
		
		System.out.println("Responda com [S] para SIM ou [N] para NÃO: ");
		System.out.println("Telefonou para a vitima?");
		String question1 = keyboard.next();
		if(question1.equalsIgnoreCase("S")){
			counterPoints++;
		}
		System.out.println("Esteve no local do crime");
		String question2 = keyboard.next();
		if(question2.equalsIgnoreCase("S")) {
			counterPoints++;
		}
		System.out.println("Mora perto da vitima?");
		String question3 = keyboard.next();
		if(question3.equalsIgnoreCase("S")) {
			counterPoints++;
		}
		System.out.println("Devia para a vitima?\"");
		String question4 = keyboard.next();
		if(question4.equalsIgnoreCase("S")) {
			counterPoints++;
		}
		System.out.println("Já trabalhou com a vitima?");
		String question5 = keyboard.next();
		if(question5.equalsIgnoreCase("S")) {
			counterPoints++;
		}
		
		if (counterPoints >=5) {
			status = "Assasino";
		}else if(counterPoints == 3 || counterPoints == 4) {
			status = "Cumplice";
		}else if(counterPoints == 2) {
			status = "Suspeita";
		}else {
			status = "Inocente";
		}
		
		keyboard.close();
		
		System.out.println("Perguntas Respondidas com S: " + counterPoints);
		System.out.println("Classificação de participação no crime: " + status);
		

	}

}
