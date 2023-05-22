package lp;

import java.util.Scanner;

public class CadastroUsuarios {

	public static void main(String[] args) {
		// responsavel por ativar o teclado
		Scanner teclado = new Scanner(System.in);

		// variaveis
		int idade;
		String email;
		String nome;
		int dDD;
		String telefoneparacontato;

		// dados de entrada

		// mensagens
		System.out.println("usuario digite sua idade");
		idade = teclado.nextInt();

		// mensagens
		System.out.println("usuario digite seu email");
		email = teclado.next();

		// mensagens
		System.out.println("usuario digite seu nome");
		nome = teclado.next();

		// mensagens
		System.out.println("usuario digite o DDD");
		dDD = teclado.nextInt();
		System.out.print("");
		// mensagens
		System.out.println("usuario digite seu telefone para contato sem o DDD");
		telefoneparacontato = teclado.next();

		// dados de saida

		System.out.println("nome : " + nome + "\ne-mail : " + email + "\nidade : " + idade
				+ "\ntelefone para contato : ( " + dDD + " ) " + telefoneparacontato);
		teclado.close();
	}

}
