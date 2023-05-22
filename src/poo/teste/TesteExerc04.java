package poo.teste;

import poo.exercicios.exer04.Emprestimo;
import poo.exercicios.exer04.Livro;
import poo.exercicios.exer04.Pessoa;

public class TesteExerc04 {

	public static void main(String[] args) {
		
		Pessoa cliente = new Pessoa("Pablo",33);
		Pessoa cliente2 = new Pessoa("Jorge",35);
		
		Livro livro1 = new Livro("Senhor Dos Aneis","J. R. R. Tolkie","Martins Fontes",true);
		Livro livro2 = new Livro("Java para Leigos"," Barry Burd","Alta Books",false);
		Livro livro3 = new Livro("Drácula","Bram Stoker","Archibald Constable and Company",true);
		
		Emprestimo emprestimo = new Emprestimo(cliente, livro1, "10/05/2023");
		Emprestimo emprestimo2 = new Emprestimo(cliente2, livro2, "10/05/2023");
		Emprestimo emprestimo3 = new Emprestimo(cliente2, livro3, "10/05/2023");
		
		
		emprestimo.realizarEmprestimo(emprestimo);
		System.out.println("");
		emprestimo2.realizarEmprestimo(emprestimo2);
		System.out.println("");
		cliente.devolverLivro(emprestimo);
		System.out.println("");
		emprestimo2.realizarEmprestimo(emprestimo2);
		emprestimo2.realizarEmprestimo(emprestimo3);
		


	}

}
