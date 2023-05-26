import java.util.Date;

public class ResponsableBiblio extends Personne {

	
	public ResponsableBiblio() {
		super();
	}
	
	public ResponsableBiblio(String Nom,String Prenom,String NumeroTelephone,String CIN,Date DateNaissance) {
		
		super(Nom,Prenom,NumeroTelephone,CIN,DateNaissance);
	}
}
