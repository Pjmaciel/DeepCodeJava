package poo.exercicios.ClasseHerancaPolimorfismo.exer06;

public class Compra extends Produto {

	private Produto produto;
	private int quantidade;

	public Compra(Produto produto, int quantidade) {
		this.produto = produto;
		if (this.quantidade < 0) {
			this.quantidade = 0;
		}
		this.quantidade = quantidade;
	}

	public Double calcularTotal() {
		double calcularTotal = produto.getPrecoUnitario() * quantidade;
		return calcularTotal;

	}

	@Override
	public String toString() {
		String resultado = "=== ITENS DO PEDIDO ===\n";
		resultado += produto.getNome() + "\n"; // como é uma string ela nao vai substituir e sim concatenar;
		resultado += String.format("Descrição: %s%n- Preço unitário: R$ %.2f%n- Quantidade: %d%n- Total do Pedido: R$ %.2f%n",
				produto.getDescricao(), produto.getPrecoUnitario(), this.quantidade, calcularTotal());
		return resultado;
	}
}
