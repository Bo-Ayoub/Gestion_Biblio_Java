import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Auteur {
	static private int cpt;
	private int id;
	private String nom;
	private Date dateNaissance;
	private List<Auteur> auteurs;
	private List<Livre> livreAuteur;
	public void ajouterLivre(Livre v) {
		 livreAuteur.add(v);
		 v.ajouterAuteur(this);
	}
	 public void supprimerLivre(Livre livre) {
	        livreAuteur.remove(livre);
	        livre.supprimerAuteur(this);
	    }
	 public void modifierAuteur() {
		 try {
			 Scanner scanner = new Scanner(System.in);

			    System.out.print("entrer le nom d'auteur:");
			    String stringNom = scanner.nextLine();
			    Auteur auteurTrouver = null;
			    scanner.nextLine();

			    // Search for the book by title
			    for (Auteur auteur : auteurs) {
			        if (auteur.getNom().equalsIgnoreCase(stringNom)) {
			        	auteurTrouver = auteur;
			            break;
			        }
			    }

			    if (auteurTrouver != null) {
			        System.out.println("auteur trouvee: " + auteurTrouver.getNom());
			        System.out.println("selectionner une option pour modifier:");
			        System.out.println("1. maj nom");
			        System.out.println("2. maj date de naissance");
			        System.out.println("0. quitter");

			        int choice = scanner.nextInt();
			        scanner.nextLine(); 

			        switch (choice) {
			            case 1:
			                System.out.print("enter nouveau nom: ");
			                String newTitle = scanner.nextLine();
			                auteurTrouver.setNom(newTitle);
			                System.out.println("nom est modifie.");
			                break;
			            case 2:
			                System.out.print("enter nouveau date de naissance (yyyy-MM-dd): ");
			                String newDateNaissance = scanner.nextLine();
			                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			                try {
			                	auteurTrouver.setDateNaissance(dateFormat.parse(newDateNaissance));
			                }catch(Exception e) {
			                	e.getMessage();
			                }
			                System.out.println("date de naissance est modifie.");
			                break;
			           
			            case 0:
			                System.out.println("quittation de menu");
			                break;
			            default:
			                System.out.println("choix invalid");
			                break;
			        }
			    } else {
			        System.out.println("auteur introuvable");
			    }

		}catch(Exception e) {
			 System.out.println("un erreur a occur" + e.getMessage());
		}
	 }
	 public void ajouterAuteur() {
		    try {
		        cpt++;
		        this.id = cpt;
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("entrer nom auteur:");
		        this.nom = scanner.nextLine();
		        
		        System.out.println("enter date naissance (yyyy-MM-dd):");
		        String dateNaissance = scanner.nextLine();
		        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		        this.dateNaissance = dateFormat.parse(dateNaissance);
		        
		        auteurs.add(this);
		        
		    } catch (Exception e) {
		        System.out.println("erreur a occure : " + e.getMessage());
		    }
			
	 }
	@Override
	public String toString() {
		return "Auteur [id=" + id + ", nom=" + nom + ", dateNaissance=" + dateNaissance + "]";
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
	public Auteur(int id, String nom, Date dateNaissance) {
		this.id = id;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		livreAuteur = new ArrayList<Livre>();
	}
	
}
