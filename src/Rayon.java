import java.util.*;
public class Rayon {
	private int id;
	private int capaciteRayon;
	private List<Livre> livres = new ArrayList<Livre>();
	private Etagere etager;
	public Rayon(int id, int capaciteRayon) {
		this.id = id;
		this.capaciteRayon = capaciteRayon;
		etager = new Etagere(id);
	}
	@Override
	public String toString() {
		return "Rayon [id=" + id + ", capaciteRayon=" + capaciteRayon + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapaciteRayon() {
		return capaciteRayon;
	}
	public void setCapaciteRayon(int capaciteRayon) {
		this.capaciteRayon = capaciteRayon;
	}
	
}
