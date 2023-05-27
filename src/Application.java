import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String date="30-10-1999";
		Date d=null;
		Etudiant et=null;
		try {
			 d=new SimpleDateFormat("dd-MM-yyyy").parse(date);  
			  et=new Etudiant("boussaidi","ayoub","0671609136","FA167731",d,"A12");
				System.out.println(et.getAge());

		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}*/
		Filiere f=new Filiere();
		f.ajouterNiveau();
		ArrayList<Niveau> n=f.getNiveau();
		for(int i=0;i<n.size();i++) {
			n.get(i).ajouterGroupe();
		}
		System.out.println(n);
	}

}
