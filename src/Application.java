import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import com.google.common.collect.Lists;

public class Application {
	
	static int id;
	static String login;

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
		
/*		int choix=MenuLogin();
		switch(choix) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
			System.out.println("Au revoir");
			System.exit(1);
			break;
		}
		
		 choix =menuGestionResponsableBiblio();
		switch(choix) {
		case 11:
			System.out.println("Au revoir");
			System.exit(1);
			break;
		}*/
		
	/*	try {
			System.out.println(Application.hashWithMd5("ayoub"));
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//menuStatusProc();
		 Application.MenuLoginProc();*/
		
		ArrayList<String> message=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++) {
			System.out.println("saisir message "+(i+1) );
			message.add(sc.nextLine());
			sc.nextLine();
		}
		try {
			List<Object> myList=Application.AfficherMessage(message,2, 2, 1, 1);
			for(int i=0;i<myList.size();i++) {
				System.out.println(myList.get(i));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
	
	public static int  MenuLogin() {
		
		System.out.println("----------Menu Login ----------------");
		System.out.println("1----Saisir login et mot de passe-----");
		System.out.println("2--------Quitter-----");
		
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		return choix;
		
	}
	public static void MenuLoginProc() {
		int choix=MenuLogin();
		switch(choix) {
		case 1:
			break;
		
		case 2:
			Application.quitterApp();
			break;
		}
	}
	
	
	public static int menuStatus() {
		
		System.out.println("----------------Status-------------");
		System.out.println("1-------Vous etez Etudiant---------");
		System.out.println("2-------Vous etes Admin------------");
		System.out.println("3------Vous etes Enseignant--------");
		System.out.println("4------Vous etes Responsable Biblio");
		
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		return choix;
	}
	public static void menuStatusProc() {
		int choix=menuStatus();
		if(choix==1) {
			menuGestionResponsableBiblioProc();
		}
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
		System.out.println("----------------Menu Rechercher------------------");
		System.out.println("1---------------Recherche par Titre--------------");
		System.out.println("2---------------Recherche par ISBN --------------");
		System.out.println("3---------------Recherche par Annee publication----");
		System.out.println("4---------------Recherche par nom Auteur-----------");
		System.out.println("5---------------Rechercher par Categorie-----------");
		System.out.println("6---------------Recherche par langue  --------------");
		//System.out.println("7");*/
		
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		return choix;
	}
	
	
	public static int menuGestionResponsableBiblio() {
		
		System.out.println("------------Gestion Responsable biblio-------------");
		System.out.println("---------------------------------------------------");
		System.out.println("1-------------Ajouter un nouveau Responsable--------");
		System.out.println("2-------------Supprimer un Responsable--------------");
		System.out.println("3------------Modifier un Responsable----------------");
		System.out.println("4------------Afficher un Responsable----------------");
		System.out.println("5------------Bloquer un responsable ----------------");
		System.out.println("6------------Bloquer tous les responsables----------");
		System.out.println("7------------Afficher tous les responsables---------");
		System.out.println("8------------Supprimer tous les responsables -------");
		System.out.println("9------------Revenir au menu principal -------------");
		System.out.println("10------------Se deconnecter-------------------------");
		System.out.println("11------------Quitter l'application ------------------");
		System.out.println("----------------------------------------------------");
	
		System.out.println("------------Saisir votre choix ----------------------");
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		return choix;
		
	}
	
	public static void menuGestionResponsableBiblioProc() {
		int choix=menuGestionResponsableBiblio();
		switch(choix) {
		case 1:
			
			break;
		case 2:
			break;
		case 9:
			menuStatusProc();
			break;
		case 11:
			Application.quitterApp();
			break;
		}
	}
	
	public static void quitterApp() {
		System.out.println("Au revoir ");
		System.exit(1);
	}
	public static String hashWithMd5(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		// this function is as the same as php 
		// don't ask me how, copy and paste from indian guy
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(input.getBytes("UTF-8"));
		BigInteger hash = new BigInteger(1, md.digest());
		String result = hash.toString(16);
		if ((result.length() % 2) != 0) {
		  result = "0" + result;
		}
		return result;
	}
	
	public static List<Object> AfficherMessage(ArrayList<String> messages,int nbrString,int nbrInt,int nbrFloat,int NbrDate) throws ParseException {

				List<Object> myList = Lists.newArrayList();
				Scanner sc=new Scanner(System.in);
				for(int i=0;i<messages.size();i++) {
					System.out.println(messages.get(i));
					if(i<nbrString) {
						String str=sc.nextLine();
						myList.add(str);
					}
					if(i>=nbrString && i<nbrString+nbrInt) {
						int number=sc.nextInt();
						myList.add(number);
					}
					if(i>=nbrString+nbrInt && i<nbrString+nbrInt+nbrFloat) {
						
						float fl=sc.nextFloat();
						myList.add(fl);
					}
					if(i>=nbrString+nbrInt+nbrFloat && i<nbrString+nbrInt+nbrFloat+NbrDate) {
						String dateString=sc.nextLine();
						 Date date=new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
						 myList.add(date);
						
					}
					sc.nextLine();
				}
			
				/*myList.add("String");
				myList.add(123);
				myList.add(true);
				
				// Retrieving elements without casting
				String str = (String) myList.get(0);
				int num = (int) myList.get(1);
				boolean bool = (boolean) myList.get(2);*/
				return myList;
		}
	
	
	
	

}
