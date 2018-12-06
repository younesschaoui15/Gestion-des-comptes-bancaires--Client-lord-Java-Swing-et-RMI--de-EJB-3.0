package metier.entities;

import java.io.Serializable; 
import java.util.Collection; 
import java.util.List;

import javax.persistence.*; 

@Entity 
public class Groupe implements Serializable 
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	//@Column(name = "NUM_GROUPE")
	private Long numGroupe; 
	private String nomGroupe; 
	
	@ManyToMany(mappedBy="groupes") 
	private List<Employe> employes;
	
	// Constructeur sans param et avec params 
	public Groupe() {
            super();
	}
        public Groupe(String n) {
            nomGroupe = n;
	}
	
	// Getters et Setters 
	public Long getNumGroupe() {
		return numGroupe;
	}
	public void setNumGroupe(Long numGroupe) {
		this.numGroupe = numGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	} 
		
}
