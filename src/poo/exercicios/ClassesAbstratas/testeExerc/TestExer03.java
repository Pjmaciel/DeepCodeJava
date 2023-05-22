package poo.exercicios.ClassesAbstratas.testeExerc;

import poo.exercicios.ClassesAbstratas.exer03.Cavalo;
import poo.exercicios.ClassesAbstratas.exer03.Peao;
import poo.exercicios.ClassesAbstratas.exer03.Rainha;
import poo.exercicios.ClassesAbstratas.exer03.Rei;
import poo.exercicios.ClassesAbstratas.exer03.Torre;

public class TestExer03 {

	public static void main(String[] args) {
		Torre torre = new Torre("Torre");
		Cavalo cavalo = new Cavalo("Cavalo");
		Rainha rainha = new Rainha("Rainha");
		Rei rei = new Rei("Rei");
		Peao peao = new Peao("Peão");
		
		torre.mover();
		

	}

}
