package poo.exercicios.ClasseHerancaPolimorfismo.exer04;

public class Data {
	
	private Dia dia;
	private Mes mes;
	private Ano ano;
	
	public Data(Dia dia, Mes mes, Ano ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Dia getDia() {
		return dia;
	}
	public void setDia(Dia dia) {
		this.dia = dia;
	}
	public Mes getMes() {
		return mes;
	}
	public void setMes(Mes mes) {
		this.mes = mes;
	}
	public Ano getAno() {
		return ano;
	}
	public void setAno(Ano ano) {
		this.ano = ano;
	}
	
	public void AvancarDia() {
		int diaAtual = dia.getDia();
		int mesAtual = mes.getMes();
		int anoAtual = ano.getAno();
		
		// Verificar se o dia atual é o último dia do mês
	    if (diaAtual == 31 || (diaAtual == 28 & mesAtual == 2)) {
	        // Verificar se o mês atual é dezembro (último mês do ano)
	        if (mesAtual == 12) {
	            // Avançar para o próximo ano
	            ano.setAno(anoAtual + 1);
	            mes.setMes(1); // Definir o próximo mês como janeiro
	        } else {
	            // Avançar para o próximo mês
	            mes.setMes(mesAtual + 1);
	        }
	        dia.setDia(1); // Definir o próximo dia como o primeiro dia do mês
	    } else {
	        // Avançar para o próximo dia
	        dia.setDia(diaAtual + 1);
	    }
				
	}
	
	@Override
	public String toString() {
		AvancarDia();
		return "Dia seguinte: "+dia.toString()+mes.toString()+ano.toString();
	}
	
	

}
