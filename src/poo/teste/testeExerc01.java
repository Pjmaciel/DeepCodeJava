package poo.teste;

import poo.exercicios.exer01.Aluno;
import poo.exercicios.exer01.Pessoa;
import poo.exercicios.exer01.Professor;

public class testeExerc01 {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Pablo", 38, "Recife");
		Pessoa aluno = new Aluno(pessoa.getNome(),pessoa.getIdadade(),pessoa.getEndereco(),2023);
		Pessoa professor = new Professor("Roberto",40,"Olinda","Matematica");
		
		
		System.out.println(pessoa.getNome());
		System.out.println(aluno.getNome());
		System.out.println(professor.getNome());
		
		
	}

}
