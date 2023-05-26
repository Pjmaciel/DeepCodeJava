package poo.exercicios.interfaces.exer02;

public class DbApp {
	public static void main(String[] args) {
		Database dbMysqlconnection1 = new MySQLDatabase("Santos", "pinacoteca");
		Database dbPostgreconnection1 = new PostgreSQLDatabase("linux", "Interfaces");
		
		Database dbMysqlconnection2 = new MySQLDatabase("stanley", "swordfish");
		Database dbPostgreconnection2 = new PostgreSQLDatabase("neo", "redpill");
		
		
		dbMysqlconnection1.connect();
		dbMysqlconnection1.query("SELECT * FROM tabela");
		dbMysqlconnection1.execute("INSERT INTO tabela (coluna1, coluna2) VALUES (valor1, valor2)");
		dbMysqlconnection1.disconnect();
		System.out.println("");
		System.out.println("============");
		System.out.println("");
		dbPostgreconnection1.connect();
		dbPostgreconnection1.query("SELECT * FROM tabela");
		dbPostgreconnection1.execute("INSERT INTO tabela (coluna3, coluna4) VALUES (valor10, valor20)");
		dbPostgreconnection1.disconnect();
		System.out.println("");
		System.out.println("============");
		System.out.println("");
		dbMysqlconnection2.connect();
		dbMysqlconnection2.query("SELECT * FROM tabela");
		dbMysqlconnection2.execute("INSERT INTO tabela (coluna3, coluna25) VALUES (valor21, valor12)");
		dbMysqlconnection2.disconnect();
		System.out.println("");
		System.out.println("============");
		System.out.println("");
		dbPostgreconnection2.connect();
		dbPostgreconnection2.query("SELECT * FROM tabela");
		dbPostgreconnection2.execute("INSERT INTO tabela (coluna7, coluna3) VALUES (valor5, valor8)");
		dbPostgreconnection2.disconnect();
		System.out.println("============");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
