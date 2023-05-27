import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	/*	String date="30-10-1999";
		Date d=null;
		Etudiant et=null;
		try {
			 d=new SimpleDateFormat("dd-MM-yyyy").parse(date);  
			  et=new Etudiant("boussaidi","ayoub","0671609136","FA167731",d,"A12");
				System.out.println(et.getAge());

		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}*/
		
	/*	int choix=menuStatus();
		switch(choix) {
			
		case 1:
			System.out.println("Etudiant");
			break;
		case 2:
			System.out.println("Admin");
			break;
		case 3:
			System.out.println("Enseignat");
			break;
		case 4:
			System.out.println("Responsable");
			break;
		}
		
		
		
		Filiere f=new Filiere();
		f.RemplirFiliere();
		f.ajouterNiveau();
		f.listTousNiveaux();*/
		
		
		
		
	}
	
	public static int menuAdmin() {
		
		System.out.println("-----------Menu-------------");
		System.out.println("Ajouter Filiere");
		//System.out.printn("")
		return 1;
	}
	public static int menuEtudiant() {
		
		return 1;
	}
	
	public static void  MenuLogin() {
		
		System.out.println("----------Menu Login ----------------");
		System.out.println("Saisir votre login");
		
	}
	
	
	public static int menuStatus() {
		
		System.out.println("----------------Status-------------");
		System.out.println("1-Vous etez Etudiant");
		System.out.println("2-Vous etes Admin");
		System.out.println("3-Vous etes Enseignant");
		System.out.println("4-Vous etes Responsable Biblio");
		
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		return choix;
	}
	
	public static int menuInventaire() {
		System.out.println("--------------Gestion Inventaire-------------");
		System.out.println("1---------------Ajouter Livre-----------------");
		System.out.println("1---------------Modifier Livre----------------");
		System.out.println("1---------------Supprimer Livre---------------");
		System.out.println("1---------------Rechercher Livre--------------");
		System.out.println("1---------------Lister Tous ------------------");
		System.out.println("1---------------Supprimer Tous ---------------");
		
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		return choix;
	}
	public static int menuModifierInventaire() {
		System.out.println("----------------menu Modifier Livre--------");
		System.out.println("1---------------Modifier Titre--------------");
		System.out.println("2---------------Modifier ISBN --------------");
		System.out.println("3---------------Modifier Description--------");
		System.out.println("4---------------Modifier Annee publication--");
		System.out.println("5---------------Modifier Nombre Page--------");
		System.out.println("6---------------Modifier Prix --------------");
		//System.out.println("7");
		
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		return choix;
		
	}
	
	public static int menuRechercherPar() {
		System.out.println("----------------Menu Rechercher-------------");
		System.out.println("1---------------Recherche par Titre--------------");
		System.out.println("2---------------Recherche par ISBN --------------");
	/*	System.out.println("3---------------Modifier Description--------");
		System.out.println("4---------------Modifier Annee publication--");
		System.out.println("5---------------Modifier Nombre Page--------");
		System.out.println("6---------------Modifier Prix --------------");
		//System.out.println("7");*/
		
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		return choix;
	}
	
	

}
