package clase17.ejercicio36;

public class Usuario {

	private int mensajes;
	private String email;
	private String nick;

	public Usuario(String Uemail, String Unick) {
		mensajes = 0;
		email = Uemail;
		nick = Unick;
	}

	// Incrementa el 1 el numero de mensajes
	public void incrementa() {
		mensajes++;
	}

	// decrementa el numero de mensajes
	public void decrementa() {
		mensajes--;
	}

	// cambia el correo
	public void cambiaCorreo(String nuevo) {
		email = nuevo;
	}

	// get and set
	public int getMensajes() {
		return mensajes;
	}

	public String getEmail() {
		return email;
	}

	public String getNick() {
		return nick;
	}

	public void setMensajes(int mensajes) {
		this.mensajes = mensajes;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

}
