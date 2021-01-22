package PFE_App_Demo_pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AjouterLogementServlet")
public class AjouterLogementServlet extends HttpServlet {
// Begin Class
	
	private static final long serialVersionUID = 1L;
    
    public AjouterLogementServlet () {
        super();
    }
    
    @Override
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Begin doGet()
		
		PrintWriter printWriter = response.getWriter();
		
		HttpSession session = request.getSession();
		String myEmail = (String) session.getAttribute("email");
		
		String adresse = request.getParameter("adresse").trim();
		String typeLog = request.getParameter("type_log").trim();
		float superficie = Float.parseFloat(request.getParameter("superficie"));
		int nbChambre = Integer.parseInt(request.getParameter("nb_chambre"));
		String descripTxt = request.getParameter("descrip_txt").trim();
		
		Logement logement = new Logement();
		logement.insertData(adresse, typeLog, superficie, nbChambre, descripTxt);
		
		printWriter.println("Data saved successfully !!!");
		
		/*
		Proprietaire proprietaire = new Proprietaire();
		
		if (proprietaire.isFieldEmpty(myEmail))
			proprietaire.insertNumLogementToProp(myEmail, logement.getNumLogement());
		else
			proprietaire.updateNumLogementToProp(myEmail, logement.getNumLogement());
		*/
		
		// close connection with Database
		logement.closeDBConnection();
		
	// End doGet()
	}
	
// End Class
}
