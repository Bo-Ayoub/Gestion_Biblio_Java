import java.util.ArrayList;
import java.util.Scanner;

public class Niveau {



	
	
	private int Id;
	private String libelle;
	private ArrayList<Groupe> groupes=new ArrayList<Groupe>();
	private Filiere fl;
	public static int cpt;
	
	
	
	public Niveau() {
		
		this.Id=cpt;
		Niveau.cpt++;
	}
	
	public Niveau(String libelle) {
		this();
	}
	
	public Niveau(int Id,String libelle) {
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
	
	
	
	
	public Filiere getFl() {
		return fl;
	}

	public void setFl(Filiere fl) {
		this.fl = fl;
	}

	@Override
	public String toString() {
		
		return this.Id+" "+this.libelle;
	}
	
	public void RemplirNiveau() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Saisir libelle");
		this.libelle=sc.nextLine();
		
	}
	
	
	
	
	
}


