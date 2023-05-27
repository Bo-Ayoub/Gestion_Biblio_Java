import java.util.*;

public class Etagere {
	private int id;
	public Etagere(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Etagere [id=" + id + "]";
	}
	
}
