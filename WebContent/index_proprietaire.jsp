<%@
	page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
%>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="">
<!--<![endif]-->

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Proprietaire index</title>
    <meta name="description" content="Sufee Admin - HTML5 Admin Template">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>
	
	
	<%@ include file="left_dashboard_panel_page.jsp"%>
	
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
						<h1> Tableau de bord Proprietaire </h1>
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
		
		<div class="content mt-3">
			
			<div class="col-sm-12">
				<div class="alert  alert-success alert-dismissible fade show"
					role="alert">
					<span class="badge badge-pill badge-success">
						
						<c:if test='${!empty sessionScope.nomEtPrenom}'>
							
							<h5><i>Bonjour M. ${sessionScope.nomEtPrenom} </i></h5>
							
						</c:if>
						
					</span>
					Vous vous êtes connecté avec succès
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
			</div>
			
			
			
		</div>
	<!-- /#right-panel -->
	
	<!-- Right Panel -->
	
</body>
</html>
