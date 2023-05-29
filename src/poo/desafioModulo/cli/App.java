package poo.desafioModulo.cli;

import poo.desafioModulo.model.Alocacao;
import poo.desafioModulo.model.Curso;
import poo.desafioModulo.model.Departamento;
import poo.desafioModulo.model.Professor;

public class App {

	public static void main(String[] args) {
		String linha = "============================================";
		Departamento dp = new Departamento("Exatas");
		Curso curso =  new Curso("Computaçao");
		Professor prof = new Professor("Adalberto","066.555.856-98", dp);
		Alocacao alocacao = new Alocacao(prof, curso, "Segunda-Feira", "19:00");
		
		
		System.out.println(dp);
		System.out.println(linha);
		System.out.println(curso);
		System.out.println(linha);
		System.out.println(prof);
		System.out.println(linha);
		System.out.println(alocacao);
		
		
	}


}
