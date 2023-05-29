package poo.exercicios.JogoDaVelha;

import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		String abertura = "JOGO DA VELHA ";
		X PlayerX = new X(Type.X);
		O PlayerO = new O(Type.O);
		Type currentPlyer;
		Board tabuleiro = new Board();		
		
		out.printf("======== \u001B[33m%s\u001B[0m ========%n",abertura);		
		tabuleiro.startBoard();			
		tabuleiro.printBoard();
		out.println("================================");
		out.println("");
		if (random.nextInt(31) % 2 == 0) {
			currentPlyer = Type.O;
			out.printf(" Primeiro Jogador a começar: \u001B[34m%s\u001B[0m%n", currentPlyer);

		}else {
		currentPlyer = Type.X;
			out.printf(" Primeiro Jogador a começar: \u001B[33m%s\u001B[0m%n", currentPlyer);
			
		}
		
		for(int i =1; i<5; i++ ) {
			out.printf("======== \u001B[33m%s\u001B[0m ========%n",(i+ "ª Rodada"));
			if(currentPlyer == Type.O) {
				out.println("Escolha o local onde voce quer colocar O Seu marcador: ");
				tabuleiro.insertPeca(PlayerO, keyboard.nextInt());
				out.println("Escolha o local onde voce quer colocar O Seu marcador: ");
				tabuleiro.insertPeca(PlayerX, keyboard.nextInt());
				tabuleiro.printBoard();
			}else {
				out.println("Escolha o local onde voce quer colocar O Seu marcador: ");
				tabuleiro.insertPeca(PlayerX, keyboard.nextInt());
				out.println("Escolha o local onde voce quer colocar O Seu marcador: ");
				tabuleiro.insertPeca(PlayerO, keyboard.nextInt());
				tabuleiro.printBoard();
			}
			keyboard.close();
			
		}
	}
}

