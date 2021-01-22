package PFE_App_Demo_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class ConnDB {
// Begin Class
	
	private Connection connect = null;
	private Statement statement = null;
	// private PreparedStatement prep = null;
	private ResultSet res = null;
	HashMap<String,String> hashMap = new HashMap<String,String>();
	
	ConnDB () {
		this.config("localhost", "pfe_db", "Reese", "Dashwood");
	}
	
	public HashMap<String,String> getHashMap () {
		return hashMap;
	}
	
	//	public void setHashMap(HashMap<String, String> hashMap) {
	//		this.hashMap = hashMap;
	//	}
	
	private void config (String hostname, String dbName, String dbUsername, String dbPassword) {
	// Begin config()
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://"+ hostname +"/"+ dbName +"?user="+ dbUsername +"&password="+ dbPassword +"");
			statement = connect.createStatement();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	// End config()
	}
	
	public void selectToLogin () {
	// Begin selectToLogin()
		
		String sql = "select email,password from personne";
		
		try {
			
			res = statement.executeQuery(sql);
			while (res.next()) {
				
				String email = res.getString("email");
				String pass = res.getString("passwd");
				
				hashMap.put(email, pass);
				
			}
			
			connect.close();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End selectToLogin()
	}
	
	public void insertData (String fname,String lname,String activity,String tel,String genre,String adresse,String categorie,String email,String password) {
	// Begin insertData()
		
		try {
			
			String sql = "insert into client (nom,prenom,activite,tel,genre,adr,categorie,email,passwd) values ('"+ fname +"','"+ lname +"','"+ 							activity +"','"+ tel +"','"+ genre +"','"+ adresse +"','"+ categorie +"','"+ email +"','"+ password +"')";
			connect.prepareStatement(sql).executeUpdate();
			
			connect.close();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End insertData()
	}
	
// End Class
}
