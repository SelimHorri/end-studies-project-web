<%@
	page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>

<!DOCTYPE html>

<html lang="en" >
	
	<% request.getSession().invalidate(); %>
	
	<head>
		
		<meta charset="UTF-8">
		<title>Registration Agent Juridique</title>
		
		<link rel="stylesheet" href="Forms/Registration form/css/style.css">
	  
	</head>
	
	<body>
		
		
		<div class='login'>
			
			<h2>S'inscrire</h2>
			
			<form action="RegistrationAgentServlet" method="post">
				
				<input type='text' name='nom' placeholder='Nom...' />
				<input type='text' name='prenom' placeholder='Prénom...' />
				<input type="text" name='tel' placeholder='n°Telephone...' />
				<input type='text' name='genre' placeholder="Homme/Femme" />
				<input type='email' name='mail' placeholder='E-Mail...' />
				<input type='password' id='pw' name='pass11' placeholder='Mot de passe...' />
				<input type='password' id='pw' name='pass22' placeholder='Confirmer mot de passe...' />
				
				<br><br><br><br><br>
				
				<input class='animated' type='submit' name='btn_sign_up' value='Valider' /> <br><br> <hr>
				
				<a class='forgot' href='signup_client_page.jsp'><i> <h3> S'inscrire sous Client? </h3> </i></a>
				<a class='forgot' href='signup_proprietaire_page.jsp'> <i> <h3> S'inscrire sous Propriétaire? </h3> </i> </a>
				<br><br><br> <hr> <br><br><br>
				<a class='forgot' href='login_agent_page.jsp'>Vous avez un compte?</a> <br><br><br><br><br><br><br><br>
				
				<% request.setAttribute("agent_page","Agent"); %>
				
			</form>
			
		</div>
		
	    <script  src="Forms/Registration form/js/index.js"></script>
		
	</body>
	
</html>
