package atividade.opcionais.condicao;

import java.util.Scanner;

public class AtividadeOpcional15 {

	public static void main(String[] args) {
		//Activate Keyboard Input
		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		String typeTriangle;
		
		//data Input
		System.out.println("Digite o 1° lado do triangulo: ");
		int side1 = keyboard.nextInt(); 
		System.out.println("Digite o 2° lado do triangulo: ");
		int side2 = keyboard.nextInt(); 
		System.out.println("Digite o 3° lado do triangulo: ");
		int side3 = keyboard.nextInt(); 
		
		//Decision
		if(side1 == side2 && side1 == side3) {
			typeTriangle = "Equiátero";
		}else if(side1 == side2 || side1 == side3) {
			typeTriangle = "Isósceles";
		}else {
			typeTriangle = "Escaleno";
		}
		
		//Data Output
		System.out.println("Triangulo: "+ typeTriangle);
		
		keyboard.close();
	}

}
