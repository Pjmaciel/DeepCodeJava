package poo.exercicios.exer07;


public class ItemNoPedido {
	
	private Produto produto;
    private int quantidade;

    public ItemNoPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        produto.retirarQuantidade(quantidade); //vai chamar o metodo para poder tirar da lista principal
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }
}
