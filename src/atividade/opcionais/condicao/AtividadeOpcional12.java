package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional12 {

	public static void main(String[] args) {
		//Activate Keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Adornments
		String line = "---------------------------------";
		String endLine = "---------- END APP -------------";
		
		
		//Variables
		int qtyHoursWorkedMonth;
		double ir;
		double valueOfHours;
		String message = "";
		
		System.out.print("Enter the value of hours per day: ");
		valueOfHours = keyboard.nextDouble();
		
		System.out.println("Enter the hours worked in the month: ");
		qtyHoursWorkedMonth = keyboard.nextInt();
		
		double wage = valueOfHours * qtyHoursWorkedMonth;
		
		//Calculate of IR
		if(wage > 2500) {
			ir = wage * 0.2;
			message = "20";
		}else if( wage > 1500 && wage <= 2500) {
			ir = wage * 0.1;
			message = "10";
		}else if ( wage >900 && wage <= 1500) {
			ir = wage * 0.05;
			message = "5";
		}else {
			ir = 0.00;
			message = "Insento";
		}
		
		//Calculate Net Wage
		double inss = wage * 0.10;
		double sindicate = wage * 0.03;
		double fgts = wage * 0.11;
		double discounts = ir + inss + sindicate ;
		double netWage = wage - discounts;
		keyboard.close();
		
		//Data Output
		System.out.printf(line + "%nSalário Bruto                : R$ %.2f%n"
				               + "(-) IR (%s%%)            : R$ %.2f%n"
				                + "(-) INSS (10%%)               : R$ %.2f%n"
				                + "FGTS (11%%)                   : R$ %.2f%n"
				                 + "Total de descontos           : R$ %.2f%n"
				                 + "Salário Liquido              : R$ %.2f%n",wage,message,ir,inss,fgts,discounts,netWage);
		System.out.println("\n" + endLine);
	}

}
