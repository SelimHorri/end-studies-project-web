<%@
	page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>

<!DOCTYPE html>
<!--[if lt IE 9 ]><html class="no-js oldie" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="no-js oldie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->

<html class="no-js" >
<!--<![endif]-->
	
	<head>
		
	<!--- basic page needs
	================================================== -->
		<meta charset="utf-8">
		<title>PFE Home</title>
		<meta name="description" content="">
		<meta name="author" content="">
		
	<!-- mobile specific metas
	================================================== -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
	<!-- CSS
	================================================== -->
		<link rel="stylesheet" href="Forms/home form/css/base.css">
		<link rel="stylesheet" href="Forms/home form/css/vendor.css">
		<link rel="stylesheet" href="Forms/home form/css/main.css">
		
	<!-- script
	================================================== -->
		<script src="Forms/home form/js/modernizr.js"></script>
		<script src="Forms/home form/js/pace.min.js"></script>
		
	<!-- favicons
	================================================== -->
		<link rel="shortcut icon" href="Forms/home form/favicon.ico" type="image/x-icon">
		<link rel="icon" href="Forms/home form/favicon.ico" type="image/x-icon">
		
	</head>
	
	<body id="top">
		
	    <!-- header
	    ================================================== -->
	    <header class="s-header">
			
	        <div class="header-logo">
	            <a class="site-logo" href="home_page.jsp">projet PFE</a>
	        </div>
			
	        <nav class="header-nav">
				
	            <a href="#0" class="header-nav__close" title="Fermer"><span>Fermer</span></a>
				
	            <div class="header-nav__content">
	                <h3>Navigation</h3>
	                
	                <ul class="header-nav__list">
	                    <li class="current"><a class="smoothscroll"  href="#home" title="home">Acceuil</a></li>
	                    <li><a class="smoothscroll"  href="#about" title="about">A propos</a></li>
	                    <li><a class="smoothscroll"  href="#services" title="categories">Catégories</a></li>
	                    <!-- <li><a class="smoothscroll"  href="#works" title="works">Works</a></li> -->
	                    <!-- <li><a class="smoothscroll"  href="#clients" title="clients">Clients</a></li> -->
	                    <!-- <li><a class="smoothscroll"  href="#contact" title="contact">Contact</a></li> -->
	                </ul>
	    			
	                <ul class="header-nav__social">
	                    <li>
	                        <a href="#"><i class="fa fa-facebook"></i></a>
	                    </li>
	                    <li>
	                        <a href="#"><i class="fa fa-twitter"></i></a>
	                    </li>
	                    <li>
	                        <a href="#"><i class="fa fa-instagram"></i></a>
	                    </li>
	                    <li>
	                        <a href="#"><i class="fa fa-behance"></i></a>
	                    </li>
	                    <li>
	                        <a href="#"><i class="fa fa-dribbble"></i></a>
	                    </li>
	                </ul>
				
	            </div> <!-- end header-nav__content -->
				
	        </nav>  <!-- end header-nav -->
			
	        <a class="header-menu-toggle" href="#0">
	            <span class="header-menu-text">Menu</span>
	            <span class="header-menu-icon"></span>
	        </a>
			
	    </header> <!-- end s-header -->
		
	    <!-- home
	    ================================================== -->
	    <section id="home" class="s-home target-section" data-parallax="scroll" data-image-src="Forms/home form/images/hero-bg.jpg" data-natural-width=3000 data-natural-height=2000 data-position-y=center>
			
	        <div class="overlay"></div>
	        <div class="shadow-overlay"></div>
			
	        <div class="home-content">
				
	            <div class="row home-content__main">
					
					<h1 style='color: #51e879'>Bienvenue</h1> <br>
	                <h3>Bienvenue dans notre site web pour les locations immobilières</h3>
	                
					<!-- *********************************************************************** -->
					
	                <div class="home-content__buttons">
	                    <a href="login_proprietaire_page.jsp" class="smoothscroll btn btn--stroke"> Connexion </a>
	                    <a href="signup_proprietaire_page.jsp" class="smoothscroll btn btn--stroke"> S'inscrire </a>
	                </div>
	                
	                <!-- *********************************************************************** -->
					
	            </div>
				
	            <div class="home-content__scroll">
	                <a href="#about" class="scroll-link smoothscroll">
	                    <span>Défiler vers le bas</span>
	                </a>
	            </div>
				
	            <div class="home-content__line"></div>
				
	        </div> <!-- end home-content -->
			
	        <ul class="home-social">
	            <li>
	                <a href="#0"><i class="fa fa-facebook" aria-hidden="true"></i><span>Facebook</span></a>
	            </li>
	            <li>
	                <a href="#0"><i class="fa fa-twitter" aria-hidden="true"></i><span>Twiiter</span></a>
	            </li>
	            <li>
	                <a href="#0"><i class="fa fa-instagram" aria-hidden="true"></i><span>Instagram</span></a>
	            </li>
	            <li>
	                <a href="#0"><i class="fa fa-behance" aria-hidden="true"></i><span>Behance</span></a>
	            </li>
	            <li>
	                <a href="#0"><i class="fa fa-dribbble" aria-hidden="true"></i><span>Dribbble</span></a>
	            </li>
	        </ul> 
	        <!-- end home-social -->
			
	    </section> <!-- end s-home -->
		
		
	    <!-- about
	    ================================================== -->
	    <section id='about' class="s-about">
			
	        <div class="row section-header has-bottom-sep" data-aos="fade-up">
	            <div class="col-full">
	                <h3 class="subhead subhead--dark">Notre entreprise tunisienne :</h3>
	                <h1 class="display-1 display-1--light">"Tunisie Telecom"</h1>
	            </div>
	        </div> <!-- end section-header -->
			
	        <div class="row about-desc" data-aos="fade-up">
	            <div class="col-full">
	                <p>
		                Depuis sa création, Tunisie Telecom œuvre à
						consolider l’infrastructure des télécoms en Tunisie, à améliorer le
						taux de couverture et à renforcer sa compétitivité. Elle contribue
						également activement à la promotion de l’usage des TIC et au
						développement des sociétés innovantes dans le domaine des télécoms.
						Pionnière du secteur des télécoms en Tunisie, Tunisie Telecom a
						établi un ensemble de valeurs définitoires qui place le client au
						centre de ses priorités. L’adoption de ces valeurs se traduit en
						particulier par une amélioration continue des standards de
						l’entreprise et de la qualité des services. Tunisie Telecom compte
						dans ses rangs plus de 6 millions abonnés dans la téléphonie fixe
						et mobile. Tunisie Telecom se compose de 24 directions régionales,
						de 140 Espaces TT et points de vente et de plus de 13 mille points
						de vente privés. Elle emploie plus de 6000 agents.
					</p>
	            </div>
	        </div> <!-- end about-desc -->
	        
	        <!-- end about-stats -->
			
	    </section> <!-- end s-about -->
		
	    <!-- services
	    ================================================== -->
	    <section id='services' class="s-services">
			
	        <div class="row section-header has-bottom-sep" data-aos="fade-up">
	            <div class="col-full">
	                <h3 class="subhead"> Catégories </h3>
	                <h1 class="display-2">Présentation de nos catégories :</h1>
	            </div>
	        </div> <!-- end section-header -->
			
	        <div class="row services-list block-1-2 block-tab-full">
				
	            <div class="col-block service-item" data-aos="fade-up">
	                <div class="service-icon">
	                    <i class="icon-paint-brush"></i>
	                </div>
	                <div class="service-text">
	                    <h3 class="h2">Etudiant</h3>
	                    <p>Nemo cupiditate ab quibusdam quaerat impedit magni. Earum suscipit ipsum laudantium. 
	                    Quo delectus est. Maiores voluptas ab sit natus veritatis ut. Debitis nulla cumque veritatis.
	                    Sunt suscipit voluptas ipsa in tempora esse soluta sint.
	                    </p>
	                </div>
	            </div>
				
	            <div class="col-block service-item" data-aos="fade-up">
	                <div class="service-icon">
	                    <i class="icon-group"></i>
	                </div>
	                <div class="service-text">
	                    <h3 class="h2">Professionnel</h3>
	                    <p>Nemo cupiditate ab quibusdam quaerat impedit magni. Earum suscipit ipsum laudantium. 
	                    Quo delectus est. Maiores voluptas ab sit natus veritatis ut. Debitis nulla cumque veritatis.
	                    Sunt suscipit voluptas ipsa in tempora esse soluta sint.
	                    </p>
	                </div>
	            </div>
				
	            <div class="col-block service-item" data-aos="fade-up">
	                <div class="service-icon">
	                    <i class="icon-megaphone"></i>
	                </div>  
	                <div class="service-text">
	                    <h3 class="h2">Famille</h3>
	                    <p>Nemo cupiditate ab quibusdam quaerat impedit magni. Earum suscipit ipsum laudantium. 
	                    Quo delectus est. Maiores voluptas ab sit natus veritatis ut. Debitis nulla cumque veritatis.
	                    Sunt suscipit voluptas ipsa in tempora esse soluta sint.
	                    </p>
	                </div>
	            </div>
	            
	            <div class="col-block service-item" data-aos="fade-up">
	                <div class="service-icon">
	                    <i class="icon-cube"></i>
	                </div>
	                <div class="service-text">
	                    <h3 class="h2">Saisonnier</h3>
	                    <p>Nemo cupiditate ab quibusdam quaerat impedit magni. Earum suscipit ipsum laudantium. 
	                    Quo delectus est. Maiores voluptas ab sit natus veritatis ut. Debitis nulla cumque veritatis.
	                    Sunt suscipit voluptas ipsa in tempora esse soluta sint.
	                    </p>
	                </div>
	            </div>
				
	        </div> <!-- end services-list -->
			
	    </section> <!-- end s-services -->
		
		
	    <!-- contact
	    ================================================== -->
	    <section id="contact" class="s-contact">
			
	        <div class="overlay"></div>
	        <div class="contact__line"></div>
			
	        <div class="row section-header" data-aos="fade-up">
	            <div class="col-full">
	                <h3 class="subhead">Contactez nous</h3>
	                <h1 class="display-2 display-2--light">Contactez nous si vous avez la moindre question <br>ou simplement pour dire bonjour</h1>
	            </div>
	        </div>
			
	        <div class="row contact-content" data-aos="fade-up">
	            
	            <div class="contact-primary">
					
	                <h3 class="h6"> Envoyez nous un message </h3>
					
	                <form name="contactForm" id="contactForm" method="post" action="" novalidate="novalidate">
	                    <fieldset>
	    				
		                    <div class="form-field">
		                        <input name="contactName" type="text" id="contactName" placeholder="Your Name" value="" aria-required="true" class="full-width">
		                    </div>
		                    <div class="form-field">
		                        <input name="contactEmail" type="email" id="contactEmail" placeholder="Your Email" value=""  aria-required="true" class="full-width">
		                    </div>
		                    <div class="form-field">
		                        <input name="contactSubject" type="text" id="contactSubject" placeholder="Subject" value="" class="full-width">
		                    </div>
		                    <div class="form-field">
		                        <textarea name="contactMessage" id="contactMessage" placeholder="Your Message" rows="10" cols="50"  aria-required="true" class="full-width"></textarea>
		                    </div>
		                    <div class="form-field">
		                        <button class="full-width btn--primary">Submit</button>
		                        <div class="submit-loader">
		                            <div class="text-loader">Envoi en cours...</div>
		                            <div class="s-loader">
		                                <div class="bounce1"></div>
		                                <div class="bounce2"></div>
		                                <div class="bounce3"></div>
		                            </div>
		                        </div>
		                    </div>
	    					
	                    </fieldset>
	                </form>
					
	                <!-- contact-warning -->
	                <div class="message-warning">
	                    Quelque chose ne vas pas ! Essayez encore.
	                </div> 
	            	
	                <!-- contact-success -->
	                <div class="message-success">
	                    Message envoyé, Merci !<br>
	                </div>
					
	            </div> <!-- end contact-primary -->
				
	            <div class="contact-secondary">
	                <div class="contact-info">
						
	                    <h3 class="h6 hide-on-fullwidth">Contact Info</h3>
						
	                    <div class="cinfo">
	                        <h5>On se trouve au : </h5>
	                        <p>
	                            8 Rue Zaater <br>
	                            Sokra
	                        </p>
	                    </div>
						
	                    <div class="cinfo">
	                        <h5>Emailez nous à :</h5>
	                        <p>
	                            horri.slim@gmail.com<br>
	                            slim__horri@hotmail.com
	                        </p>
	                    </div>
						
	                    <div class="cinfo">
	                        <h5>Appelez nous :</h5>
	                        <p>
	                            Mobile 1 : 24 87 88 10<br>
	                            Mobile 2 : 54 87 88 10
	                        </p>
	                    </div>
						
	                    <ul class="contact-social">
	                        <li>
	                            <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
	                        </li>
	                        <li>
	                            <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
	                        </li>
	                        <li>
	                            <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
	                        </li>
	                        <li>
	                            <a href="#"><i class="fa fa-behance" aria-hidden="true"></i></a>
	                        </li>
	                        <li>
	                            <a href="#"><i class="fa fa-dribbble" aria-hidden="true"></i></a>
	                        </li>
	                    </ul> <!-- end contact-social -->
						
	                </div> <!-- end contact-info -->
	            </div> <!-- end contact-secondary -->
				
	        </div> <!-- end contact-content -->
			
	    </section> <!-- end s-contact -->
	
	    <!-- photoswipe background
	    ================================================== -->
	    <div aria-hidden="true" class="pswp" role="dialog" tabindex="-1">
			
	        <div class="pswp__bg"></div>
	        <div class="pswp__scroll-wrap">
				
	            <div class="pswp__container">
	                <div class="pswp__item"></div>
	                <div class="pswp__item"></div>
	                <div class="pswp__item"></div>
	            </div>
				
	            <div class="pswp__ui pswp__ui--hidden">
	                <div class="pswp__top-bar">
	                    <div class="pswp__counter"></div><button class="pswp__button pswp__button--close" title="Close (Esc)"></button> <button class="pswp__button pswp__button--share" title=
	                    "Share"></button> <button class="pswp__button pswp__button--fs" title="Toggle fullscreen"></button> <button class="pswp__button pswp__button--zoom" title=
	                    "Zoom in/out"></button>
	                    <div class="pswp__preloader">
	                        <div class="pswp__preloader__icn">
	                            <div class="pswp__preloader__cut">
	                                <div class="pswp__preloader__donut"></div>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	                <div class="pswp__share-modal pswp__share-modal--hidden pswp__single-tap">
	                    <div class="pswp__share-tooltip"></div>
	                </div><button class="pswp__button pswp__button--arrow--left" title="Previous (arrow left)"></button> <button class="pswp__button pswp__button--arrow--right" title=
	                "Next (arrow right)"></button>
	                <div class="pswp__caption">
	                    <div class="pswp__caption__center"></div>
	                </div>
	            </div>
				
	        </div>
			
	    </div> <!-- end photoSwipe background -->
		
	    <!-- preloader
	    ================================================== -->
	    <div id="preloader">
	        <div id="loader">
	            <div class="line-scale-pulse-out">
	                <div></div>
	                <div></div>
	                <div></div>
	                <div></div>
	                <div></div>
	            </div>
	        </div>
	    </div>
		
	    <!-- JavaScript
	    ================================================== -->
	    <script src="Forms/home form/js/jquery-3.2.1.min.js"></script>
	    <script src="Forms/home form/js/plugins.js"></script>
	    <script src="Forms/home form/js/main.js"></script>
		
	</body>
	
</html>

