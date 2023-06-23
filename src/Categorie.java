import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Categorie {
	
	private int Id;
	private String libelle;
	public static int cpt;
	public static ArrayList<Categorie> categories=new ArrayList<Categorie>(); // 
	private ArrayList<Livre> livres=new ArrayList<Livre>();
	
	public Categorie() {
		cpt++;
		this.Id=cpt;
	}
	
	
	public Categorie(int id, String libelle) {
	
		this.Id = id;
		this.libelle = libelle;
	}
	public Categorie( String libelle) {
		super();
		this.libelle = libelle;
	}
	
	

	
	public ArrayList<Livre> getLivres() {
		return livres;
	}


	public void setLivres(ArrayList<Livre> livres) {
		this.livres = livres;
	}


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Categorie [Id=" + Id + ", libelle=" + libelle + "]";
	}


	public static  void ajouterCategorie() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Saisir la Categorie");
		String cat=sc.nextLine();
		Categorie.categories.add(new Categorie(cat));
		
	}
	
	public void supprimerCategorie() {
		
			
	}
	
	public void  modifierCategorie() {
		
	}
	
	public Categorie rechercherCategorie() {
		
		return null;
	}
	
	public static void afficherTousCategories() {
		for(int i=0;i<Categorie.categories.size();i++) {
			System.out.println(Categorie.categories.get(i));
		}
	}
	

	
	
}
