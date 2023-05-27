
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;



import java.sql.Statement;

public class Connexion {

/*public void Ajouter(Personne p) throws ClassNotFoundException, SQLException {
		
		Connection conn=this.openConnexion();
		PreparedStatement stm=(PreparedStatement) conn.prepareStatement("INSERT INTO Personne(Nom,Prenom,age) values(?,?,?)");
		stm.setString(1,p.getNom());
		stm.setString(2, p.getPrenom());
		stm.setInt(3, p.getAge());
		stm.executeUpdate();
	}
	public void Ajouter(ArrayList<Personne> personnes) {
		
	}
	public void Supprimer(Personne p) throws ClassNotFoundException, SQLException {
		
		// suppression de la bd;
		Connection conn=this.openConnexion();
		PreparedStatement stm=(PreparedStatement) conn.prepareStatement("Delete from  Personne where ID=?");
		stm.setInt(1,p.getId());
		stm.executeUpdate();
	}
	public ArrayList<Personne> getAllData() throws ClassNotFoundException, SQLException {
		ArrayList<Personne> personnes=new ArrayList<Personne>();
		Connection conn=this.openConnexion();
		Statement stm=conn.createStatement();
		ResultSet res=stm.executeQuery("SELECT * FROM Personne");
		Personne p;
		while(res.next()) {
			p=new Personne(Integer.valueOf(res.getString("ID")),res.getString("Nom"),res.getString("Prenom"),Integer.valueOf(res.getString("age")));
			personnes.add(p);
		}
		conn.close();
		stm.close();
		
		
		return personnes;
	}
	public void Modifier(Personne PM,Personne PAM) {
		
	}
	public Personne getOne() {
		
		return null;
	}
	private Connection openConnexion() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_personne?useSSL=false","root","root");
		return conn;
		
	}
	*/
	
}
