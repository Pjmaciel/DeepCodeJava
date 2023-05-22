package poo.exercicios.JogoDaVelha;

import java.util.ArrayList;

public class Board {
	private ArrayList<Pecas> board;

	public Board() {
		board = new ArrayList<Pecas>(9);
		startBoard();
	}

	public void startBoard() {
		// Preencher todo o tabuleiro com peças vazias
		for (int i = 0; i < 9; i++) {
			board.add(null);
		}
	}

	public void addPeca(Pecas peca) {
		board.add(peca);
	}

	public Pecas getPeca(int index) {
		return board.get(index);
	}

	// esse é igual ao ADD mas vou deixar para tentar entender
	public void insertPeca(Pecas peca, int indexDestino) {
		board.set(indexDestino, peca);

	}

	public void printBoard() {
		for (int i = 0; i < 9; i++) {
			Pecas peca = board.get(i);// recupera a peça na posição i da lista tabuleiro e armazena na variável peca.
			if (peca != null) {
				System.out.printf("   [ \u001B[31m%S\u001B[0m ]" + " ", peca);
			} else {
				System.out.print("    [ " + i + " ]" + " ");
			}

			if ((i + 1) % 3 == 0) { // ajusta o limite do loop for para 9 e verificamos se (i + 1) % 3 == 0 para
									// verificar se uma linha completa foi impressa. Isso ocorre porque agora temos
									// 3 colunas em vez de 8.
				System.out.println();
			}
		}
	}

}
