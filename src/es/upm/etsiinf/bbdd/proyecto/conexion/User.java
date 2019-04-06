package es.upm.etsiinf.bbdd.proyecto.conexion;

public class User {
	private int user_id;
	private String name;
	public User(int user_id, String name) {
		this.user_id = user_id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUser_id() {
		return user_id;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + "]";
	}
	
}
