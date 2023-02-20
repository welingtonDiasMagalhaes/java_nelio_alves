package _13_exercicioFixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //para a data de nascimento
	private String name;
	private String email;
	private Date birthday;
	
	public Client() {
		super();
	}

	public Client(String name, String email, Date birthday) {
		super();
		this.name = name;
		this.email = email;
		this.birthday = birthday;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: "+ this.name);
		sb.append(", (" + sdf.format(birthday) + ")");
		sb.append(", email: "+ this.email);
		
		return sb.toString();
	}	
}
