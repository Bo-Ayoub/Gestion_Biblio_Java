import java.util.ArrayList;
import java.util.Scanner;

public class Filiere {

	
	private int Id;
	private String libelle;
	private ArrayList<Niveau> niveaux=new ArrayList<Niveau>();
	public static int cpt;
	
	
	
	public Filiere() {
		
		this.Id=cpt;
		Filiere.cpt++;
	}
	
	public Filiere(String libelle) {
		this();
	}
	
	public Filiere(int Id,String libelle) {
		this.Id=Id;
		this.libelle=libelle;
		
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
		
		return this.Id+" "+this.libelle;
	}
	
	public void ajouterNiveau() {
		
		Niveau nv=new Niveau();
		nv.RemplirNiveau();
		nv.setLibelle(this.libelle+nv.getLibelle());
		nv.setFl(this);
		this.niveaux.add(nv);
		
		
	}
	public void listTousNiveaux() {
		for(int i=0;i<this.niveaux.size();i++) {
			System.out.println(this.niveaux.get(i));
		}
	}
	
	public void RemplirFiliere() {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Saisir le nom de la filiere");
			this.libelle=sc.nextLine();
			
		}
	}
