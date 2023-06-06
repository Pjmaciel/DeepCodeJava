package poo.exercicios.listas.desafio;



public class App {

	public static void main(String[] args) {
		 // Criação dos produtos
        Produto produto1 = new Produto("Arroz", 10.0, 50);
        Produto produto2 = new Produto("Feijão", 8.0, 30);
        Produto produto3 = new Produto("Macarrão", 5.0, 20);
        
        // Exibição dos produtos
        Produto.listarProdutos();
        
        // Adição dos produtos ao carrinho
        ItemNoPedido arroz = new ItemNoPedido(produto1, 5);
        ItemNoPedido feijao = new ItemNoPedido(produto2,10);
        ItemNoPedido macarrao = new ItemNoPedido(produto3,2);
        
        // Criação do pedido
        Pedido pedido = new Pedido();
        pedido.adicionarItem(arroz);
        pedido.adicionarItem(feijao);
        pedido.adicionarItem(macarrao);
        
        
     // Exibição dos produtos
        Produto.listarProdutos();
        
        
        // Exibição dos itens do pedido
        pedido.imprimirItens();	

	}

}
