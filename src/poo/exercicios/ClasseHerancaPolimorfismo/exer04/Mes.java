package poo.exercicios.ClasseHerancaPolimorfismo.exer04;

import java.util.Scanner;

public class Mes {

	private Scanner keyboard = new Scanner(System.in);
	private int mes;

	public Mes(int mes) {
		while (mes < 1 || mes > 12) {
			System.out.print("Entrada Invalida! digite um mês entre 1 e 12: ");
			mes = keyboard.nextInt();
		}
		this.mes = mes;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
	@Override
	public String toString() {
		String mensagemMes = this.getMes() < 10 ? " / 0"+this.getMes() : " / "+this.getMes();
		return mensagemMes;
	}
}
