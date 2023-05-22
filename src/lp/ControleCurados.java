package lp;

public class ControleCurados {

	public static void main(String[] args) {
		
		//Variaveis declaradas
		double peopleHealth = 40000;
		double peopleInfected = 100000;
		double healthRate = 0.03;
		double infectedRate = 0.015;
		int countmounth = 0;
		
		
		//Loop para calculo de quantidade de curados vs infectados por mes
		while(peopleHealth < peopleInfected){
			peopleHealth = peopleHealth +(peopleHealth * healthRate);
			peopleInfected = peopleInfected + (peopleInfected * infectedRate);
			countmounth++;
		}
		
		System.out.printf(" O numero de meses para Pessoas curadas ultrapassar as pessoas infectadas é %d.", countmounth);
	}

}
