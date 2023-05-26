package poo.exercicios.interfaces.desafio;

public class EmailChannel implements NotificationChannel {

	@Override
	public void sendNotification(String messager) {
		System.out.printf("%n\u001B[33m%s\u001B[0m%n","Enviando e-mail:");
		System.out.println(messager);

	}

	@Override
	public void subscribe(String user) {
		System.out.println("Usuario: "+ user);
		System.out.printf("\u001B[33m%s\u001B[0m%n","Foi feita por Inscrição por e-mail: ");
		
		

	}

	@Override
	public void unsubscribe(String user) {
		System.out.printf("%n\u001B[33m%s\u001B[0m%n","Cancelando inscrição por e-mail:");
		System.out.println("Usuario: "+ user);
	}

}
