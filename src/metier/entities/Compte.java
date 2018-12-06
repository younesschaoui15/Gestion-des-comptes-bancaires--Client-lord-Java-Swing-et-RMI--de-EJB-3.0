package metier.entities;

import java.io.Serializable; 
import java.util.Collection; 
import java.util.Date;

import javax.persistence.*; 
import javax.persistence.Entity;
import org.hibernate.annotations.*;



@Entity 
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name="typeCompte",discriminatorType=DiscriminatorType.STRING)//,length=2) 
public abstract class Compte implements Serializable 
{ 
	private static final long serialVersionUID = 1L;
	@Id 
	//@Column(name="NUM_CPTE")
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String numCompte; 
	private Date dateCreation; 
	private double solde; 
	
	@ManyToOne 
	@JoinColumn(name="codeClient") 
	private Client client; 
	
	@ManyToOne 
	@JoinColumn(name="numEmploye") 
	private Employe employe; 
	
	@OneToMany(mappedBy="compte") 
	private Collection<Operation> operations;
	
	// Constructeur sans param et avec params 
	public Compte() {
		super();
	}
	public Compte(Date date, double solde) 
	{
        this.dateCreation = date;
        this.solde = solde;
	}
	
	// Getters et Setters 
	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	} 
} 
