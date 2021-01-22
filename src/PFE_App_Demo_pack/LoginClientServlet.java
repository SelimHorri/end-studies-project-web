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

@WebServlet("/LoginClientServlet")
public class LoginClientServlet extends HttpServlet {
// Begin Class
	
	private static final long serialVersionUID = 1L;
    
    public LoginClientServlet () {
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
					
					// in JSP
					// <%= request.getAttribute("myNomAndPrenom") %>
					
					// Sending [email,nom,prenom] to the next page
					
					HttpSession propSession = request.getSession();
					
					propSession.setAttribute("email", email);
					
					String nomEtPrenom = client.getNomAndPrenom(email);
					propSession.setAttribute("nomEtPrenom", nomEtPrenom);
					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("index_client.jsp");
					requestDispatcher.forward(request, response);
					
					client.closeDBConnection();
					
				}
				
			}
			
		}
    	
    // End clientLogin()
    }
    
    @Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Begin doPost()
		
		this.clientLogin(request,response);
		
	// End doPost()
	}
	
// End Class
}
