<%@
	page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
%>

    <link rel="apple-touch-icon" href="Forms/Dashboard form/apple-icon.png">
    <link rel="shortcut icon" href="Forms/Dashboard form/favicon.ico">
	
    <link rel="stylesheet" href="Forms/Dashboard form/assets/css/normalize.css">
    <link rel="stylesheet" href="Forms/Dashboard form/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="Forms/Dashboard form/assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="Forms/Dashboard form/assets/css/themify-icons.css">
    <link rel="stylesheet" href="Forms/Dashboard form/assets/css/flag-icon.min.css">
    <link rel="stylesheet" href="Forms/Dashboard form/assets/css/cs-skin-elastic.css">
    <!-- <link rel="stylesheet" href="Forms/Dashboard form/assets/css/bootstrap-select.less"> -->
    <link rel="stylesheet" href="Forms/Dashboard form/assets/scss/style.css">
    <link href="Forms/Dashboard form/assets/css/lib/vector-map/jqvmap.min.css" rel="stylesheet">
	
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>
	
    <!-- <script type="text/javascript" src="https://cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js"></script> -->
	
	
<script src="Forms/Dashboard form/assets/js/vendor/jquery-2.1.4.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
<script src="Forms/Dashboard form/assets/js/plugins.js"></script>
<script src="Forms/Dashboard form/assets/js/main.js"></script>

<script
	src="Forms/Dashboard form/assets/js/lib/chart-js/Chart.bundle.js"></script>
<script src="Forms/Dashboard form/assets/js/dashboard.js"></script>
<script src="Forms/Dashboard form/assets/js/widgets.js"></script>
<script
	src="Forms/Dashboard form/assets/js/lib/vector-map/jquery.vmap.js"></script>
<script
	src="Forms/Dashboard form/assets/js/lib/vector-map/jquery.vmap.min.js"></script>
<script
	src="Forms/Dashboard form/assets/js/lib/vector-map/jquery.vmap.sampledata.js"></script>
<script
	src="Forms/Dashboard form/assets/js/lib/vector-map/country/jquery.vmap.world.js"></script>
<script>
    ( function ( $ ) {
        "use strict";

        jQuery( '#vmap' ).vectorMap( {
            map: 'world_en',
            backgroundColor: null,
            color: '#ffffff',
            hoverOpacity: 0.7,
            selectedColor: '#1de9b6',
            enableZoom: true,
            showTooltip: true,
            values: sample_data,
            scaleColors: [ '#1de9b6', '#03a9f5' ],
            normalizeFunction: 'polynomial'
        } );
    } )( jQuery );
</script>


<!-- **********************************************End links and scripts**************************************************************** -->

<!-- Left panel************* -->

<aside id="left-panel" class="left-panel">
	<nav class="navbar navbar-expand-sm navbar-default">
		
		<div class="navbar-header">
			
			<a class="navbar-brand" href="home_page.jsp"><img src="images/logo.png"
				alt="Logo"></a> <a class="navbar-brand hidden" href="#"><img
				src="images/logo2.png" alt="Logo"></a>
		</div>
		
		<div id="main-menu" class="main-menu collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="index_client.jsp"> <i
						class="menu-icon fa fa-dashboard"></i>Tableau de bord
				</a></li>
				<h3 class="menu-title">Fonctionnalités</h3>
				<!-- /.menu-title -->
				<li class="menu-item-has-children dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="menu-icon fa fa-laptop"></i>
						Gérer <u>Logements</u>
				</a>
					<ul class="sub-menu children dropdown-menu">
						<li><i class="fa fa-puzzle-piece"></i><a
							href="ajouter_logement_prop_page.jsp">Ajouter</a></li>
						<li><i class="fa fa-id-badge"></i><a href="modifier_logement_prop_page.jsp">Modifier</a></li>
						<li><i class="fa fa-bars"></i><a href="supprimer_logement_prop_page.jsp">Supprimer</a></li>
						
						
					</ul>
					
				<li ><a href="gerer_reservation_client_page.jsp"  aria-haspopup="true"
					aria-expanded="false"> <i class="menu-icon fa fa-laptop"></i>
						Gérer <u>Réservations</u>
				</a>
					
				<li ><a href="gerer_contrat_bail_client_page.jsp" aria-haspopup="true"
					aria-expanded="false"> <i class="menu-icon fa fa-laptop"></i>
						Gérer <u>Contrat Bail</u>
				</a>
					
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</nav>
</aside>
<!-- /#left-panel -->

<!-- Left Panel -->
