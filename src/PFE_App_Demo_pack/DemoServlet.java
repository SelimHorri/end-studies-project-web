package PFE_App_Demo_pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
// Begin Class
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Begin doPost()
		
		PrintWriter printWriter = response.getWriter();
		String myMsg = (String) request.getAttribute("msg");
		printWriter.println(myMsg);
		
	// End doPost()
	}
	
// End Class
}
