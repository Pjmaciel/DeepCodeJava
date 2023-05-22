package poo.exercicios.ClasseHerancaPolimorfismo.exer02;

import java.util.ArrayList;

public class Voo {
	private static ArrayList<Voo> colecao = new ArrayList<Voo>(100);

	private Passageiro passageiro;
	private int numeroDoVoo;
	private String data;
	private int numeroDaCadeira;

	public Voo() {

		for (int i = 0; i < 100; i++) {
			colecao.add(null);
		}

	}

	public Voo(Passageiro passageiro, String data, int numeroDaCadeira) {
		this.numeroDaCadeira = numeroDaCadeira;
		if (numeroDaCadeira >= 1 && numeroDaCadeira <= 100 && colecao.get(numeroDaCadeira - 1) == null) {
			colecao.set(numeroDaCadeira - 1, this);
			this.passageiro = passageiro;
			this.data = data;
			this.numeroDoVoo = 0001;
		}

	}

	public static void listarCadeiras() {
		System.out.println("====== Informaçoes Do Voo =====");
		for (Voo voo : colecao) {
			if (voo != null) {
				System.out.println("\nVoo: " + voo.numeroDoVoo + "\nPassageiro: " + voo.getPassageiro().getNome()
						+ "\nData da Viagem: " + voo.getData() + "\nNumero da Cadeira: " + voo.getNumeroDaCadeira());
			}
		}
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getNumeroDaCadeira() {
		return numeroDaCadeira;
	}

	public void setNumeroDaCadeira(int numeroDaCadeira) {
		this.numeroDaCadeira = numeroDaCadeira;
	}

	/*
	 * ProximoLivre retorna o número da próxima cadeira livre.
	 */
	public Integer proximoLivre(Voo voo) {
		System.out.println("====== Proxima Cadeira Livre =====");
		for (int i = 0; i < colecao.size(); i++) {
			if (colecao.get(i) == null && voo.getNumeroDaCadeira() != i + 1) {
				return i + 1;
			}
		}
		// caso não haja cadeiras livres
		return null;

	}

	/*
	 * “Verificar” que verifica se o número da cadeira recebido como parâmetro está
	 * ocupada.
	 */
	public void verificar(int numeroDaCadeira) {
		System.out.println("====== Verificar Se Cadeira esta Ocupada =====");
		if (colecao.get(numeroDaCadeira - 1) != null) {
			System.out.println("Cadeira Ocupada");
		} else {
			System.out.println("Cadeira Livre");
		}
	}

	/*
	 * Vagas retornam o número de cadeiras vagas disponíveis (não ocupadas) no vôo
	 */

	public void vagas() {
		System.out.println("====== Mostrar as cadeiras Disponiveis =====");
		int i = 1;
		for (Voo voo : colecao) {
			if (voo == null) {
				System.out.println("Cadeira vazia:" + i);
			}
			i++;
		}

	}

	/*
	 * GetVoo retorna o número do vôo. //
	 */
	public int getVoo() {
		return this.numeroDoVoo;

	}

}
