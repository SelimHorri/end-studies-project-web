package PFE_App_Demo_pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationClientServlet")
public class RegistrationClientServlet extends HttpServlet {
// Begin Class
	
	private static final long serialVersionUID = 1L;
	
    public RegistrationClientServlet () {
        super();
    }
    
    public void clientRegister (HttpServletRequest request, HttpServletResponse response) throws IOException {
    // Begin clientRegister()
    	
    	PrintWriter printWriter = response.getWriter();
    	
    	String nom = request.getParameter("nom");
    	String prenom = request.getParameter("prenom");
    	// Date dateNaiss = new Date( String.valueOf(request.getParameter("date_naiss")));
    	String activite = request.getParameter("activite");
    	String tel = request.getParameter("tel");
    	String genre = request.getParameter("genre");
    	String adresse = request.getParameter("adresse");
    	String categorie = request.getParameter("categorie");
    	String mail = request.getParameter("mail");
    	String pass1 = request.getParameter("pass11");
    	String pass2 = request.getParameter("pass22");
    	
    	if ( (nom.isEmpty()) && (prenom.isEmpty()) && (activite.isEmpty()) && (tel.isEmpty()) && (genre.isEmpty()) && (adresse.isEmpty()) && (categorie.isEmpty()) && (mail.isEmpty()) && (pass1.isEmpty()) && (pass2.isEmpty()) )
    		printWriter.println("<script> alert('Les zones de textes sont vides !'); </script>");
		else {
			
			if ( (nom.isEmpty()) || (prenom.isEmpty()) || (activite.isEmpty()) || (tel.isEmpty()) || (genre.isEmpty()) || (adresse.isEmpty()) || (categorie.isEmpty()) || (mail.isEmpty()) || (pass1.isEmpty()) || (pass2.isEmpty()) )
				printWriter.println("<script> alert('Veuillez remplir toutes les zones de textes !'); </script>");
			else {
				
				if ( !(pass1.equals(pass2)) )
					printWriter.println("<script> alert('Les Mots de passes sont incompatibles ! Veuillez les vérifier !!'); </script>");
				else {
					
					Client client = new Client();
					client.insertData(nom, prenom, activite, tel, genre, adresse, categorie, mail, pass1);
					printWriter.println("<script> alert('Les données sont enregistrées avec succès'); </script>");
					
					client.closeDBConnection();
					
					nom = null;
					prenom = null;
					mail = null;
					pass1 = null;
					pass2 = null;
					
				}
				
			}
			
		}
    	
    // End clientRegister()
    }
    
    // ----------------------------------------------------doPost()-----------------------------------------------------------------
    
    @Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Begin doPost()
    	
    	//String choice = "Client";
    	
    	this.clientRegister(request, response);
		
	// End doPost()
	}
	
// End Class
}
