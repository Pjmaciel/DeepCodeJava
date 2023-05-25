package poo.exercicios.interfaces.exer01;

public class Rectangle implements Shape {
	private double base;
	private double height;
	
	

	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void calculateArea() {// A=b⋅h.
		System.out.println("====== Area ▭ =======");
		double area = this.base * this.height;
		System.out.printf("A area do Retangulo é : %.2f%n",area);


	}

	@Override
	public void calculatePerimeter() {//P=2(b+h)
		System.out.println("====== Perimeter ▭ =======");
		double perimeter = 2*(this.base+this.height);
		System.out.printf(" O Perimetro do Retangulo é : %.2f%n",perimeter);


	}

}
