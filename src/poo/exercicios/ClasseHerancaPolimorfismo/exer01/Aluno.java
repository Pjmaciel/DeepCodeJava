package poo.exercicios.ClasseHerancaPolimorfismo.exer01;

import static java.lang.System.out;

public class Aluno {
	private int matricula;
	private String nome;
	private double nota1, nota2, notaTrabalho;

	public Aluno(int matricula, String nome, double nota1, double nota2, double notaTrabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1 / 2.5;
		this.nota2 = nota2 / 2.5;
		this.notaTrabalho = notaTrabalho / 2;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}

	public void media() {
		double mediaFinal = this.nota1 + this.nota2 + this.notaTrabalho;
		String situacao = "";
		double notaRecuperacao;
		if (mediaFinal >= 7 ) {
			situacao = "Aprovado";
			notaRecuperacao = 0;
		} else if (mediaFinal < 7) {
			situacao = "Recuperação";
			notaRecuperacao = 14 - mediaFinal;
			if (notaRecuperacao > 10) {
				situacao = "Reprovado";
				out.printf("Necessario tirar a nota maior que 10%n");
			}else {
				out.printf("Nota Necessaria na Recuperação: %.2f%n", notaRecuperacao);
			}
		}
		out.printf("Aluno: %s%n" + "Media Final: %.2f%n" + "Status: %s%n", this.nome, mediaFinal, situacao);
	}

}
