package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Scanner;

public class AtividadeOpcional03 {

	public static void main(String[] args) {
			// Activate keyboard input
			Scanner keyboard = new Scanner(System.in);
			
			// Adornments
			String line = "---------------------------";
			String endLine = "-------- END APP ---------";
			
			//Data Input
			out.println("Informe seu Genero.");
			out.print("Digite [ F ] ou [ M ] sem os colchetes :");
			String sex = keyboard.next();
			
			//Decision Structure
			if(sex.equalsIgnoreCase("F")) {
				out.println(line);
				out.println("→ Voce escolheu [F - Feminino]");
			} else if(sex.equalsIgnoreCase("M")) {
				out.println(line);
				out.println("→ Voce escolheu [M - Maculino]");
			} else {
				out.println(line);
				out.println("       Sexo Invalido!");
			}

			out.println(line);
			out.print("\n" + endLine);
			keyboard.close();

	}

}
