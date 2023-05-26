package poo.exercicios.interfaces.desafio;

public class PushNotificationChannel implements NotificationChannel {

	@Override
	public void sendNotification(String messager) {
		System.out.printf("%n\u001B[34m%s\u001B[0m%n","Enviando notificação push:");

	}

	@Override
	public void subscribe(String user) {
		System.out.println("Dispositivo: "+ user);
		System.out.printf("\u001B[34m%s\u001B[0m%n","Inscrição em notificação push: ");

	}

	@Override
	public void unsubscribe(String user) {
		System.out.printf("%n\u001B[34m%s\u001B[0m%n","Cancelando inscrição em notificação push: ");
		System.out.println("Dispositivo: "+ user);
	}

}
