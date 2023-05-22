package poo.exercicios.ClasseHerancaPolimorfismo.TesteExercicios;

import poo.exercicios.ClasseHerancaPolimorfismo.exer01.Aluno;

public class Exerc01 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(15968,"Pablo",7,7,8);
		Aluno a2 = new Aluno(15969,"Jorge",5,9,10);
		Aluno a3 = new Aluno(15970,"Maciel",2,1,3);
		
		a1.media();
		System.out.println("====================");
		a2.media();
		System.out.println("====================");
		a3.media();

	}

}
