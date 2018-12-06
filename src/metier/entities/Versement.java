package metier.entities;
 
import java.util.Date;
import javax.persistence.*; 

@Entity 
@DiscriminatorValue("V") 
public class Versement extends Operation
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Constructeur sans param et avec params 
	public Versement() {
            super();
	}
        public Versement(Date d, double m) {
            super(d, m);
        }
}
