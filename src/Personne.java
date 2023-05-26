import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public abstract class Personne {

	
	// attributs
	private int ID;
	private String Nom;
	private String Prenom;
	private String NumeroTelphone;
	private String CIN;
	private Date DateNaissance;
	public static int cpt;
	
	//constructuers
	
	public Personne() {
		Personne.cpt++;
		this.ID=Personne.cpt;
		
	}
	public Personne(String Nom,String Prenom,String NumeroTelephone,String CIN,Date DateNaissance) {
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.NumeroTelphone=NumeroTelephone;
		this.CIN=CIN;
		this.DateNaissance=DateNaissance;
	}
	public Personne(int id,String Nom,String Prenom,String NumeroTelephone,String CIN,Date DateNaissance) {
		this.ID=id;
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.NumeroTelphone=NumeroTelephone;
		this.CIN=CIN;
		this.DateNaissance=DateNaissance;
	}
	
	
	// les getteurs et les setteurs
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getNumeroTelphone() {
		return NumeroTelphone;
	}
	public void setNumeroTelphone(String numeroTelphone) {
		NumeroTelphone = numeroTelphone;
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public Date getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}
	
	// les methodes
	
	public int getAge() {
		LocalDate curDate = LocalDate.now();  
		LocalDate date = LocalDate.ofInstant(this.DateNaissance.toInstant(), ZoneId.systemDefault());
		return Period.between(date,curDate).getYears();
	}
	
	@Override
	public String toString() {
		return this.Nom+" "+this.Prenom+" "+this.NumeroTelphone+" "+this.CIN+" "+this.getAge();
	}
	
	
}
