import java.util.Scanner;

public class Groupe {
	
	
	private int Id;
	private String libelle;
	private Niveau niv;
	public static int cpt;
	
	
	
	public Groupe() {
		
		this.Id=Groupe.cpt;
		Groupe.cpt++;
	}
	
	public Groupe(String libelle,Groupe gr) {
		this();
	}
	
	public Groupe(int Id,String libelle,Niveau niv) {
		this.Id=Id;
		this.libelle=libelle;
		this.niv=niv;
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
	public Niveau getNiv() {
		return niv;
	}
	public void setNiv(Niveau niv) {
		this.niv = niv;
	}
	
	
	@Override
	public String toString() {
		
		return this.Id+" "+this.libelle+this.niv;
	}
	
	
	public void RemplirGroupe() {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Saisir libelle");
			this.libelle=sc.nextLine();
			
		}
	
	
	
	
	
}
