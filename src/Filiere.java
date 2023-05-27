import java.util.ArrayList;
import java.util.*;
public class Filiere {
	private int id=0;
	private String libelle;
	private ArrayList<Niveau> Niveau=new ArrayList<Niveau>();
	public Filiere() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Entrez la filiere");
		this.libelle = scanner.nextLine();
		id++;
	}
	public void ajouterNiveau(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		System.out.println("Vous voulez ajoutez combien de niveaux ?");
		int i = scanner.nextInt();
		for(int j=0;j<i;j++) {
			Niveau g=new Niveau(this);
			Niveau.add(g);
			g.ajouterGroupe();
		}
	}
	public int getIdFiliere() {
		return id;
	}
	public void setIdFiliere(int id) {
		this.id = id;
	}
	public String getLibelleFiliere() {
		return libelle;
	}
	public void setLibelleFiliere(String libelle) {
		this.libelle = libelle;
	}
	public ArrayList<Niveau> getNiveau() {
		return Niveau;
	}
	public void setNiveau(ArrayList<Niveau> niveau) {
		Niveau = niveau;
	}
	public String toString() {
		return "Filiere [id=" + id + ", libelle=" + libelle + ", Niveau=" + Niveau + "]";
	}
}
