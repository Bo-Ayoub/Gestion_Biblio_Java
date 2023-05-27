import java.util.Date;
import java.util.ArrayList;


public class Auteur {

	private int id;
	private String nom;
	private Date dateNaissance;
	
	public static int cpt;
	public static ArrayList<Auteur> auteurs=new ArrayList<Auteur>();
	
	public Auteur() {
		this.id=Auteur.cpt;
		Auteur.cpt++;
	}

	
	
	public Auteur(int id, String nom, Date dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
	}
	



	public Auteur(String nom, Date dateNaissance) {
		super();
		this.nom = nom;
		this.dateNaissance = dateNaissance;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	
	
	
}
