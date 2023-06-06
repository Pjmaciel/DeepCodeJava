package poo.exercicios.listas.exerc04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random notar = new Random();
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		
		Aluno aluno1 = new Aluno ("Pedro", notar.nextInt(8)+6,notar.nextDouble(11),notar.nextDouble(11),notar.nextDouble(11));
		alunos.add(aluno1);
		
		Aluno aluno2 = new Aluno ("Benicio", notar.nextInt(8)+6,notar.nextDouble(11),notar.nextDouble(11),notar.nextDouble(11));
		alunos.add(aluno2);
		
		Aluno aluno3 = new Aluno ("Pablo", notar.nextInt(8)+6,notar.nextDouble(11),notar.nextDouble(11),notar.nextDouble(11));
		alunos.add(aluno3);
		
		for (Aluno aluno : alunos) {
			System.out.printf("%nNome: %s%nIdade: %d%n",aluno.getNome(),aluno.getIdade());
			System.out.printf("• Notas:%n •Nota 1: %.2f%n •Nota 2: %.2f%n •Nota 3: %.2f%n",aluno.getNota1(),aluno.getNota2(),aluno.getNota3());
			aluno.calcularMedia();
		}
		
		

	}

}
