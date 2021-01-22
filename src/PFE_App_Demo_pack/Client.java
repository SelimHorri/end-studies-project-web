package PFE_App_Demo_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;

public class Client implements Login_methods {
// Begin Class
	
	private Connection connect = null;
	private Statement statement = null;
	// private PreparedStatement prep = null;
	private ResultSet res = null;
	
	private HashMap<String, String> LoginHashMap = new HashMap<String,String>();
	
	private int id;
	private Date dateNaiss;
	private String nom,prenom,email,passwd,activite,tel,genre,adrClient,categorie;
	
	public Client () {
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
	
	// ******************************************* Controlers ************************************************************************
	
	@Override
	public void selectToLogin () {
	// Begin selectToLogin()
		
		String sql = "select email,passwd from Client";
		
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
	
	public void insertData (String fname,String lname,String activity,String tel,String genre,String adresse,String categorie,String email,String password) {
	// Begin insertData()
		
		try {
			
			String sql = "insert into Client (nom,prenom,activite,tel,genre,adr,categorie,email,passwd) values ('"+ fname +"','"+ lname +"','"+ 							activity +"','"+ tel +"','"+ genre +"','"+ adresse +"','"+ categorie +"','"+ email +"','"+ password +"')";
			connect.prepareStatement(sql).executeUpdate();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End insertData()
	}
	
	public String getNomAndPrenom (String emailSent) {
	// Begin getNomAndPrenom()
		
		this.config("localhost", "pfe_db", "Reese", "Dashwood");
		
		String sql = "SELECT nom,prenom FROM Client WHERE email = '"+ emailSent +"'";
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
	
	public int getId() {
		return id;
	}

	public Date getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
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

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
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

	public String getAdrClient() {
		return adrClient;
	}

	public void setAdrClient(String adrClient) {
		this.adrClient = adrClient;
	}
	
	public String getCategorie() {
		return categorie;
	}
	
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public HashMap<String, String> getLoginHashMap() {
		return LoginHashMap;
	}
	
	public void setLoginHashMap(HashMap<String, String> loginHashMap) {
		LoginHashMap = loginHashMap;
	}
	
// End Class
}
