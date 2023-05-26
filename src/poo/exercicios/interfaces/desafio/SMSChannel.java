package poo.exercicios.interfaces.desafio;

public class SMSChannel implements NotificationChannel {

	@Override
	public void sendNotification(String messager) {
		System.out.printf("%n\u001B[32m%s\u001B[0m%n","Enviando SMS");
		System.out.println(messager);

	}

	@Override
	public void subscribe(String user) {
		System.out.println("Telefone: +55"+ user);
		System.out.printf("\u001B[32m%s\u001B[0m%n","Inscrição por SMS:");

	}

	@Override
	public void unsubscribe(String user) {
		System.out.printf("%n\u001B[32m%s\u001B[0m%n","Cancelando inscrição por SMS:");
		System.out.println("Telefone: +55"+ user);
	}

}
