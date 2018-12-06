package metier.session;

import javax.ejb.Remote;
import java.util.List;

import metier.entities.*;

@Remote
public interface eBanqueEjbSessionRemote 
{	
    /* AUTHENTIFICATION */
    public Employe consulterAuthentification(String log, String passe);
    
    /* CLIENT */
    public void addClient(Client c); 
    public List<Client> consulterClientsParNom(String mc); 
    public Client consulterClient(Long codeClient);
    public List<Client> consulterClients();
    public void supprimerClient(Long codeClient);

    /* EMPLOYE */
    public void addEmploye(Employe e,Long numEmpSup); 
    public void addEmployeToGroupe(Long idGroupe,Long idEmp); 
    public List<Employe> consulterEmployes(); 
    public Employe consulterEmploye(Long idEmp); 
    public List<Employe> consulterEmployesParGroupe(Long idG); 
    public List<Employe> consulterEmployesArbre(Long numEmploye);

    /* COMPTE */
    public void addCompte(Compte c,Long numCli,Long numEmp ); 
    public Compte consulterCompte(String numCpte); 
    public List<Compte> consulterComptes(); 
    public List<Compte> consulterComptes(Long codeClient);
    public List<Compte> consulterComptesParEmpolye(Long numEmp);

    /* OPERATION */
    public void addOperation(Operation op,String numCpte,Long numEmp); 
    public List<Operation> consulterOperations(); 
    public List<Operation> consulterOperationsParEmploye(Long idEmp); 
    public List<Operation> consulterOperationsParCompte(String numCmp);

    /* GROUPE */
    public void addGroupe(Groupe g); 
    public List<Groupe> consulterGroupes();
    public List<Groupe> consulterGroupesParEmpolye(Long numEmp);
}
