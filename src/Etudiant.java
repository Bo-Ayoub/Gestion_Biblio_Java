import java.util.Date;

public class Etudiant extends Personne {

	private String NumEtudiant;
	private Groupe gr;
	
	
	public Etudiant() {
		super();
	}
	public Etudiant(String Nom,String Prenom,String NumeroTelephone,String CIN,Date DateNaissance,String NumEtudiant) {
		
		super(Nom,Prenom,NumeroTelephone,CIN,DateNaissance);
		this.NumEtudiant=NumEtudiant;
	}
	
	public String getNumEtudiant() {
		return this.NumEtudiant;
	}
	public void setNumEtudiant(String NumEtudiant) {
		this.NumEtudiant=NumEtudiant;
	}
	public Groupe getGr() {
		return gr;
	}
	public void setGr(Groupe gr) {
		this.gr = gr;
	}
	
	
}
