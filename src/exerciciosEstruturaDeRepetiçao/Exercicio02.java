package exerciciosEstruturaDeRepetiçao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        String nomeUsuario = "", senha = "";

        // Validando nome de usuário e senha
        while (senha.equals(nomeUsuario)) {
            System.out.print("Digite seu nome de usuário: ");
            nomeUsuario = input.next();

            System.out.print("Digite sua senha (não pode ser igual ao nome de usuário): ");
            senha = input.next();

            if (senha.equals(nomeUsuario)) {
                System.out.println("A senha não pode ser igual ao nome de usuário. "
                		+ "\nTente novamente.\n");
                
            }
        }

        System.out.println("\nLogin realizado com sucesso!");

        input.close();

	}

}
