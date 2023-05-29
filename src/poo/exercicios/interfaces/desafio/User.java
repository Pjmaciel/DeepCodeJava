package poo.exercicios.interfaces.desafio;

public class User  {
	private String name;
	private String email;
	private String phone;
	private NotificationChannel notification;

	public User(String name, String email, String phone, NotificationChannel notification) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.notification = notification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public NotificationChannel getNotification() {
		return notification;
	}

	public void setNotification(NotificationChannel notification) {
		this.notification = notification;
	
		
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone=" + phone + ", notification=" + notification
				+ ", getNotification()=" + getNotification() + "]";
	}
	
	
	
	

	
	
	
	
	

}
