<%@
	page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>

<!DOCTYPE html>

<html lang="en" >
	
	<% request.getSession().invalidate(); %>
	
	<head>
		
		<meta charset="UTF-8">
		<title>Registration Client</title>
		
		<link rel="stylesheet" href="Forms/Registration form/css/style.css">
	  
	</head>
	
	<body>
		
		
		<div class='login'>
			
			<h2>S'inscrire</h2>
			
			<form action="RegistrationClientServlet" method="post">
				
				<input type='text' name='nom' placeholder='Nom...' />
				<input type='text' name='prenom' placeholder='Prénom...' />
				<input type="date" name='date_naiss' placeholder='Date de naissance...' />
				<input type='text' name='activite' placeholder='Activité...' />
				<input type="text" name='tel' placeholder='n°Telephone...' />
				<input type='text' name='genre' placeholder="Homme/Femme" />
				<input type="text" name='adresse' placeholder='Adresse...' />
				<input type="text" name='categorie' placeholder='Catégorie...' />
				<input type='email' name='mail' placeholder='E-Mail...' />
				<input type='password' id='pw' name='pass11' placeholder='Mot de passe...' />
				<input type='password' id='pw' name='pass22' placeholder='Confirmer mot de passe...' />
				
				<br><br><br><br><br>
				
				<input class='animated' type='submit' name='btn_sign_up' value='Valider' /> <br><br> <hr>
				
				<a class='forgot' href='signup_proprietaire_page.jsp'> <h3> S'inscrire sous Propriétaire? </h3> </a>
				<a class='forgot' href='signup_agent_page.jsp'> <h3> S'inscrire sous Agent Juridique? </h3> </a>
				<br><br><br> <hr> <br><br><br>
				<a class='forgot' href='login_client_page.jsp'>Vous avez un compte?</a> <br><br><br><br><br><br><br><br>
				
				<% request.setAttribute("client_page","Client"); %>
				
			</form>
			
		</div>
		
	    <script  src="Forms/Registration form/js/index.js"></script>
		
	</body>
	
</html>
