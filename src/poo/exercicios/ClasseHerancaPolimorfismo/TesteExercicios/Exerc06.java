package poo.exercicios.ClasseHerancaPolimorfismo.TesteExercicios;

import static java.lang.System.out;
import java.util.Scanner;

import poo.exercicios.ClasseHerancaPolimorfismo.exer06.Compra;
import poo.exercicios.ClasseHerancaPolimorfismo.exer06.Produto;

/*Crie uma classe chamada Compra que possa ser utilizada por uma loja de suprimentos de informática para representar uma fatura de um item vendido na loja. 
 * Uma fatura deve incluir as seguintes informações como atributos: 
 * • o número do item faturado, 
 * • a descrição do item, 
 * • a quantidade comprada do item e 
 * • o preço unitário do item. 
 * Sua classe deve ter um construtor que inicialize os quatro atributos. 
 * Se a quantidade não for positiva, ela deve ser configurada como 0.
 * Se o preço por item não for positivo ele deve ser configurado como 0.0. 
 * Forneça um método set e um método get para cada variável de instância. 
 * Além disso, forneça um método chamado calcularTotal que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item) 
 * e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as capacidades da classe.
 * 
 */

public class Exerc06 {

	public static void main(String[] args) {

		int item = 0;
		int quantidade = 0;
		Scanner keyboard = new Scanner(System.in);
		Produto Atendente = new Produto();
		Produto produto1 = new Produto("Celular", "É um celular", 1500);
		Produto produto2 = new Produto("Notebook", "É um notebook", 3000);
		Produto produto3 = new Produto("Computador", "é um Computador", 5000);
		Atendente.listarProdutos();

		out.println("");
		out.print("Informe qual item deseja comprar: ");
		item = keyboard.nextInt();
		if (item == 1) {
			Atendente = produto1;
		} else if (item == 2) {
			Atendente = produto2;
		} else if (item == 3) {
			Atendente = produto3;
		}

		System.out.print("Informe a quantidade: ");
		quantidade = keyboard.nextInt();
		out.println("");
		Compra compra = new Compra(Atendente, quantidade);
		out.println(compra);

	}
}
