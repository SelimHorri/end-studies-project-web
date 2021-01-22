package PFE_App_Demo_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;

public class Proprietaire implements Login_methods {
// Begin Class
	
	private Connection connect = null;
	private Statement statement = null;
	// private PreparedStatement prep = null;
	private ResultSet res = null;
	
	private HashMap<String, String> LoginHashMap = new HashMap<String,String>();
	
	private int id;
	private Date dateNaiss;
	private String nom,prenom,email,passwd,activite,tel,genre,adr;
	
	public Proprietaire () {
		this.config("localhost", "pfe_db", "Reese", "Dashwood");
	}
	
	
	
	// *********************************************** config() *******************************************************************
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
	
	@Override
	public void selectToLogin () {
	// Begin selectToLogin()
		
		String sql = "SELECT email,passwd FROM proprietaire";
		
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
	
	public void insertData (String fname,String lname,String activity,String tel,String genre,String adresse,String email,String password) {
	// Begin insertData()
		
		try {
			
			String sql = "insert into Proprietaire (nom,prenom,activite,tel,genre,adr,email,passwd) values ('"+ fname +"','"+ lname +"','"+ activity +"','"+ tel +"','"+ genre +"','"+ adresse +"','"+ email +"','"+ password +"')";
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
		
		String sql = "SELECT nom,prenom FROM Proprietaire WHERE email = '"+ emailSent +"'";
		StringBuilder firstname = new StringBuilder("");
		StringBuilder lastname = new StringBuilder("");
		
		try {
			
			res = statement.executeQuery(sql);
			
			while (res.next()) {
				firstname.append(res.getString("nom"));
				lastname.append(res.getString("prenom"));
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ( lastname.toString().toUpperCase() +" "+ firstname.toString().toUpperCase().charAt(0) + firstname.toString().substring(1) );
		
	// End getNomAndPrenom()
	}
	
	public boolean isFieldEmpty (String userEmail) {
	// Begin isFieldEmpty()
		
		boolean bool = true;
		
		try {
			int num = -1;
			String sql = "SELECT num_logement FROM Proprietaire WHERE email = '"+ userEmail +"'";
			res = statement.executeQuery(sql);
			while (res.next())
				num = res.getInt("num_logement");
			
			if (num != 0 || num > 0)
				bool = false;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bool;
		
	// End isFieldEmpty()
	}
	
	public void insertNumLogementToProp (String userEmail,int num_logement) {
	// Begin insertNumLogementToProp()
		
		try {
			String sql = "INSERT INTO Proprietaire (num_logement) VALUES ("+ num_logement +") WHERE email = '"+ userEmail +"'";
			connect.prepareStatement(sql).executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End insertNumLogementToProp()
	}
	
	public void updateNumLogementToProp (String userEmail,int num_logement) {
	// Begin updateNumLogementToProp()
		
		try {
			String sql = "UPDATE Proprietaire SET num_logement = "+ num_logement +" WHERE email = '"+ userEmail +"'";
			connect.prepareStatement(sql).executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End updateNumLogementToProp()
	}
	
	// *********************************************** Setters and Getters *******************************************************************
	
	public HashMap<String, String> getLoginHashMap () {
		return LoginHashMap;
	}
	
	public void setLoginHashMap (HashMap<String, String> loginHashMap) {
		this.LoginHashMap = loginHashMap;
	}
	
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
	
	public String getAdr() {
		return adr;
	}
	
	public void setAdr(String adr) {
		this.adr = adr;
	}
	
// End Class
}
