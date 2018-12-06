package metier.entities;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

//@Table(name="CLIENTS") 
public class Client implements Serializable 
{ 
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	//@Column(name="CODE_CLI") 
	private Long codeClient; 
	//@Column(name="NOM_CLI") 
	private String nomClient; 
	
	@OneToMany(mappedBy="client", fetch=FetchType.LAZY,cascade=CascadeType.ALL) 
	private List<Compte> comptes; 
	
	// Constructeur sans param et avec params
	public Client() {
            super();
	}
	public Client(String nom) {
            nomClient = nom;
	}
        
	// Getters et Setters  
	public Long getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(Long codeClient) {
		this.codeClient = codeClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
} 
