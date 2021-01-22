<%@
	page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>

<!DOCTYPE html>

<html>
	<head>
		
		<link rel='stylesheet' href="Forms/ajouter logement_prop_Form.css">
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Ajouter Logement</title>
		
	</head>
	
	<body>
		
		<%@ include file="left_dashboard_panel_page.jsp" %>
		
		<!-- Right Panel -->
		
		<div id="right-panel" class="right-panel">
		
		<!-- Header-->
		<header id="header" class="header">
			
			<div class="header-menu">
				
				<div class="col-sm-7">
					<a id="menuToggle" class="menutoggle pull-left"><i
						class="fa fa fa-tasks"></i></a>
					<div class="header-left">
						<button class="search-trigger">
							<i class="fa fa-search"></i>
						</button>
						<div class="form-inline">
							<form class="search-form">
								<input class="form-control mr-sm-2" type="text"
									placeholder="Search ..." aria-label="Search">
								<button class="search-close" type="submit">
									<i class="fa fa-close"></i>
								</button>
							</form>
						</div>
						
					</div>
				</div>
				
				<div class="col-sm-5">
					
					
					<a href = 'login_proprietaire_page.jsp'><i> Deconnexion </i></a>
					
				</div>
			</div>
			
		</header>
		<!-- /header -->
		<!-- Header-->
		
		<div class="breadcrumbs">
			<div class="col-sm-4">
				<div class="page-header float-left">
					<div class="page-title">
						<h1> Ajouter Logement </h1>
					</div>
				</div>
			</div>
			<div class="col-sm-8">
				<div class="page-header float-right">
					<div class="page-title">
						<ol class="breadcrumb text-right">
							<li class="active">Tableau de bord</li>
						</ol>
					</div>
				</div>
			</div>
		</div>
		
		<br><br><br>
		
		
		
		<div class="container">
		    <form method="get" action="AjouterLogementServlet">
		    	
		    	<h3><i>Description Logement :</i></h3> <br><br>
			  
			    <div class="row">
			      <div class="col-25">
			        <label for="fname"> Adresse :</label>
			      </div>
			      <div class="col-75">
			        <input type="text" id="fname" name="adresse" placeholder="Adresse Logement...">
			      </div>
			    </div>
		  		
			    <div class="row">
			      <div class="col-25">
			        <label for="fname"> Type :</label>
			      </div>
			      <div class="col-75">
			        <input type="text" id="fname" name="type_log" placeholder="Type Logement...">
			      </div>
			    </div>
			    
			    <div class="row">
			      <div class="col-25">
			        <label for="fname"> Superficie :</label>
			      </div>
			      <div class="col-75">
			        <input type="text" id="fname" name="superficie" placeholder="Superficie...">
			      </div>
			    </div>
			    
			    <div class="row">
			      <div class="col-25">
			        <label for="fname"> Nombre de chambre :</label>
			      </div>
			      <div class="col-75">
			        <input type="text" id="fname" name="nb_chambre" placeholder="N°Chambres...">
			      </div>
			    </div>
			    
			    <div class="row">
			      <div class="col-25">
			        <label for="subject"> Description textuelle : </label>
			      </div>
			      <div class="col-75">
			        <textarea id="subject" name="descrip_txt" placeholder="Description Logement..." style="height:200px"></textarea>
			      </div>
			    </div>
			    
			    <div class="row">
			      <div class="col-25">
			        <label for="subject"> Description par image 1 : </label>
			      </div>
			      <div class="col-75">
					<input type="file" name='descrip_img1'  />
			      </div>
			    </div>
			    
			    <div class="row">
			      <div class="col-25">
			        <label for="subject"> Description par image 2 : </label>
			      </div>
			      <div class="col-75">
					<input type="file" name='descrip_img2'  />
			      </div>
			    </div>
			    
			    <br><br><br><br><br>
			    
			    <div class="row">
			      <input style="width: 200px" type="submit" value="Ajouter">
			    </div>
			    
			    <br><br><br><br><br><br><br><br>
			    
		    </form>
		</div>
		
	<!-- /#right-panel -->
	
	<!-- Right Panel -->
		
	</body>
</html>
