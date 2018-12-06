package metier.entities;

import java.io.Serializable; 
import java.util.Collection; 
import java.util.List;
import javax.persistence.*; 

@Entity 
public class Employe implements Serializable
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	//@Column(name="NUM_EMP")
	private Long numEmploye; 
	private String nomEmploye; 
	private  double salaire; 
	
	@ManyToOne 
	@JoinColumn(name="EMP_SUP") 
	private Employe supHierarchique; 
	
	@ManyToMany 
	@JoinTable(	name="EMPLOYES_GROUPES",
				joinColumns = @JoinColumn(name = "numEmploye"), 
				inverseJoinColumns = @JoinColumn(name = "numGroupe")) 
	private List<Groupe> groupes; 

	// Constructeur sans param et avec params 
	public Employe() {
		super();
	}
	public Employe(String nom, double salaire) {
		nomEmploye = nom;
		this.salaire = salaire;
	}
        
	// Getters et Setters 
	public Long getNumEmploye() {
		return numEmploye;
	}
	public void setNumEmploye(Long numEmploye) {
		this.numEmploye = numEmploye;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public Employe getSupHierarchique() {
		return supHierarchique;
	}
	public void setSupHierarchique(Employe supHierarchique) {
		this.supHierarchique = supHierarchique;
	}
	public List<Groupe> getGroupes() {
		return groupes;
	}
	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}
		
}
