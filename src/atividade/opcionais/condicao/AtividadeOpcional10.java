package atividade.opcionais.condicao;

import static java.lang.System.out;
import java.util.Scanner;

public class AtividadeOpcional10 {

	public static void main(String[] args) {
		// Ativar o teclado
		Scanner keyboard = new Scanner(System.in);

		// Frescurinhas
		String linha = "---------------------------";
		String fim = "-----END APP--------";

		// Dados de entrada
		out.println("Qual turno você estuda? ");
		out.print("\n[ M ] - Matutino ou " + "\n[ V ] – Vespoertino ou" + "\n[ N ] Noturno "
				+ "\nDigite a letra correspondente sem os colchetes :");
		String hora = keyboard.next();

		// Decisao
		if (hora.equalsIgnoreCase("M")) {
			out.println(linha);
			out.println("Bom dia, Bons estudos!");
		} else if (hora.equalsIgnoreCase("V")) {
			out.println(linha);
			out.println("Boa tarde, bons estudos!");
		} else if (hora.equalsIgnoreCase("N")) {
			out.println(linha);
			out.println("Boa Noite, bons estudos!");
		} else {
			out.println(linha);
			out.println("Valor Invalido!");
		}

		keyboard.close();
		out.println(linha);
		out.print(fim);
	}

}
