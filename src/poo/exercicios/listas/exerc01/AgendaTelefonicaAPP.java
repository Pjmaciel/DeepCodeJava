package poo.exercicios.listas.exerc01;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonicaAPP {

	public static void main(String[] args) {
		List<Contato> contatos = new ArrayList<>();
		
		int cont = 0;
		
		Contato contato1 = new Contato("Pablo","0811111-0000");
		Contato contato2 = new Contato("Jorge","0812222-0000");
		Contato contato3 = new Contato("Maciel","0813333-0000");
		Contato contato4 = new Contato("Benicio","0814444-0000");
		
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		
		for (Contato contato : contatos) {
			++cont;
			System.out.println("Contato "+cont+"\n"+contato);
			
			
		}	
		

	}

}
