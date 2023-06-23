import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import com.google.common.collect.Lists;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;



import java.sql.Statement;
import java.sql.Timestamp;


public class Application {
	
	static int id;;
	static String Email;

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
		
		/*ArrayList<String> message=new ArrayList<String>();
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
		}*/
		
	//	Application.menuCategorieProc();
		boolean isAuthenticated = false;

		do {
		    try {
		        MenuLoginProc();
		        isAuthenticated = true;  // Set isAuthenticated to true if login is successful
		    } catch (AuthentificationException ex) {
		        System.out.println(ex.getMessage());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		} while (!isAuthenticated);
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
		
		System.out.println("╔════════════════════════════════════╗");
		System.out.println("║           Menu Login               ║");
		System.out.println("╠════════════════════════════════════╣");
		System.out.println("║ 1. Saisir login et mot de passe    ║");
		System.out.println("║ 2. Quitter                         ║");
		System.out.println("╚════════════════════════════════════╝");

		
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		return choix;
		
	}
	public static void MenuLoginProc() throws NoSuchAlgorithmException, UnsupportedEncodingException, ClassNotFoundException, SQLException, AuthentificationException {
		int choix=MenuLogin();
		switch(choix) {
		case 1:
			if(VerfierLogin()) {
				System.out.println("Bienvenue");
				menuReserverLivreProc();
			}
			else {
				throw new AuthentificationException("email ou mot de passe est faux");
				//System.out.println("email ou mot de passe est faux");
			}
			break;
		
		case 2:
			Application.quitterApp();
			break;
		}
	}
	public static int  menuReserverLivre() {
		
		System.out.println("╔═══════════════════════════════════════════════╗");
		System.out.println("║                 Menu Reservation               ║");
		System.out.println("╠═══════════════════════════════════════════════╣");
		System.out.println("║ 1. Consulter tous les réservations             ║");
		System.out.println("║ 2. Consulter tous les livres favoris           ║");
		System.out.println("║ 3. Afficher tous les livres empruntés          ║");
		System.out.println("║ 4. Ajouter une réservation                     ║");
		System.out.println("║ 5. Annuler une réservation                     ║");
		System.out.println("║ 6. Ajouter un favori                           ║");
		System.out.println("║ 7. Supprimer un favori                         ║");
		System.out.println("║ 8. Se déconnecter                              ║");
		System.out.println("║ 9. Quitter l'application                       ║");
		System.out.println("║ 10.Afficher tous les livres                    ║");
		System.out.println("║ 11.Sauvegarder les livres dan sun fichier text ║");
		System.out.println("╚═══════════════════════════════════════════════╝");

		
		System.out.println("Saisir votre choix");
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		return choix;
		
	}
	public static void menuReserverLivreProc() throws ClassNotFoundException, SQLException, NoSuchAlgorithmException, UnsupportedEncodingException {
		int choix=menuReserverLivre();
		switch(choix) {
		case 1:
			System.out.println(Application.id);
			afficherTousReservation();
			menuReserverLivreProc();
			break;
		case 2:
			afficherTousFavorie();
			menuReserverLivreProc();
			break;
		case 3:
			afficherTousEmprunte();
			menuReserverLivreProc();
			break;
		case 4:
			System.out.println("saisir id du livre");
			Scanner sc2=new Scanner(System.in);
			ajouteReservation(sc2.nextInt());
			menuReserverLivreProc();
			break;
			
		case 5:
			System.out.println("saisir id de la reservation");
			Scanner sc=new Scanner(System.in);
			annullerReservation(sc.nextInt());
			menuReserverLivreProc();
			break;
			
		case 6:
			System.out.println("saisir id du livre");
			Scanner sc1=new Scanner(System.in);
			ajouterFavorie(sc1.nextInt());
			menuReserverLivreProc();
			break;
		case 7:
			System.out.println("saisir id du livre");
			Scanner sc3=new Scanner(System.in);
			supprimerFavorie(sc3.nextInt());
			menuReserverLivreProc();
			break;
		case 8:
			try {
				seDeconnecter();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (AuthentificationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case 9:
			quitterApp();

			break;
		case 10 :
			afficherTouslivre();
			menuReserverLivreProc();
			break;
	default:
		System.out.println("Erreur de frappe");
			break;
		}
	}
	
	public static boolean   VerfierLogin() throws NoSuchAlgorithmException, UnsupportedEncodingException, SQLException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Saisir votre Email");
		String Email=sc.nextLine();
		sc.nextLine();
		
		System.out.println("Saisir votre mot de passe");
		String passoword=sc.nextLine();
		sc.nextLine();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");
		
		PreparedStatement stm=(PreparedStatement) conn.prepareStatement("select * from personne where EMAIL=? and PASSWORD=?");
		stm.setString(1,Email);
		stm.setString(2,hashWithMd5(passoword));
		//Statement stm=conn.createStatement();
		ResultSet res=stm.executeQuery();
		
		if(!res.next()) {
			
			return false;
		}
			
			Application.id=res.getInt("ID_PERSONNE");
			Application.Email=res.getString("EMAIL");
			return true;
		
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
	public static void menuRechercherParProc() {
		
		
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
	
		public static int menuCategorie() {
			
			System.out.println("------------------Gestion Categorie----------------");
			System.out.println("---------------------------------------------------");
			System.out.println("1-------------Ajouter une nouvelle Categorie--------");
			System.out.println("2-------------Supprimer une Categorie---------------");
			System.out.println("3------------Modifier une Categorie-----------------");
			System.out.println("4------------Afficher une Categorie-----------------");
			System.out.println("5------------Afficher tous les Categories----------");
			System.out.println("6------------Supprimer tous les Categories ---------");
			System.out.println("7------------Revenir au menu principal -------------");
			System.out.println("8------------Se deconnecter-------------------------");
			System.out.println("9------------Quitter l'application ------------------");
			System.out.println("----------------------------------------------------");
		
			System.out.println("------------Saisir votre choix ----------------------");
			Scanner sc=new Scanner(System.in);
			int choix=sc.nextInt();
			return choix;
		}
		
		public static  void menuCategorieProc() {
			int choix=Application.menuCategorie();
			
			if(choix>0 && choix<10) {
				switch(choix) {
				
				case 1:
					Categorie.ajouterCategorie();
					Application.menuCategorieProc();
					break;
				case 9:
					Application.quitterApp();
					break;
				case 5:
					Categorie.afficherTousCategories();
					Application.menuCategorieProc();
					break;
				}
			}
			
		}
		
		
		// Reservation bloc
		
		public static void ajouteReservation(int idLivre) throws ClassNotFoundException, SQLException {
			
			// get id and login from application 
			if(! Application.verifierUserReservation()) {
				// Get the current date and time
				LocalDateTime currentDateTime = LocalDateTime.now();

				// Convert LocalDateTime to java.sql.Timestamp
				Timestamp timestamp = Timestamp.valueOf(currentDateTime);
				// ajouter reservation 
				Class.forName("com.mysql.jdbc.Driver");
				Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");
				
				PreparedStatement stm=(PreparedStatement) conn.prepareStatement("insert into reserverlivre  values(null,?,?,?,'','pending');");
				stm.setInt(1,Application.id);
				stm.setInt(2,idLivre);
				stm.setTimestamp(3,timestamp);
				
				
				//Statement stm=conn.createStatement();
				stm.executeUpdate();
				
				return ;
			}
			
			System.out.println(" Vous avez deja une reservation ");
			
			
		}
		public static  void annullerReservation(int idReservation) throws SQLException, ClassNotFoundException {
			
			// annuller reservation = archiver la reservation 
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");
			
			PreparedStatement stm=(PreparedStatement) conn.prepareStatement("update   reserverlivre set archive =1,Etat='canceled' where ID_RESERVATION=?");
			stm.setInt(1,idReservation);
			stm.executeUpdate();
			
			System.out.println(" la reservation est annuller");
			
			
			
			
		}
		
		public static boolean  verifierUserReservation() throws SQLException, ClassNotFoundException {
			
			// verifie s'il ya une  reservation en cours 
			Class.forName("com.mysql.jdbc.Driver");
			Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");
			
			PreparedStatement stm=(PreparedStatement) conn.prepareStatement("SELECT * FROM reserverlivre where ID_PERSONNE =? and archive =0 and  ETAT='pending'");
			stm.setInt(1,Application.id);
			//Statement stm=conn.createStatement();
			ResultSet res=stm.executeQuery();
			
			if(!res.next()) {
				
				return false;
			}
			
				return true;
			
			
			
			
			//Personne p;
			/*while(res.next()) {
				p=new Personne(Integer.valueOf(res.getString("ID")),res.getString("Nom"),res.getString("Prenom"),Integer.valueOf(res.getString("age")));
				personnes.add(p);
			}
			conn.close();
			stm.close();
			
			
			return personnes; */
			
			
		//	return true;
			
			
		}
		
		public static  void afficherTousReservation() throws ClassNotFoundException, SQLException {
			
			
			/*Class.forName("com.mysql.jdbc.Driver");
			Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");
			
			PreparedStatement stm=(PreparedStatement) conn.prepareStatement("SELECT r.ID_RESERVATION, c.LIBELLE_CATEGORIE,l.TITRE,r.DATERESERVATION,r.ETAT FROM categorie c inner join livre l on c.ID_CATEGORIE=l.ID_CATEGORIE inner join reserverlivre r on l.ID_LIVRE=r.ID_LIVRE WHERE R.ID_PERSONNE = ? \r\n"
					+ "ORDER BY r.DATERESERVATION DESC");
			stm.setInt(1,Application.id);
			//Statement stm=conn.createStatement();
			ResultSet res=stm.executeQuery();
			if(res!=null) {
				System.out.println("idReservation \t \t   Categorie \t \t  Titre \t \t  Date Reservation \t \t Etat ");
			}
			
			while(res.next()) {
					System.out.println("--------------------------------------------------------------------------------------------------------------");
					System.out.println(res.getString("ID_RESERVATION")+"\t\t\t"+ res.getString("LIBELLE_CATEGORIE")+"\t\t"+res.getString("TITRE")+"\t\t"+res.getString("DATERESERVATION")+"\t\t"+res.getString("ETAT"));
			}*/
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");

			PreparedStatement stm = (PreparedStatement) conn.prepareStatement("SELECT r.ID_RESERVATION, c.LIBELLE_CATEGORIE, l.TITRE, r.DATERESERVATION, r.ETAT FROM categorie c INNER JOIN livre l ON c.ID_CATEGORIE=l.ID_CATEGORIE INNER JOIN reserverlivre r ON l.ID_LIVRE=r.ID_LIVRE WHERE R.ID_PERSONNE = ? ORDER BY r.DATERESERVATION DESC");
			stm.setInt(1, Application.id);

			ResultSet res = stm.executeQuery();
			if (res != null) {
			    System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			    System.out.format("| %-14s | %-25s | %-50s | %-20s | %-10s |\n", "ID Reservation", "Categorie", "Titre", "Date Reservation", "Etat");
			    System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			}

			while (res.next()) {
			    System.out.format("| %-14s | %-25s | %-50s | %-20s | %-10s |\n", res.getString("ID_RESERVATION"), res.getString("LIBELLE_CATEGORIE"), res.getString("TITRE"), res.getString("DATERESERVATION"), res.getString("ETAT"));
			}

			if (res != null) {
			    System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			}

			
				
			
		}
		
		
		public static void afficherTousEmprunte() throws ClassNotFoundException, SQLException {
			
			
		/*	Class.forName("com.mysql.jdbc.Driver");
			Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");
			
			PreparedStatement stm=(PreparedStatement) conn.prepareStatement("SELECT emp.ID_EMPRUNTE, c.LIBELLE_CATEGORIE,l.TITRE,emp.DATEEMPRUNTE FROM categorie c inner join livre l on c.ID_CATEGORIE=l.ID_CATEGORIE inner join reserverlivre r on l.ID_LIVRE=r.ID_LIVRE \r\n"
					+ "inner join empruntlivre emp on emp.ID_RESERVATION=r.ID_RESERVATION   WHERE R.ID_PERSONNE = ? order by emp.DATEEMPRUNTE  desc ");
			stm.setInt(1,Application.id);
			//Statement stm=conn.createStatement();
			ResultSet res=stm.executeQuery();
			if(res!=null) {
				System.out.println("id Emprunte \t \t   Categorie \t \t  Titre \t \t  Date Emprunte ");
			}
			
			while(res.next()) {
					System.out.println("--------------------------------------------------------------------------------------------------------------");
					System.out.println(res.getString("ID_EMPRUNTE")+"\t\t\t"+ res.getString("LIBELLE_CATEGORIE")+"\t\t"+res.getString("TITRE")+"\t\t"+res.getString("DATEEMPRUNTE"));
			}*/
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");

			PreparedStatement stm = (PreparedStatement) conn.prepareStatement("SELECT emp.ID_EMPRUNTE, c.LIBELLE_CATEGORIE, l.TITRE, emp.DATEEMPRUNTE FROM categorie c INNER JOIN livre l ON c.ID_CATEGORIE=l.ID_CATEGORIE INNER JOIN reserverlivre r ON l.ID_LIVRE=r.ID_LIVRE INNER JOIN empruntlivre emp ON emp.ID_RESERVATION=r.ID_RESERVATION WHERE R.ID_PERSONNE = ? ORDER BY emp.DATEEMPRUNTE DESC");
			stm.setInt(1, Application.id);

			ResultSet res = stm.executeQuery();
			if (res != null) {
			    System.out.println("-----------------------------------------------------------------------------------------------------------------");
			    System.out.format("| %-12s | %-25s | %-50s | %-15s |\n", "ID Emprunte", "Categorie", "Titre", "Date Emprunte");
			    System.out.println("-----------------------------------------------------------------------------------------------------------------");
			}

			while (res.next()) {
			    System.out.format("| %-12s | %-25s | %-50s | %-15s |\n", res.getString("ID_EMPRUNTE"), res.getString("LIBELLE_CATEGORIE"), res.getString("TITRE"), res.getString("DATEEMPRUNTE"));
			}

			if (res != null) {
			    System.out.println("-----------------------------------------------------------------------------------------------------------------");
			}

			
			
		}
		
		public static void afficherTousFavorie() throws ClassNotFoundException, SQLException {
			
			
			
		/*	Class.forName("com.mysql.jdbc.Driver");
			Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");
			
			PreparedStatement stm=(PreparedStatement) conn.prepareStatement("select f.ID_LIVRE,l.Titre,c.LIBELLE_CATEGORIE,l.ANNEEPUBLICATION from favorie f inner join livre l on l.ID_LIVRE=f.ID_LIVRE inner join categorie c on c.ID_CATEGORIE=l.ID_CATEGORIE where ID_PERSONNE=?");
			stm.setInt(1,Application.id);
			//Statement stm=conn.createStatement();
			ResultSet res=stm.executeQuery();
			if(res!=null) {
				System.out.println("id livre \t \t   Titre \t \t  Categorie \t \t  Date publication ");
			}
			
			while(res.next()) {
					System.out.println("--------------------------------------------------------------------------------------------------------------");
					System.out.println(res.getString("ID_LIVRE")+"\t\t\t"+ res.getString("Titre")+"\t\t"+res.getString("LIBELLE_CATEGORIE")+"\t\t"+res.getString("ANNEEPUBLICATION"));
			}*/
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");

			PreparedStatement stm = (PreparedStatement) conn.prepareStatement("select f.ID_LIVRE, l.Titre, c.LIBELLE_CATEGORIE, l.ANNEEPUBLICATION from favorie f inner join livre l on l.ID_LIVRE=f.ID_LIVRE inner join categorie c on c.ID_CATEGORIE=l.ID_CATEGORIE where ID_PERSONNE=?");
			stm.setInt(1, Application.id);

			ResultSet res = stm.executeQuery();
			if (res != null) {
			    System.out.println("--------------------------------------------------------------------------------------------");
			    System.out.format("| %-8s | %-40s | %-25s | %-15s |\n", "ID Livre", "Titre", "Categorie", "Date Publication");
			    System.out.println("--------------------------------------------------------------------------------------------");
			}

			while (res.next()) {
			    System.out.format("| %-8s | %-40s | %-25s | %-15s |\n", res.getString("ID_LIVRE"), res.getString("Titre"), res.getString("LIBELLE_CATEGORIE"), res.getString("ANNEEPUBLICATION"));
			}

			if (res != null) {
			    System.out.println("--------------------------------------------------------------------------------------------");
			}


			
		}
		public static void supprimerFavorie(int idLivre) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");
			
			PreparedStatement stm=(PreparedStatement) conn.prepareStatement("delete from favorie where ID_LIVRE=? and ID_PERSONNE=?");
			stm.setInt(2,Application.id);
			stm.setInt(1,idLivre);
			//Statement stm=conn.createStatement();
			stm.executeUpdate();
		}
		
		public static void ajouterFavorie(int idLivre) throws SQLException, ClassNotFoundException {
			
			if(favorieExiste(idLivre)) {
				
				System.out.println("ce livre est deja  favorie");
				return ;
			}
			Class.forName("com.mysql.jdbc.Driver");
			Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");
			
			PreparedStatement stm=(PreparedStatement) conn.prepareStatement("insert into favorie values(?,?)");
			stm.setInt(1,Application.id);
			stm.setInt(2,idLivre);
			//Statement stm=conn.createStatement();
			stm.executeUpdate();
			
			System.out.println("Ajout d'une nouvelle favorie");
			
		}
		
		public static boolean favorieExiste(int idLivre) throws SQLException, ClassNotFoundException {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");
			
			PreparedStatement stm=(PreparedStatement) conn.prepareStatement("select * from favorie where ID_PERSONNE=? and ID_LIVRE=?");
			stm.setInt(1,Application.id);
			stm.setInt(2,idLivre);
			//Statement stm=conn.createStatement();
			ResultSet res=stm.executeQuery();
			
			if(!res.next()) {
				
				return false;
			}
			
				return true;
		}
		
		public static void  seDeconnecter() throws NoSuchAlgorithmException, UnsupportedEncodingException, ClassNotFoundException, SQLException, AuthentificationException {
			
			Application.id=-1;
			Application.Email="";
			
			// redirection vers menu login
			
			boolean isAuthenticated = false;

			do {
			    try {
			        MenuLoginProc();
			        isAuthenticated = true;  // Set isAuthenticated to true if login is successful
			    } catch (AuthentificationException ex) {
			        System.out.println(ex.getMessage());
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			} while (!isAuthenticated);
		}
		
		
		public static int menuLivre() {
			
			System.out.println("1-Afficher tous les livres");
			System.out.println("2-Rechercher Un livre ");
			
			
			
			
			
			Scanner sc=new Scanner(System.in);
			int choix=sc.nextInt();
			return choix;
		}
		
		public static void afficherTouslivre() throws ClassNotFoundException, SQLException {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");

			PreparedStatement stm = (PreparedStatement) conn.prepareStatement("select ID_LIVRE,TITRE,ISBN,ANNEEPUBLICATION,NOMBREPAGE from livre");
				
		

			ResultSet res = stm.executeQuery();
			if (res != null) {
			    System.out.println("--------------------------------------------------------------------------------------------");
			    System.out.format("| %-8s | %-40s | %-25s | %-15s |\n", "ID Livre", "Titre", "ISBN", "Date Publication", "Nombre Page");
			    System.out.println("--------------------------------------------------------------------------------------------");
			}

			while (res.next()) {
			    System.out.format("| %-8s | %-40s | %-25s | %-15s |\n", res.getString("ID_LIVRE"), res.getString("Titre"), res.getString("ISBN"), res.getString("ANNEEPUBLICATION"), res.getString("NOMBREPAGE"));
			}

			if (res != null) {
			    System.out.println("--------------------------------------------------------------------------------------------");
			}
		}
		
		public void sauvegarderfichier() {
			
			
		}
		public void remplirListLivres() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_biblio?useSSL=false","root","root");

			PreparedStatement stm = (PreparedStatement) conn.prepareStatement("select ID_LIVRE,TITRE,ISBN,ANNEEPUBLICATION,NOMBREPAGE from livre");
				
		

			ResultSet res = stm.executeQuery();
			

			while (res.next()) {
				Livre lv=new Livre();
				lv.setID(res.getInt("ID_LIVRE"));
				lv.setTitre(res.getString("TITRE"));
				lv.setISBN(res.getString("ISBN"));
				lv.setDateParution(res.getDate("ANNEEPUBLICATION"));
				lv.setNombrePage(res.getInt("NOMBREPAGE"));
				
				Livre.livres.add(lv);
			}
			
		}
	
	
	
	

}
