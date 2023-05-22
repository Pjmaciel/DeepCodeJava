package atividade.opcionais.condicao;

import static java.lang.System.out;

import java.util.Scanner;

public class AtividadeOpcional11 {

	public static void main(String[] args) {
		// Ativando a entrada do teclado
		Scanner keyboard = new Scanner(System.in);

		// frescurinhas
		String linha = "------------------------";

		// variaveis
		double wage; // salario atual
		double wageIncrease; // valor do aumento
		double newWage; // salario ja com aumento
		String showPercentage;

		// Dados de entrada
		out.println(linha + "Aumento de Salaritio" + linha);
		out.println("");
		out.print("Digite seu salario atual: R$");
		wage = keyboard.nextDouble();

		// Calculo do aumento
		if (wage <= 280) {
			wageIncrease = wage * 0.2;
			showPercentage = "20%";
		} else if (wage > 280 && wage <= 700) {
			wageIncrease = wage * 0.15;
			showPercentage = "15%";
		} else if (wage > 700 && wage <= 1500) {
			wageIncrease = wage * 0.1;
			showPercentage = "10%";
		} else {
			wageIncrease = wage * 0.05;
			showPercentage = "5%";
		}
		// Calculate of new wage
		newWage = wage + wageIncrease;

		// Saida dos dados
		out.println(linha);
		out.printf("%nSeu salario era: R$ %.2f", wage);
		out.println("\nEle vai ser aumentado em " + showPercentage);
		out.printf("Vai ser adicionado R$ %.2f%n", wageIncrease);
		out.println("Seu novo salario será de R$" + newWage);
		out.println(linha);
		out.println("Eu AGARANTIU!!");
		out.println(linha);
		keyboard.close();

	}

}
