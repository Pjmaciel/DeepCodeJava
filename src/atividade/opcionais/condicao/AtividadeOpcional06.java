package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Random;

public class AtividadeOpcional06 {

	public static void main(String[] args) {
		// Ativar teclado
		Random random = new Random();
		// Frescurinhas

		String line = "---------------------------";
		String endLine = "-------FIM Do PROGRAMA--------";

		// Dados de entrada
		out.println(line + "Qual o maior" + line);
		out.println("");
		out.println(line);

		int numb1 = random.nextInt(11);
		int numb2 = random.nextInt(11);
		int numb3 = random.nextInt(11);
		
		out.print("\nNumber 1: " + numb1);
		out.print("\nNumber 2: " + numb2);
		out.print("\nNumber 3: " + numb3);
		
		// Decisao
		if (numb1 > numb2 && numb1 > numb3) {
			out.println("\nThe biggest number is number 1: " + numb1);
		} else if (numb2 > numb1 && numb2 > numb3) {
			out.println("\nThe biggest number is number 2: " + numb2);
		} else if (numb3 > numb1 && numb3 > numb2) {
			out.println("\nThe biggest number is number 3: " + numb3);
		} else {
			out.println("\nAll numbers are the same");
		}
		
		out.print(endLine);
	}

}
