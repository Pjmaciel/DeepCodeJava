package poo.exercicios.ClasseHerancaPolimorfismo.TesteExercicios;

import poo.exercicios.ClasseHerancaPolimorfismo.exer03.Empregado;

public class Exerc03 {

	public static void main(String[] args) {
		Empregado empregado =new Empregado("Pablo","Maciel",1000);
		Empregado empregado2 =new Empregado("Ana","Leticia",5000);
		
//		double salarioAnual = empregado.getSalarioMensal() *12;
//		double salarioAnual2 = empregado2.getSalarioMensal() *12;
//		
//		System.out.println("Salario anual sem do empregado" +empregado.getPrimeiroNome() + "aumento: " + salarioAnual);
//		System.out.println("------------------------------------------------------------------------------------------");
//		System.out.println("Salario anual sem do empregado" +empregado2.getPrimeiroNome() + "aumento: " + salarioAnual2);
//		
//		
//		empregado.aumentoDez(salarioAnual);
//		System.out.println("===========================================================================================");
//		empregado.aumentoDez(salarioAnual2);
//		
		System.out.println("Quantas vezes voce quer aumentar o salario do empregado?");
		int aumentoSalario = 4;
		int cont = 0;
		double salarioAnual = 0;
		double aumento = 0;
		for(int i = 1; i<12;i++) {
			salarioAnual += empregado.getSalarioMensal();
			while (cont < aumentoSalario){
				empregado.aumentoDez();
				cont++;
			}
			
		}
		System.out.printf("Salario anual do empregado %s é : %.2f" ,empregado.getPrimeiroNome(),salarioAnual);
		
	}

}
