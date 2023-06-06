package poo.exercicios.listas.exerc03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		Funcionario f = new Funcionario("Pablo", 200);
		Funcionario f1 = new Funcionario("Jorge", 400);
		Funcionario f2 = new Funcionario("Maciel", 100);
		Funcionario f3 = new Funcionario("Ana", 150);
		Funcionario f4 = new Funcionario("Leticia", 350);
		Funcionario f5 = new Funcionario("Benicio", 500);
		Funcionario f6 = new Funcionario("Maria", 1000);
		Funcionario f7 = new Funcionario("Joao", 550);
		
		funcionarios.add(f);
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		funcionarios.add(f4);
		funcionarios.add(f5);
		funcionarios.add(f6);
		funcionarios.add(f7);
		
		
		
		
		System.out.println("====== Aumento 10% =======");
		for (Funcionario funcionario : funcionarios) {
			double aumento =funcionario.getSalario() + (funcionario.getSalario() *0.1);
			System.out.printf("%nFuncionario : %S%n"
					        + "• Salario sem aumento R$: %.2f%n"
					        + "• Salario Com os 10%% R$: %.2f%n", funcionario.getNome(),funcionario.getSalario(),aumento);
			
			
		}
		
		
	}

}
