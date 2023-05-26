package poo.exercicios.interfaces.exer02;

public interface Database {
	public void connect();
	public void disconnect();
	public void query(String query);
	public void execute(String query);	
	


}
