import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Livre {

	private int ID;
	private String Titre;
	private String ISBN;
	private String Description;
	private Date DateParution;
	private int NombrePage;
	private float Prix;
	public static int cpt;
	public static ArrayList<Livre> livres=new ArrayList<Livre>();
	private  ArrayList<Auteur> auteurs =new ArrayList<Auteur>();
	private ArrayList<Categorie> Categorie=new ArrayList<Categorie>();
	private ArrayList<Langue> languesTraduites=new ArrayList<Langue>();
	
	private Langue langueOriginaire;
	private Rayon rayon;
	
	
	public Livre() {
		this.ID=Livre.cpt;
		Livre.cpt++;
	}
	

	public Livre(int iD, String titre, String iSBN, String description, Date dateParution, int nombrePage, float prix) {
		super();
		ID = iD;
		Titre = titre;
		ISBN = iSBN;
		Description = description;
		DateParution = dateParution;
		NombrePage = nombrePage;
		Prix = prix;
	}


	
	public Livre(String titre, String iSBN, String description, Date dateParution, int nombrePage, float prix) {
		super();
		Titre = titre;
		ISBN = iSBN;
		Description = description;
		DateParution = dateParution;
		NombrePage = nombrePage;
		Prix = prix;
	}
	


	@Override
	public String toString() {
		return "Livre [ID=" + ID + ", Titre=" + Titre + ", ISBN=" + ISBN + ", Description=" + Description
				+ ", DateParution=" + DateParution + ", NombrePage=" + NombrePage + ", Prix=" + Prix + "]";
	}


	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getDateParution() {
		return DateParution;
	}

	public void setDateParution(Date dateParution) {
		DateParution = dateParution;
	}

	public int getNombrePage() {
		return NombrePage;
	}

	public void setNombrePage(int nombrePage) {
		NombrePage = nombrePage;
	}

	public float getPrix() {
		return Prix;
	}

	public void setPrix(float prix) {
		Prix = prix;
	}
	
	
	
	
	
	public ArrayList<Auteur> getAuteurs() {
		return auteurs;
	}


	public void setAuteurs(ArrayList<Auteur> auteurs) {
		this.auteurs = auteurs;
	}


	public ArrayList<Categorie> getCategorie() {
		return Categorie;
	}


	public void setCategorie(ArrayList<Categorie> categorie) {
		Categorie = categorie;
	}


	public ArrayList<Langue> getLanguesTraduites() {
		return languesTraduites;
	}


	public void setLanguesTraduites(ArrayList<Langue> languesTraduites) {
		this.languesTraduites = languesTraduites;
	}


	public Langue getLangueOriginaire() {
		return langueOriginaire;
	}


	public void setLangueOriginaire(Langue langueOriginaire) {
		this.langueOriginaire = langueOriginaire;
	}


	public Rayon getRayon() {
		return rayon;
	}


	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}


	
	
	public void ajouterLivre() throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Saisir Titre");
		this.Titre=sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Saisir ISBN");
		this.ISBN=sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Saisir Description");
		this.Description=sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Saisir Date Parution : DD--MM--YYYY");
		String dateString=sc.nextLine();
		
		Date date=new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
		this.DateParution=date;
		
		sc.nextLine();
		
		System.out.println("Saisir Nombre Page");
		this.NombrePage=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Saisir Prix ");
		this.Prix=sc.nextFloat();
		
		sc.nextLine();
		
		Livre.livres.add(this);
	}
	
	
	
	
}
