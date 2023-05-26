package poo.exercicios.interfaces.exer02;

public class PostgreSQLDatabase implements Database {
	private String username;
	private String password;
	private boolean isConnected;
	
	public PostgreSQLDatabase(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public void connect() {
		if(this.username.equalsIgnoreCase("neo")&& this.password.equalsIgnoreCase("redpill")) {
			System.out.println("User: "+this.username);
			System.out.printf("\u001B[32m%s\u001B[0m%n","Connected to PostgreSQL database");
			this.isConnected = true;
		}else {
			System.out.println("User or Password Incorrect!");
			System.out.printf("\u001B[31m%s\u001B[0m%n","Is not possible connect to database!");
		}	

	}

	@Override
	public void disconnect() {
		if (!this.isConnected) {
			System.out.printf("%n\u001B[31m%s\u001B[0m%n","Erro: User not connected!");
		}else {
			System.out.printf("%n\u001B[33m%s\u001B[0m%n","Disconnected from PostgreSQL database");

		}
		
	}

	@Override
	public void query(String query) {
		if (!this.isConnected) {
			System.out.printf("%n\u001B[31m%s\u001B[0m%n%n", "Erro: User not connected!");
		}else {
			System.out.printf("Result of the query: ... %n%s%n",query);
			
		}
	}

	@Override
	public void execute(String query) {
		if (!this.isConnected) {
			System.out.printf("%n\u001B[31m%s\u001B[0m%n","Query execute Unsuccessfully \nErro: User not connected!");

		}else {
			System.out.printf("%n\u001B[32m%s\u001B[0m%n","Query executed successfully");
		}
	}

	

}
