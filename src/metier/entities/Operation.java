package metier.entities;

import java.io.Serializable;
import java.util.*; 
import javax.persistence.*; 

@Entity 
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name="typeOperation",discriminatorType=DiscriminatorType.STRING)//,length=2) 
public abstract class Operation implements Serializable 
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long numOperation; 
	private Date dateOperation; 
	private double montant; 
	
	@ManyToOne 
	@JoinColumn(name="numCompte") 
	private Compte compte; 
	
	@ManyToOne 
	@JoinColumn(name="numEmploye") 
	private Employe employe; 
	
	// Getters et Setters 
	public Operation() {
		super();
	}
        public Operation(Date d, double m) {
            dateOperation = d; 
            montant = m;
	}

	// Constructeur sans param et avec params 
	public Long getNumOperation() {
		return numOperation;
	}

	public void setNumOperation(Long numOperation) {
		this.numOperation = numOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	
} 
