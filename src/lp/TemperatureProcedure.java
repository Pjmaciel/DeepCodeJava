package lp;

public class TemperatureProcedure {

	public static void main(String[] args) {
				
		// Input Data
		double temp = 36 + Math.random()*3;// Generate number between 36 and 39
		System.out.printf("The temperature sensor: %.1f%n", temp);
				
		//Conditions
		if(temp <= 37) {
			// Output data
			System.out.println("\nYou can enter the establishment.");
		}else {
			//Output data
			System.out.println("\nYou cannot enter the establishment.");
		}
		
		System.out.println("\n-----------------Fim Do Programa------------");
	}

}
