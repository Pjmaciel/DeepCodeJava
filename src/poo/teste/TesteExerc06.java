package poo.teste;

import poo.exercicios.exer06.Celular;
import poo.exercicios.exer06.Notebook;
import poo.exercicios.exer06.Produto;

public class TesteExerc06 {

	public static void main(String[] args) {
		Produto celular = new Celular("galaxy s21", 2500,3,3);
		Produto notebook = new Notebook("Dell G15", 5000, 3, 5);
		
		celular.vender(1);
		System.out.println("===========");
		notebook.vender(1);

	}

}
