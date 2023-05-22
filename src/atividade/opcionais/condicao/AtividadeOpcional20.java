package atividade.opcionais.condicao;



public class AtividadeOpcional20 {

	public static void main(String[] args) {
		
		//Manual input
		//double exam1 = 10;
		//double exam2 = 10;
		//double exam3 = 10;
	
		
		//Variables Automaticas 
		double exam1 = Math.random()*11;
		double exam2 = Math.random()*11;
		double exam3 = Math.random()*11;
		String status;
		
		//Calculate media
		double result = (exam1+exam2+exam3)/3;
		
		if (result == 10) {
			status = "aprovado com distinção!";
		}else if(result >=7 && result <=9.9) {
			status = "aprovado!";
		}else {
			status = "reprovado!";
		}
		
		
		System.out.printf("Sua media foi %.1f | Condição: %S %n",result,status);
		System.out.println("\n#=#=#=#=#=#= END APP =#=#=#=#=#=#=#");
		

	}

}
