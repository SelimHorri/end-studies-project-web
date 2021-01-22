package PFE_App_Demo_pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationAgentServlet")
public class RegistrationAgentServlet extends HttpServlet {
// Begin Class
	
	private static final long serialVersionUID = 1L;
    
    public RegistrationAgentServlet() {
        super();
    }
    
    public void agentRegister (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Begin agentRegister()
    	
    	PrintWriter printWriter = response.getWriter();
    	
    	String nom = request.getParameter("nom");
    	String prenom = request.getParameter("prenom");
    	String tel = request.getParameter("tel");
    	String genre = request.getParameter("genre");
    	String mail = request.getParameter("mail");
    	String pass1 = request.getParameter("pass11");
    	String pass2 = request.getParameter("pass22");
    	
    	if ( (nom.isEmpty()) && (prenom.isEmpty()) && (tel.isEmpty()) && (genre.isEmpty()) && (mail.isEmpty()) && (pass1.isEmpty()) && (pass2.isEmpty()) )
    		printWriter.println("<script> alert('Les zones de textes sont vides !'); </script>");
		else {
			
			if ( (nom.isEmpty()) || (prenom.isEmpty()) || (tel.isEmpty()) || (genre.isEmpty()) || (mail.isEmpty()) || (pass1.isEmpty()) || (pass2.isEmpty()) )
				printWriter.println("<script> alert('Veuillez remplir toutes les zones de textes !'); </script>");
			else {
				
				if ( !(pass1.equals(pass2)) )
					printWriter.println("<script> alert('Les Mots de passes sont incompatibles ! Veuillez les vérifier !!'); </script>");
				else {
					
					AgentJuridique agentJuridique = new AgentJuridique();
					agentJuridique.insertData(nom, prenom, tel, genre, mail, pass1);
					printWriter.println("<script> alert('Les données sont enregistrées avec succès'); </script>");
					
					agentJuridique.closeDBConnection();
					
					nom = null;
					prenom = null;
					mail = null;
					tel = null;
					genre = null;
					pass1 = null;
					pass2 = null;
					
				}
				
			}
			
		}
    	
    // End agentRegister()
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Begin doPost()
		
		this.agentRegister(request, response);
		
	// End doPost()
	}
	
// End Class
}
