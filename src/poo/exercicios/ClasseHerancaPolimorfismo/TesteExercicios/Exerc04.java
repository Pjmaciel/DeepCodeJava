package poo.exercicios.ClasseHerancaPolimorfismo.TesteExercicios;

import java.util.Scanner;

import poo.exercicios.ClasseHerancaPolimorfismo.exer04.Ano;
import poo.exercicios.ClasseHerancaPolimorfismo.exer04.Data;
import poo.exercicios.ClasseHerancaPolimorfismo.exer04.Dia;
import poo.exercicios.ClasseHerancaPolimorfismo.exer04.Mes;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		

		System.out.print("Digite um dia do mes: ");
		Dia dia = new Dia(keyboard.nextInt());
		System.out.print("Digite um mes do Ano: ");
		Mes mes = new Mes(keyboard.nextInt());
		System.out.print("Digite um Ano depois de 1000: ");	
		Ano ano = new Ano(keyboard.nextInt());
		//inicializar a classe data
		Data data = new Data(dia, mes, ano);

		
		System.out.println("Data Atual: "+dia+mes+ano);
		
		System.out.println(data);

		keyboard.close();
		

	}

}
