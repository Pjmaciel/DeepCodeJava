package poo.exercicios.interfaces.exer01;

public class Circle implements Shape {
	 private double radius;
	 private double pi = 3.14;
	
	 
	 
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() { //A = π . r²
		System.out.println("====== Area ◯ =======");
		double area = (this.radius * this.radius) * pi;
		System.out.printf("A area do Circulo é : %.2f%n",area);
		
		
		
	}

	@Override
	public void calculatePerimeter() {//P = 2 . π . r
		System.out.println("====== Perimeter ◯ =======");
		double perimeter = 2*pi*this.radius;
		System.out.printf("O Perimetro do Circulo é : %.2f%n",perimeter);

		
	}



}
