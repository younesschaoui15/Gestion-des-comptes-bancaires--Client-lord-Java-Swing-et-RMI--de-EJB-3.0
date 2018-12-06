package metier.entities;

import java.util.Date;
import javax.persistence.*; 

@Entity 
@DiscriminatorValue("EPARGNE") 
public class CompteEpargne extends Compte 
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double taux; 

	// Constructeur sans param et avec params
	public CompteEpargne() {
		super();
	}  
        public CompteEpargne(Date date, double solde, double tau)
        {
		super(date, solde);
                taux = tau;
	}
	
	// Getters et Setters 
	public double getTaux() {
		return this.taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
   
}
