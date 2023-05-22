package poo.exercicios.ClasseHerancaPolimorfismo.TesteExercicios;

import poo.exercicios.ClasseHerancaPolimorfismo.exer02.Passageiro;
import poo.exercicios.ClasseHerancaPolimorfismo.exer02.Voo;

public class Exerc02 {

	public static void main(String[] args) {
		
		
		Passageiro p1 = new Passageiro("Pablo");
		Passageiro p2 = new Passageiro("Jorge");
		Passageiro p3 = new Passageiro("Maciel");
		Passageiro p4 = new Passageiro("Ana");
		Passageiro p5 = new Passageiro("Benicio");
		
		Voo atendente = new Voo();
		Voo cadeira1 = new Voo(p1,"12/05/2023",3);
		Voo cadeira2 = new Voo(p2,"12/05/2023",25);
		Voo cadeira3 = new Voo(p3,"12/05/2023",2);
		Voo cadeira4 = new Voo(p4,"12/05/2023",12);
		Voo cadeira5 = new Voo(p5,"12/05/2023",100);
		Voo cadeira6 = new Voo(p5,"12/05/2023",1);

		
		atendente.listarCadeiras();
		System.out.println("");
		atendente.vagas();;
		System.out.println("");
		atendente.verificar(33);
		System.out.println("");
		atendente.verificar(31);
		System.out.println("");
		Integer proximaCadeiraLivre = atendente.proximoLivre(cadeira6);
		if (proximaCadeiraLivre == null) {
		    System.out.println("Não há cadeiras livres neste voo.");
		} else {
		    System.out.println("A próxima cadeira livre é: " + proximaCadeiraLivre);
		}
		System.out.println("");		
		

	}

}
