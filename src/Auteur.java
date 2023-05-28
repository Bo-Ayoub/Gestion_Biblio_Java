import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Auteur {

	private int id;
	private String nom;
	private Date dateNaissance;
	
	public static int cpt;
	public static ArrayList<Auteur> auteurs=new ArrayList<Auteur>();
	 private ArrayList<Livre> livres=new ArrayList<Livre>();
	
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
	
	
	public void AjouterLivre(Livre v) {
		this.livres.add(v);
	}
	public void supprimerLivre(Livre v) {
		this.livres.remove(v);
	}
	public void ModifierLivre() {
		
	}
	public void listTousLIvre() {
		for(Livre v : this.livres) {
			System.out.println(v);
		}
	}
	
	
	
	
	public void ajouterAuteur() throws ParseException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Saisir le nom de l'auteur");
		this.nom=sc.nextLine();
		sc.nextLine();
		
		System.out.println("Saisir la date Naissance : DD-MM-YYYY");
		String dateString=sc.nextLine();
		Date date=new  SimpleDateFormat("dd-MM-yyyy").parse(dateString);
		this.dateNaissance=date;
		
		Auteur.auteurs.add(this);
		
	}
	public void supprimerAuteur() {
		//faire rechercher
	}
	public void rechercherAuteur() {
		
	}
	
	
	
}
