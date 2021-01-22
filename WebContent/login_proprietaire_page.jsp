<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE HTML>

<html>
	
	<% request.getSession().invalidate();%>
	
	<head>
		<title>Connexion Proprietaire</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="Forms/Login form/assets/css/main.css" />
	</head>
	
	<body>
		<!-- Header -->
		<header id="header">
			<h1> <i>Connexion</i> </h1><br><br>
		</header>
		
		<!-- *************************************************************************************************************** -->
		
		<!-- Signup Form -->
		<form method="post" action="LoginPropServlet" id="signup-form">
			
			<input type="email" name="mail" id="email" placeholder="Email Address..." />
			<br>
			
			<input type="password" name="pass" id="email" placeholder="Password..." />
			<br>
			
			<input type="submit" name="btn_login" value="Se Connecter" />
			
			
		</form>
		
		<!-- *************************************************************************************************************** -->
		
		<!-- Footer -->
		<footer id="footer">
			
			<h5> <a href="login_client_page.jsp" > Se connecter sous Client </a> </h5>
			<h5> <a href="login_agent_page.jsp" > Se connecter sous Agent Juridique </a> </h5> <br>
			<a href="signup_proprietaire_page.jsp" >Vous n'etes pas inscrit ?</a> <br><br><br>
			
			<ul class="icons">
				<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
				<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
				<li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
				<li><a href="#" class="icon fa-envelope-o"><span class="label">Email</span></a></li>
			</ul>
			
			
		</footer>
		
		<!-- Scripts -->
		<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
		<script src="Forms/Login form/assets/js/main.js"></script>
	</body>
	
</html>
