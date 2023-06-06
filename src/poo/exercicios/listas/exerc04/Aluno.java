package poo.exercicios.listas.exerc04;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int idade;
	private double nota1;
	private double nota2;
	private double nota3;
	private List<Double> notas;
	
	

	public Aluno(String nome, int idade, double nota1, double nota2, double nota3) {
		notas = new ArrayList<>();
		this.nome = nome;
		this.idade = idade;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		notas.add(this.nota1);
		notas.add(this.nota2);
		notas.add(this.nota3);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Double> getNotas() {
		return notas;
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

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	
	public void calcularMedia() {
		double media = (this.nota1 + this.nota2 + this.nota3) / 3;
		System.out.printf("Aluno: %s tem media %.2f%n",this.nome, media);
	}

}
