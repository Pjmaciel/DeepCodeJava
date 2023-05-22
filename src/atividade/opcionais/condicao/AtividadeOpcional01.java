package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Random;

public class AtividadeOpcional01 {

	public static void main(String[] args) {
		Random random = new Random();

		// frescurinhas
		String line = "-------------------------";
		String endLine = "---------------END APP----------)";

		// Variaveis
		int numb1 = random.nextInt(11);
		int numb2 = random.nextInt(11);

		// Dados de entrada
		out.println(line + "Maior" + line);
		out.println();
		System.out.println("Number 1: " + numb1);
		System.out.println("Number 2: " + numb2);

		// Decisao
		if (numb1 > numb2) {
			out.println("The largest number among them is Number 1: " + numb1);
		} else if (numb2 > numb1) {
			out.println("The largest number among them is Number 2: " + numb2);
		} else {
			out.println("There is no greater number!");
		}

		out.println(endLine);

	}

}
