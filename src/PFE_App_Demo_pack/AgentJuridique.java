package PFE_App_Demo_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class AgentJuridique implements Login_methods {
// Begin Class
	
	private Connection connect = null;
	private Statement statement = null;
	// private PreparedStatement prep = null;
	private ResultSet res = null;
	
	private HashMap<String, String> LoginHashMap = new HashMap<String,String>();
	
	private int id;
	private String nom,prenom,email,passwd,tel,genre;
	
	public AgentJuridique () {
		this.config("localhost", "pfe_db", "Reese", "Dashwood");
	}
	
	// ********************************************** config() ******************************************************************
	
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
	
	@Override
	public void closeDBConnection () {
	// Begin closeDBConnection()
		
		try {
			connect.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End closeDBConnection()
	}
	
	public void insertData (String fname,String lname,String tel,String genre,String email,String password) {
	// Begin insertData()
		
		try {
			
			String sql = "insert into AgentJuridique (nom,prenom,tel,genre,email,passwd) values ('"+ fname +"','"+ lname +"','"+ tel +"','"+ genre +"','"+ email +"','"+ password +"')";
			connect.prepareStatement(sql).executeUpdate();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End insertData()
	}
	
	@Override
	public void selectToLogin() {
	// Begin selectToLogin()
		
		String sql = "select email,passwd from AgentJuridique";
		
		try {
			
			res = statement.executeQuery(sql);
			while (res.next()) {
				
				this.email = res.getString("email");
				this.passwd = res.getString("passwd");
				
				this.LoginHashMap.put(this.email, this.passwd);
				
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End selectToLogin()
	}
	
	public String getNomAndPrenom (String emailSent) {
	// Begin getNomAndPrenom()
		
		this.config("localhost", "pfe_db", "Reese", "Dashwood");
		
		String sql = "SELECT nom,prenom FROM AgentJuridique WHERE email = '"+ emailSent +"'";
		String firstname = null,lastname = null;
		
		try {
			
			res = statement.executeQuery(sql);
			
			while (res.next()) {
				
				firstname = res.getString("nom");
				lastname = res.getString("prenom");
				
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ( lastname.toUpperCase() +" "+ firstname.toUpperCase().charAt(0) + firstname.substring(1) );
		
	// End getNomAndPrenom()
	}
	
	// *********************************************** Setters and getters *************************************************
	
	public HashMap<String, String> getLoginHashMap() {
		return LoginHashMap;
	}
	
	public void setLoginHashMap(HashMap<String, String> loginHashMap) {
		LoginHashMap = loginHashMap;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
// End Class
}
