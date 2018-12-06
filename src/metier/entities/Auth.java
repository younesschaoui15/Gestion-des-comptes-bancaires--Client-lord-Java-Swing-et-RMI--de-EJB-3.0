package metier.entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Auth
 *
 */
@Entity

public class Auth implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String login;
	private String password;
	
	@OneToOne 
	@JoinColumn(name="numEmploye") 
	private Employe employe;

	//Constructeurs:
	public Auth() {
		super();
	} 
	public Auth(String l, String p) {
		login=l;
		password=p;
	}
	
	//Getters & Setters
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
        public void setEmploye(Employe emp) {
		this.employe = emp;
	}
	public Employe getEmploye() {
		return this.employe;
	}   
}
