package poo.desafioModulo.cli;

import java.util.Scanner;

import poo.desafioModulo.model.Alocacao;
import poo.desafioModulo.model.Curso;
import poo.desafioModulo.model.Departamento;
import poo.desafioModulo.model.Professor;

public class App {

	public static void main(String[] args) {
		Scanner keyboard =  new Scanner(System.in);
		String linha = "============================================";
		System.out.print ("Digite o nome do departamento: ");
		String dpnome = keyboard.next();
		Departamento dp = new Departamento(dpnome);
		
		System.out.print("Digite o nome do curso: ");
		String cursoNome = keyboard.next();
		
		Curso curso =  new Curso(cursoNome);
		
		System.out.print("Digite o nome do professor: ");
		String profNome = keyboard.next();
		System.out.print("Digite o nome do cpf: ");
		String profCpf = keyboard.next();
	
		
		Professor prof = new Professor(profNome,profCpf, dp);
		
		System.out.println("Informe o dia da semana da alocaçao");
		String alocDiaDaSemana = keyboard.next();
		
		System.out.println("Informe O horario da Alocaçao");
		String alocHora = keyboard.next();

		Alocacao alocacao = new Alocacao(prof, curso, alocDiaDaSemana, alocHora);
		
		
		System.out.println("=============== Alocaçao ============");
		System.out.println(alocacao);
		
		
		
//		System.out.println(dp);
//		System.out.println(linha);
//		System.out.println(curso);
//		System.out.println(linha);
//		System.out.println(prof);
//		System.out.println(linha);
		
		keyboard.close();
		
		
	}

}
