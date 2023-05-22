package poo.teste;

import static java.lang.System.out;
import poo.exercicios.exer05.Assistente;
import poo.exercicios.exer05.Funcionario;
import poo.exercicios.exer05.Gerente;

public class TesteExerc05 {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente("Pablo", 5000,"Dev","12345678");
		
		Funcionario assistente = new Assistente("Jorge", 2000, "RH", 8);
		
		gerente.calcularSalario();
		out.println("");
		assistente.calcularSalario();
		

	}

}
