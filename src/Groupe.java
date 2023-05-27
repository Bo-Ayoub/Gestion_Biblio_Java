import java.util.ArrayList;
import java.util.Scanner;

public class Groupe {
	static private int cpt=0;
	private int id;
	private String libelle;
	private ArrayList<Etudiant> Etudiant=new ArrayList<Etudiant>();
	private Niveau n;
	public Groupe(Niveau n) { 
		cpt++;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Entrez le Groupe");
		id=cpt;
		String s = scanner.nextLine();
		libelle=n.getLibelleNiveau()+s;
		}
	public int getId() { 
		return id;
	}
	public void setId(int id) { 
		this.id = id;
	}
	public String getLibelleGroupe() {
		return libelle;
	}
	public void setLibelleGroupe(String libelle) { 
		this.libelle = libelle;
	}
	public ArrayList<Etudiant> getEtudiant() {
		return Etudiant;
	}
	public void setEtudiant(ArrayList<Etudiant> etudiant) {
		Etudiant = etudiant;
	}
	@Override
	public String toString() {
		return "Groupe [id=" + id + ", libelle=" + libelle + ", Etudiant=" + Etudiant + ", n=" + n + "]";
	}
}
