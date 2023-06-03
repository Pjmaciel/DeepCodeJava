package poo.desafioModulo.listas;

//import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

import poo.desafioModulo.model.Alocacao;

public class Alocacoes {
	private List<Alocacao> alocacoes;
//	private Professores professores;
//	private Cursos cursos;
	
	public Alocacoes() {
		alocacoes = new ArrayList<Alocacao>();
	}
	
//	public void addAlocacaoFromUserInput(Scanner scanner) {
//		professores.listarProfessores();
//		out.print("\n Enter the Professor`s ID: ");
//		int idCurso = scanner.nextInt();
//		out.print("\n Enter the Professor`s ID: ");
//		int idProfessor = scanner.nextInt();
//		out.print("\n Enter the day of weak for alocation: ");
//		String diaDaSemana = scanner.next();
//		out.print("\n Enter the hours for alocation: ");
//		String hora = scanner.next();
//		
//		Alocacao newAlocacao = new Alocacao(professores.getProfessorByID(idProfessor),cursos.getDepartamentosByID(idCurso),diaDaSemana,hora);
//		alocacoes.add(newAlocacao);
//		
//		System.out.println("Alocation added Successfully");
//		
//		listarAlocacoes();
//	}
	
	public Alocacao addAlocacao(Alocacao alocacao) {
		alocacoes.add(alocacao);
		return alocacao;
	}
	
	public void listarAlocacoes() {
		for (Alocacao alocacao : alocacoes) {
			System.out.println("\n" +alocacao + "\n");
		}
	}
	
	
	

}
