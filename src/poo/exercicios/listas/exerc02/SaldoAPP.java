package poo.exercicios.listas.exerc02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SaldoAPP {
	static List<Double> saldoContas = new ArrayList<>();

	public static void main(String[] args) {
		Random random = new Random();
		

		for (int i = 0; i < 5; i++) {
			Integer saldo = random.nextInt(1000) + 99;

			saldoContas.add(saldo.doubleValue());

		}

		listar();
		System.out.println("=================");
		maiorSaldo(saldoContas);
		System.out.println("=================");
		menorSaldo(saldoContas);
		System.out.println("=================");
		removeMenor(saldoContas);
		System.out.println("=================");

		

	}
	
	public static void listar() {
		int cont = 1;
		System.out.println("====== Saldo das Contas ==========");
		for (Double listar : saldoContas) {
			System.out.println("Saldo da Conta "+cont+": "+listar);
			cont++;
		}
		
	}

	public static double maiorSaldo(List<Double> saldoContas) {
		double maiorSaldo = 0;
		for (int j = 0; j < saldoContas.size(); j++) {
			if (saldoContas.get(j) > maiorSaldo) {
				maiorSaldo = saldoContas.get(j);
			}
		}
		System.out.printf("Maior saldo: %.2f%n" , maiorSaldo);
		return maiorSaldo;

	}

	public static double menorSaldo(List<Double> saldoContas) {
		double menorSaldo = saldoContas.get(0);
		for (int j = 1; j < saldoContas.size(); j++) {
			if (saldoContas.get(j) < menorSaldo) {
				menorSaldo = saldoContas.get(j);
			}
		}
		System.out.printf("Menor Saldo: %.2f%n" , menorSaldo);
		return menorSaldo;
	}

	public static void removeMenor(List<Double> saldoContas) {
		double numeroAlvo = menorSaldo(saldoContas);
		int index = saldoContas.lastIndexOf(numeroAlvo);
		if (index != -1) {
			saldoContas.remove(index);
		}
		System.out.printf("O Saldo <R$ %.2f> foi removido da lista.%n", numeroAlvo);

	}

}
