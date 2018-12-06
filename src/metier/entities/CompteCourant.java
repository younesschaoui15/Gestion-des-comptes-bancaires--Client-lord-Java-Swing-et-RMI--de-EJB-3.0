package metier.entities;

import java.util.Date;
import javax.persistence.*;

@Entity 
@DiscriminatorValue("COURANT") 
public class CompteCourant extends Compte
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double decouvert; 
	
	// Constructeur sans param et avec params 
	public CompteCourant() {
		super();
	}
	public CompteCourant(Date date, double solde, double dec)
        {
		super( date, solde);
                decouvert = dec;
	}
        
	// Getters et Setters 	
	public double getDecouvert() {
		return this.decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
   
}
