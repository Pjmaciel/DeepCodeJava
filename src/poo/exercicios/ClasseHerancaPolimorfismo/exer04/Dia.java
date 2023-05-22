package poo.exercicios.ClasseHerancaPolimorfismo.exer04;
import java.util.Scanner;
public class Dia {
	
	private Scanner keyboard = new Scanner(System.in);
	private int dia;
	
	
	public Dia(int dia) {
		while(dia<1 || dia >31 ) {
			System.out.print("Entrada Invalida! \ndigite um dia entre 1 e 31: ");
		    dia = keyboard.nextInt();
		}
		this.dia = dia;		
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		String mensagemDia = this.dia < 10 ? "0"+this.getDia() : ""+this.getDia();
		return mensagemDia;
	}
	
	

}
