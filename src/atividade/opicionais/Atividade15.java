package atividade.opicionais;

import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		// Active Keyboard
		Scanner keyboard = new Scanner(System.in);
		// input data
		System.out.println("Enter the hourly rate: ");
		double valuePerHour = keyboard.nextDouble();

		System.out.println("Enter your time worked in the month: ");
		double timeWorked = keyboard.nextInt();

		// logical calculate
		double wage = valuePerHour * timeWorked;
		double incomeTax = wage * 0.11;
		double inss =  wage * 0.05;
		double sindicate = wage * 0.08;
		double netSalary = wage - incomeTax - inss - sindicate;

		// output data
		System.out.printf("Salario Bruto : R$ %.2f%n"
				        + "Ir: R$ %.2f%n"
				        + "Inss: R$ %.2f%n"
				        + "Sindicato: R$ %.2f%n"
				        + "Salario Liquido: R$ %.2f%n ", wage, incomeTax, inss, sindicate, netSalary); 

		keyboard.close();

	}

}
