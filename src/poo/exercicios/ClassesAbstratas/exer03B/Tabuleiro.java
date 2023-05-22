package poo.exercicios.ClassesAbstratas.exer03B;

import java.util.ArrayList;


public class Tabuleiro {
	private static ArrayList<Pecas> tabuleiro;
	
	public Tabuleiro() {
		tabuleiro = new ArrayList<Pecas>(64);
		inicializarTabuleiro();
	}
	
	private static void inicializarTabuleiro() {
		// Preencher todo o tabuleiro com peças vazias
	    for (int i = 0; i < 64; i++) {
	        tabuleiro.add(null);
	    }
	    for (int i = 8; i < 16; i++) {
	        tabuleiro.set(i, new Peao(Cor.BRANCO));
	    }
	    tabuleiro.set(0,new Torre(Cor.BRANCO));
	    tabuleiro.set(7,new Torre(Cor.BRANCO));
	    
	    tabuleiro.set(1, new Cavalo(Cor.BRANCO));
	    tabuleiro.set(6, new Cavalo(Cor.BRANCO));
	    
	    tabuleiro.set(2, new Bispo(Cor.BRANCO));
	    tabuleiro.set(5, new Bispo(Cor.BRANCO));
	    
	    tabuleiro.set(3, new Rainha(Cor.BRANCO));
	    tabuleiro.set(4, new Rei(Cor.BRANCO));
	    
	}
	
	public static void adicionarPeca(Pecas peca) {
        tabuleiro.add(peca);
    }

    public static Pecas getPeca(int index) {
        return tabuleiro.get(index);
    }

    public static void moverPeca(int indexOrigem, int indexDestino) {
    	Pecas peca = tabuleiro.get(indexOrigem);
    	if(peca != null) {
    		
    		tabuleiro.set(indexDestino, peca);
    		tabuleiro.set(indexOrigem, null);
    	}
    }
    
    public static void imprimirTabuleiro() {
        for (int i = 0; i < 64; i++) {
        	Pecas peca = tabuleiro.get(i);
            if (peca != null) {
                System.out.print(peca + " ");
            } else {
                System.out.print("[ ]" + " ");
            }
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
    }
		
	
}
