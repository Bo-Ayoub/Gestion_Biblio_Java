import java.util.*;

public class Langue {
	private int id;
	private String libelle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Langue(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Langue [id=" + id + ", libelle=" + libelle + "]";
	}
	
}
