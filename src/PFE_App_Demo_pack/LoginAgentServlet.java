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

@WebServlet("/LoginAgentServlet")
public class LoginAgentServlet extends HttpServlet {
// Begin Class
	
	private static final long serialVersionUID = 1L;
    
    public LoginAgentServlet () {
        super();
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
					
					// in JSP
					// <%= request.getAttribute("myNomAndPrenom") %>
					
					// Sending [email,nom,prenom] to the next page
					
					HttpSession propSession = request.getSession();
					
					propSession.setAttribute("email", email);
					
					String nomEtPrenom = agentJuridique.getNomAndPrenom(email);
					propSession.setAttribute("nomEtPrenom", nomEtPrenom);
					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("index_agent.jsp");
					requestDispatcher.forward(request, response);
					
					agentJuridique.closeDBConnection();
					
				}
				
			}
			
		}
    	
    // End agentLogin()
    }
	
    @Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Begin doPost()
		
		this.agentLogin(request, response);
		
	// End doPost()
	}
	
// End Class
}
