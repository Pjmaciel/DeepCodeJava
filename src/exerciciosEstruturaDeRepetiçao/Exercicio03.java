package exerciciosEstruturaDeRepetiçao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
		        Scanner input = new Scanner(System.in);

		        String nome = "";
		        int idade = -1;//iniciar o while
		        double salario = -1.0;//iniciar o while
		        String sexo = "", estadoCivil = "";

		        // Validando o nome
		        while (nome.length() <= 3) {
		            System.out.print("Digite seu nome (maior que 3 caracteres): ");
		            nome = input.nextLine();
		        }

		        // Validando a idade
		        while (idade < 0 || idade > 150) {
		            System.out.print("Digite sua idade (entre 0 e 150): ");
		            idade = input.nextInt();
		        }

		        // Validando o salário
		        while (salario <= 0) {
		            System.out.print("Digite seu salário (maior que zero): ");
		            salario = input.nextDouble();
		        }

		        // Validando o sexo
		        while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
		            System.out.print("Digite seu sexo ('f' ou 'm'): ");
		            sexo = input.next();
		        }

		        // Validando o estado civil
		        while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
		            System.out.print("Digite seu estado civil ('s', 'c', 'v' ou 'd'): ");
		            estadoCivil = input.next();
		        }

		        // Exibindo as informações validadas
		        System.out.println("\nInformações Aceitas!");
		        System.out.printf("Nome: %S%n" , nome);
		        System.out.println("Idade: " + idade);
		        System.out.printf("Salário: R$ %.2f%n", salario);
		        System.out.printf("Sexo: %S%n" , sexo);
		        System.out.println("Estado Civil: " + estadoCivil);

		        input.close();

	}
}
