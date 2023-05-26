package poo.exercicios.interfaces.desafio;

public class NotificationApp {

	public static void main(String[] args) {
		NotificationChannel email = new EmailChannel();
		NotificationChannel sms = new SMSChannel();
		NotificationChannel push = new PushNotificationChannel();
		
		String user = "teste@email.com";
		String tel = "0819999-0000";
		String dispositivo = "Tablet";
		
		email.sendNotification("Olá! Isso é um e-mail.");
		email.subscribe(user);
		email.unsubscribe(user);
		System.out.println("====================");
		sms.sendNotification("Olá! Isso é uma mensagem de SMS.");
		sms.subscribe(tel);
		sms.unsubscribe(tel);
		System.out.println("====================");
		push.sendNotification("Olá! Isso é uma notificação push.");
		push.subscribe(dispositivo);
		push.unsubscribe(dispositivo);
		System.out.println("====================");

	}

}
