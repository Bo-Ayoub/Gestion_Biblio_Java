import java.util.Date;

public class Enseignant extends Personne {

	
	public Enseignant () {
		super();
	}
	public Enseignant(String Nom,String Prenom,String NumeroTelephone,String CIN,Date DateNaissance) {
		super(Nom,Prenom,NumeroTelephone,CIN,DateNaissance);
	}
}
