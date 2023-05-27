import java.util.Date;
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
	
	
}
