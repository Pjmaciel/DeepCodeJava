package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Scanner;

public class AtividadeOpcional05 {
	public static void main(String[] args) {
		// Activate Keyboard Input
		Scanner keyboard = new Scanner(System.in);

		// adornments
		String line = "---------------------------";
		String endLine = "-----FIM Do PROGRAMA--------";

		// Variables
		double exam1, exam2, media;
		String status;

		// Data Input
		out.println(line + "Sera que Passou?" + line);
		out.println("");
		out.print("Digite a nota da 1ª prova: ");
		exam1 = keyboard.nextDouble();
		out.print("Digite a nota da 2ª prova: ");
		exam2 = keyboard.nextDouble();

		// Calculate 
		media = (exam1 + exam2) / 2;

		// Decisao
		if (media < 6.99) {
			status = "Reprovado!";
		} else if (media >= 7 && media <= 9.99) {
			status = "Aprovado!";
		} else {
			status = "Aprovado com Distinção!";
		}
		
		keyboard.close();
		
		// Dados de saida
		out.println(line);
		out.println("");
		out.println("Situacão do aluno : " + status);
		out.println("");
		out.println(line);
		out.println(endLine);
		
		

	}
}
