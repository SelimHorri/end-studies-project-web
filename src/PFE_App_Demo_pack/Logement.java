package PFE_App_Demo_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Logement {
// Begin Class
	
	private Connection connect = null;
	private Statement statement = null;
	// private PreparedStatement prep = null;
	private ResultSet res = null;
	
	private int numLogement, nbChambre;
	private String adresse, typeLog, descripTxt;
	private float superficie;
	
	public Logement () {
		this.config("localhost", "pfe_db", "Reese", "Dashwood");
	}
	
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
	
	public void insertData (String adresse,String type_log,float superficie,int nb_chambre,String descrip_txt) {
	// Begin insertData()
		
		try {
			
			String sql1 = "INSERT INTO Logement (adresse,type_log,superficie,nb_chambre,descrip_txt) VALUES ('"+ adresse +"','"+ type_log +"',"+ superficie +","+ nb_chambre +",'"+ descrip_txt +"')";
			
			connect.prepareStatement(sql1).executeUpdate();
			
			// selecting the last num_logement for our new record
			/*
			String sql2 = "SELECT max(num_logement) FROM Logement";
			
			res = statement.executeQuery(sql2);
			while (res.next())
				this.numLogement = res.getInt("num_logement");
			
			System.out.println("num_logement = "+ this.numLogement);
			*/
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	// End insertData()
	}
	
	// ******************************************Getters and Setters******************************************************************
	
	public void setNumLogement (int numLogement) {
		this.numLogement = numLogement;
	}
	
	public int getNumLogement() {
		return numLogement;
	}
	
	public int getNbChambre() {
		return nbChambre;
	}
	
	public void setNbChambre(int nbChambre) {
		this.nbChambre = nbChambre;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getTypeLog() {
		return typeLog;
	}
	
	public void setTypeLog(String typeLog) {
		this.typeLog = typeLog;
	}
	
	public String getDescripTxt() {
		return descripTxt;
	}
	
	public void setDescripTxt(String descripTxt) {
		this.descripTxt = descripTxt;
	}
	
	public float getSuperficie() {
		return superficie;
	}
	
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	
// End Class
}
