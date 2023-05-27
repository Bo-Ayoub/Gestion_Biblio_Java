import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Livre {
	static private int cpt;
	private int id;
	private String titre;
	private String isbn;
	private String description;
	private Date dateParution;
	private int nombrePage;
	private float prix;
	private List<Auteur>listeAuteur;
	private List<Livre>livres;
	public void modifierLivre() {
		try {
			 Scanner scanner = new Scanner(System.in);

			    System.out.print("entrer le titre de livre:");
			    String stringTitre = scanner.nextLine();
			    Livre livreTrouver = null;
			    scanner.nextLine();

			    // Search for the book by title
			    for (Livre livre : livres) {
			        if (livre.getTitre().equalsIgnoreCase(stringTitre)) {
			            livreTrouver = livre;
			            break;
			        }
			    }

			    if (livreTrouver != null) {
			        System.out.println("livre trouvee: " + livreTrouver.getTitre());
			        System.out.println("selectionner une option pour modifier:");
			        System.out.println("1. maj titre");
			        System.out.println("2. maj ISBN");
			        System.out.println("3. maj description");
			        System.out.println("4. maj date de publication");
			        System.out.println("5. maj nombres de pages");
			        System.out.println("6. maj prix");
			        System.out.println("0. quitter");

			        int choice = scanner.nextInt();
			        scanner.nextLine(); 

			        switch (choice) {
			            case 1:
			                System.out.print("enter nouveau titre: ");
			                String newTitle = scanner.nextLine();
			                livreTrouver.setTitre(newTitle);
			                System.out.println("titre est modifie.");
			                break;
			            case 2:
			                System.out.print("enter nouveau ISBN: ");
			                String newIsbn = scanner.nextLine();
			                livreTrouver.setIsbn(newIsbn);
			                System.out.println("ISBN est modifie.");
			                break;
			            case 3:
			                System.out.print("entrer nouveau description: ");
			                String newDescription = scanner.nextLine();
			                livreTrouver.setDescription(newDescription);
			                System.out.println("description est modifie.");
			                break;
			            case 4:
			                System.out.print("enter nouveau date de publication (yyyy-MM-dd):");
			    	        String newDatePublication = scanner.nextLine();
			    	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			    	        try {
			    	        	livreTrouver.setDateParution(dateFormat.parse(newDatePublication));
			    	        } catch (ParseException e) {
			    	        	e.getMessage();
			    	        } 
			    	        System.out.println("date de publication est modifie.");
			                break;
			            case 5:
			                System.out.print("enter nouveau nombre de pages: ");
			                int newPageCount = scanner.nextInt();
			                livreTrouver.setNombrePage(newPageCount);
			                System.out.println("nombre de pages est modifie");
			                break;
			            case 6:
			                System.out.print("entrer nouveau prix: ");
			                float newPrice = scanner.nextFloat();
			                livreTrouver.setPrix(newPrice);
			                System.out.println("prix est modifie.");
			                break;
			            case 0:
			                System.out.println("quittation de menu");
			                break;
			            default:
			                System.out.println("choix invalid");
			                break;
			        }
			    } else {
			        System.out.println("livre introuvable.");
			    }

		}catch(Exception e) {
			 System.out.println("un erreur a occur" + e.getMessage());
		}
	   
	}
    public void supprimerAuteur(Auteur auteur) {
        listeAuteur.remove(auteur);
        auteur.supprimerLivre(this);	
    }
	public void ajouterAuteur(Auteur a) {
		listeAuteur.add(a);
		a.ajouterLivre(this);
	}
	public void modifierLivre(Livre l) {
		try {
			
		}catch(Exception e) {
			 System.out.println("un erreur a occur" + e.getMessage());
		}
	}
	public void ajouterLivre() {
		try {
			cpt++;
			this.id=cpt;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("entrer le titre de livre:");
	        this.titre = scanner.nextLine();
	        scanner.nextLine();
	        
	        System.out.println("entrer l'ISBN:");
	        isbn = scanner.nextLine();
	        scanner.nextLine();

	        System.out.println("entrer la description de livre:");
	        this.description = scanner.nextLine();
	        scanner.nextLine();

	        System.out.println("entrer la data de publication:");
	        String datePublication = scanner.nextLine();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        this.dateParution = dateFormat.parse(datePublication);
	        scanner.nextLine();

	        System.out.println("entrer nombre de pages:");
	        this.nombrePage = scanner.nextInt();
	        scanner.nextLine();
	        System.out.println("entrer prix:");
	        this.prix = scanner.nextFloat();
	        scanner.nextLine();
	        livres.add(this);
		}catch(Exception e) {
			 System.out.println("un erreur a occur" + e.getMessage());
		}
	}
	public Livre() {
		listeAuteur = new ArrayList<>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateParution() {
		return dateParution;
	}
	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}
	public int getNombrePage() {
		return nombrePage;
	}
	public void setNombrePage(int nombrePage) {
		this.nombrePage = nombrePage;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", isbn=" + isbn + ", description=" + description
				+ ", dateParution=" + dateParution + ", nombrePage=" + nombrePage + ", prix=" + prix + "]";
	}

	
	
}
