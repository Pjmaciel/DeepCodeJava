package poo.exercicios.listas.desafio;

import java.util.ArrayList;


public class Pedido {
	private ArrayList<ItemNoPedido> itens = new ArrayList<>();

	public void adicionarItem(ItemNoPedido item) {
		this.itens.add(item);
	}

	public double calcularTotal() {
		double total = 0;
		for (ItemNoPedido item : itens) {
			total += item.getSubtotal();
		}
		return total;
	}

	public void imprimirItens() {
		System.out.println("=== ITENS DO PEDIDO ===");
		for (ItemNoPedido item : itens) {
			System.out.println(item.getProduto().getNome() + " - Quantidade: " + item.getQuantidade()
					+ " - Subtotal: R$" + item.getSubtotal());
		}
		System.out.println("Total do Pedido: R$" + calcularTotal());
	}

}
