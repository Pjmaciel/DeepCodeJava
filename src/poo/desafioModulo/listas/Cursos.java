package poo.desafioModulo.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import poo.desafioModulo.model.Curso;

public class Cursos {
	private List<Curso> cursos;

	public Cursos() {
		cursos =  new ArrayList<Curso>();
	}
	
	public void addDepartamentoFromUserInput(Scanner scanner) {
		System.out.print("\n Enter the Curse`s name: ");
		String name = scanner.next();
		
		Curso newCurso = new Curso(name);
		addCurso(newCurso);
		
		System.out.println("\n Course added Successfully");
		
		listarCursos();
		
	}
	
	public Curso addCurso(Curso curso) {
		cursos.add(curso);
		return curso;
	}
	
	public void listarCursos() {
		for (Curso curso : cursos) {
			System.out.println(curso + "\n    • ID Curso:"+ cursos.indexOf(curso));
			
		}
	}
	
	public Curso getDepartamentosByID(int id) {
		Curso choiceCurso = cursos.get(id);
		return choiceCurso;
	}
	
	

}
