package PFE_App_Demo_pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginPropServlet")
public class LoginPropServlet extends HttpServlet {
// Begin Class
	
	private static final long serialVersionUID = 1L;
    
    public LoginPropServlet () {
        super();
    }
    
    private void clientLogin (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    // Begin clientLogin()
    	
    	PrintWriter printWriter = response.getWriter();
		
		String email = request.getParameter("mail").trim();
		String password = request.getParameter("pass");
		
		Client client = new Client();
		client.selectToLogin();
		
		if ( (email.isEmpty()) || (password.isEmpty()) )
			printWriter.println("<script> alert('Votre email et mot de passe sont vides !\\n Saisissiez votre Email et Mot de passe');</script>");
		else {
			
			if (!client.getLoginHashMap().containsKey(email))
				printWriter.println("<script>alert('Email incorrecte !!');</script>");
			else {
				
				if ( !(client.getLoginHashMap().get(email).equals(password)) )
					printWriter.println("<script>alert('Mot de passe incorrecte !!');</script>");
				else {
					
					// send [nom prenom] attribute to the next page
					request.setAttribute("myNomAndPrenom", email);
					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("index_client.jsp");
					requestDispatcher.forward(request, response);
					
					client.closeDBConnection();
					
				}
				
			}
			
		}
    	
    // End clientLogin()
    }
    
    private void agentLogin (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Begin agentLogin()
    	
    	PrintWriter printWriter = response.getWriter();
		
		String email = request.getParameter("mail").trim();
		String password = request.getParameter("pass");
		
		AgentJuridique agentJuridique = new AgentJuridique();
		agentJuridique.selectToLogin();
		
		if ( (email.isEmpty()) || (password.isEmpty()) )
			printWriter.println("<script> alert('Votre email et mot de passe sont vides !\\n Saisissiez votre Email et Mot de passe');</script>");
		else {
			
			if (!agentJuridique.getLoginHashMap().containsKey(email))
				printWriter.println("<script>alert('Email incorrecte !!');</script>");
			else {
				
				if ( !(agentJuridique.getLoginHashMap().get(email).equals(password)) )
					printWriter.println("<script>alert('Mot de passe incorrecte !!');</script>");
				else {
					
					// send [nom prenom] attribute to the next page
					request.setAttribute("myNomAndPrenom", email);
					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("index_agent.jsp");
					requestDispatcher.forward(request, response);
					
					agentJuridique.closeDBConnection();
					
				}
				
			}
			
		}
    	
    // End agentLogin()
    }
    
    private void proprietaireLogin (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    // Begin proprietaireLogin()
    	
    	PrintWriter printWriter = response.getWriter();
		
		String email = request.getParameter("mail").trim();
		String password = request.getParameter("pass");
		
		Proprietaire proprietaire = new Proprietaire();
		proprietaire.selectToLogin();
		
		if ( (email.isEmpty()) || (password.isEmpty()) ) {
			
			printWriter.println("<script> alert('Votre email ou mot de passe est/sont vide(s) !\\n Saisissiez votre Email et Mot de passe');</script>");
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login_proprietaire_page.jsp");
			requestDispatcher.include(request, response);
			
		}
		else {
			
			if (!proprietaire.getLoginHashMap().containsKey(email)) {
				
				printWriter.println("<script>alert('Email incorrecte !!');</script>");
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("login_proprietaire_page.jsp");
				requestDispatcher.include(request, response);
				
			}
			else {
				
				if ( !(proprietaire.getLoginHashMap().get(email).equals(password)) ) {
					
					printWriter.println("<script>alert('Mot de passe incorrecte !!');</script>");
					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("login_proprietaire_page.jsp");
					requestDispatcher.include(request, response);
					
				}
				else {
					
					// in JSP
					// <%= request.getAttribute("myNomAndPrenom") %>
					
					// Sending [email,nom,prenom] to the next page
					
					HttpSession propSession = request.getSession();
					
					propSession.setAttribute("email", email);
					
					String nomEtPrenom = proprietaire.getNomAndPrenom(email);
					propSession.setAttribute("nomEtPrenom", nomEtPrenom);
					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("index_proprietaire.jsp");
					requestDispatcher.forward(request, response);
					
					proprietaire.closeDBConnection();
					
				}
				
			}
			
		}
    	
    // End proprietaireLogin()
    }
    
    @Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Begin doPost()
		
    	this.proprietaireLogin(request, response);
		
	// End doPost()
	}
	
// End Class
}
