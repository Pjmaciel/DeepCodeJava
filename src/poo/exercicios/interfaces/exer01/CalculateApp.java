package poo.exercicios.interfaces.exer01;

public class CalculateApp {

	public static void main(String[] args) {
		Circle circulo = new Circle(3);
		Rectangle retangulo = new Rectangle(12, 5);
		
		circulo.calculateArea();
		System.out.println("");
		circulo.calculatePerimeter();
		System.out.println("");
	
		retangulo.calculateArea();
		System.out.println("");
		retangulo.calculatePerimeter();

	}

}
