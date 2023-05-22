/* Faça um programa para simular o retorno de um investimento. 
 * O programa deve ter duas opções de simulação:

   Pedir o valor a ser investido, 
   a taxa de juros ao ano e 
   o tempo em anos que o dinheiro irá ficar investido. 
   A saída desta simulação deverá ser a evolução do patrimônio ao longo dos anos. (Mais complidado)

   Pedir  o valor a ser investido, 
   a taxa de juros ao ano,
   e o valor final esperado.
   O programa deve exibir em quanto tempo o dinheiro precisará ficar investido para alcançar 
   o objetivo. (mais simples)
 
*/
package lp;

import static java.lang.System.out;
import java.lang.Thread;

import java.util.Scanner;

public class DesafioFinalIAP {

	public static void main(String[] args) throws InterruptedException { // throws InterruptedException indica que um método pode ter uma interrupção enquanto espera e é usada para sinalizar a 	ocorrência de uma interrupção de thread.
																		// Spolier de OO
		/// Ativar teclado
		Scanner scanner = new Scanner(System.in);

		// Frescurinhas
		String linha = "---------------------------";
		String fim = "-----FIM DO PROGRAMA--------";

		// Variaveis
		double taxaDeJuros, valorInvestido, novoValor = 0, valorDesejado, jurosCompostos;
		int tempoInvestido, contadorTempo = 1;
		long pause = 1000;

		// Dados de entrada
		out.println(linha + "InvesteAI" + linha);
		out.println("");
		out.println("Bem vindo ao investeAI, escolha qual tipo de investimento deseja: ");
		out.println(" [ 1 ] - Simulação de evolução do patrimônio ao longo dos anos.");
		out.println(" [ 2 ] - Simulacao de tempo necessário para alcançar um valor desejado.");
		out.print("Digite o numero correspondente a simulação: ");
		int escolha = scanner.nextInt();

		while (escolha != 1 && escolha != 2) {
			out.println("Valor invalido, tente novamente...");
			out.print("Digite o numero correspondente a simulação: ");
			escolha = scanner.nextInt();
		}
		// Simulacao 1
		if (escolha == 1) {
			out.println("Voce escolheu a Simulaçao 1...");
			out.println("");
			out.print("Digite o valor a ser investido: ");
			valorInvestido = scanner.nextDouble();
			out.print("Digite o valor de juros ao Ano: ");
			taxaDeJuros = scanner.nextDouble();
			out.print("Quantos anos o dinheiro vai ficar investido? ");
			tempoInvestido = scanner.nextInt();

			// Dados de saida Simulação 1
			out.printf("Se voce investir R$ %.2f%n", valorInvestido);
			for (int ano = 1; ano <= tempoInvestido; ano++) {// O loop começa no primeiro ano para contabilizar o valor investido
				jurosCompostos = Math.pow((1 + taxaDeJuros / 100), ano);// calculo da foruma M = c x (1+i)^t
				novoValor = valorInvestido * jurosCompostos;
				Thread.sleep(pause);
				out.printf("No %d° Ano voce tera R$ %.2f%n", ano, novoValor);

			}
			// Simulacao 2
		} else if (escolha == 2) {
			// Dados de entrada Simulaçao 2
			out.println("Voce escolheu a Simulação 2...");
			out.println("");
			out.print("Digite o valor a ser investido: ");
			valorInvestido = scanner.nextDouble();
			out.print("Digite o valor de juros ao Ano: ");
			taxaDeJuros = scanner.nextDouble();
			out.print("Digite o valor esperado: ");
			valorDesejado = scanner.nextDouble();

			// Calculo do juros compostos.
			jurosCompostos = 1 + taxaDeJuros / 100; // adicionando 1 ao valor da taxa de juros dividida por 100, para ser decimal.

			// Estrutura do loop para obter o tempo do investimento.
			while (novoValor < valorDesejado) {
				novoValor = valorInvestido * Math.pow(jurosCompostos, contadorTempo);
				contadorTempo++;
			}
			// Dados de saida Simulação 2.
			out.println(linha + linha);
			out.printf("Investindo : R$ %.2f%n", valorInvestido);
			out.println("Com a taxa de " + taxaDeJuros + "% ao ano");
			out.println(linha + linha);
			out.println("Voce levará aproximadamente \n");
			out.println("calculando... \n");
			Thread.sleep(pause, 2);
			out.printf("%d anos para chegar no valor de R$ %.2f%n", contadorTempo, valorDesejado);
			out.println(linha + linha);
		}
		scanner.close();
		out.print("\n" + fim);

	}

}
