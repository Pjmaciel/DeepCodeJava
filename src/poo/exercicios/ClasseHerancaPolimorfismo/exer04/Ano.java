package poo.exercicios.ClasseHerancaPolimorfismo.exer04;

import java.util.Scanner;

public class Ano {
	private Scanner keyboard = new Scanner(System.in);
	private int ano;
	
	
	public Ano(int ano) {
		String anoToString = Integer.toString(ano);
		while (anoToString.length() < 4) {
			System.out.print("Entrada Invalida! \ndigite um ano valido: ");
			ano = keyboard.nextInt();
			anoToString = Integer.toString(ano);
		}
		this.ano = ano;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		
		return "/ "+ getAno();
	}
	
	

}
