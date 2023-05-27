import java.util.ArrayList;
import java.util.Scanner;

public class Niveau {
	static private int cpt=0;
	private int id;
	private String libelle;
	private Filiere f;
	private ArrayList<Groupe> Groupe= new ArrayList<Groupe>();
	public Niveau(Filiere f) {
		cpt++;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Entrez le niveau");
		id=cpt;
		String s = scanner.nextLine();
		libelle=f.getLibelleFiliere()+s;
	}
	public void ajouterGroupe(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		System.out.println("Vous voulez ajoutez combien de groupes ?");
		int i = scanner.nextInt();
		for(int j=0;j<i;j++) {
			Groupe g=new Groupe(this);
			Groupe.add(g);
		}
	}
	public int getIdNiveau() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelleNiveau() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public ArrayList<Groupe> getGroupe() {
		return Groupe;
	}
	public void setGroupe(ArrayList<Groupe> groupe) {
		Groupe = groupe;
	}
	@Override
	public String toString() {
		return "Niveau [id=" + id + ", libelle=" + libelle + ", Groupe=" + Groupe + "]";
	}
}
