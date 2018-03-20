<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ page contentType="text/html; charset=UTF-8"%>
<title>Classic - Responsive Bootstrap 4.0 Template</title>

<!-- load stylesheets -->
<link rel="stylesheet"
	href="http://fonts.useso.com/css?family=Open+Sans:300,400">
<!-- Google web font "Open Sans" -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Bootstrap style -->
<link rel="stylesheet" href="css/templatemo-style.css">
<!-- Templatemo style -->
<link rel="stylesheet" href="css/blogbootstrap.css">
<link rel="stylesheet" href="css/chromagallery.css">
<link rel="stylesheet" href="css/editormd.preview.css">
<link rel="stylesheet" href="css/jingmi.css">
<link rel="stylesheet" href="css/lanrenzhijia.css">
<link rel="stylesheet" href="css/modifyeditormd.css">
<link rel="stylesheet" href="css/newlypublished.css">
<link rel="stylesheet" href="css/reveal.css">
<link rel="stylesheet" href="css/style.css">



<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
</head>

<body>
	<!-- 标题和导航栏 -->
	<div class="tm-header">
		<div class="container-fluid">
			<div class="tm-header-inner">
				<a href="#" class="navbar-brand tm-site-name">行走</a>

				<!-- navbar -->
				<nav class="navbar tm-main-nav">

					<button class="navbar-toggler hidden-md-up" type="button"
						data-toggle="collapse" data-target="#tmNavbar">&#9776;</button>

					<div class="collapse navbar-toggleable-sm" id="tmNavbar">
						<ul class="nav navbar-nav">
							<li class="nav-item active"><a href="index.jsp"
								class="nav-link">主页</a></li>
							<li class="nav-item"><a href="about.jsp" class="nav-link">关于</a>
							</li>
							<li class="nav-item"><a href="blog.jsp" class="nav-link">博客</a>
							</li>
							<li class="nav-item"><a href="contact.jsp" class="nav-link">联系</a>
							</li>
						</ul>
					</div>

				</nav>

			</div>
		</div>
	</div>
	<!-- 大图 -->
	<div class="tm-home-img-container">
		<img src="img/tm-home-img.jpg" alt="Image"
			class="hidden-lg-up img-fluid">
	</div>
	<!-- 博客内容 -->
	<section class="tm-section">
		<div class="container-fluid">

			<c:forEach var="blog" items="${blogs}">
				<article class="excerpt">
					<header>
						<a class="label label-important"
							href="getcategory.html?categoryid=${blog.categoryId}">${blog.blogCategory.cName}<i
							class="label-arrow"></i></a>
						<h2>
							<a href="getblogdetail.html?blogid=${blog.id}"
								title="${blog.title}">${blog.title}</a>
						</h2>
					</header>
					<span class="note">${blog.summary}...</span>
					<p class="auth-span">
						<span class="muted"><i class="fa fa-clock-o"></i>
							${blog.createTime}</span> <span class="muted"><i class="fa fa-eye"></i>
							${blog.hits}浏览</span>
				</article>

			</c:forEach>
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

					<div class="tm-content-box">
						<img src="img/tm-img-310x180-1.jpg" alt="Image"
							class="tm-margin-b-20 img-fluid">
						<h4 class="tm-margin-b-20 tm-gold-text">Lorem ipsum dolor #1</h4>
						<p class="tm-margin-b-20">Aenean cursus tellus mauris, quis
							consequat mauris dapibus id. Donec scelerisque porttitor pharetra</p>
						<a href="#" class="tm-btn text-uppercase">Detail</a>
					</div>

				</div>

				<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

					<div class="tm-content-box">
						<img src="img/tm-img-310x180-2.jpg" alt="Image"
							class="tm-margin-b-20 img-fluid">
						<h4 class="tm-margin-b-20 tm-gold-text">Lorem ipsum dolor #2</h4>
						<p class="tm-margin-b-20">Aenean cursus tellus mauris, quis
							consequat mauris dapibus id. Donec scelerisque porttitor pharetra</p>
						<a href="#" class="tm-btn text-uppercase">Read More</a>
					</div>

				</div>

				<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

					<div class="tm-content-box">
						<img src="img/tm-img-310x180-3.jpg" alt="Image"
							class="tm-margin-b-20 img-fluid">
						<h4 class="tm-margin-b-20 tm-gold-text">Lorem ipsum dolor #3</h4>
						<p class="tm-margin-b-20">Aenean cursus tellus mauris, quis
							consequat mauris dapibus id. Donec scelerisque porttitor pharetra</p>
						<a href="#" class="tm-btn text-uppercase">Detail</a>
					</div>

				</div>

				<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

					<div class="tm-content-box">
						<img src="img/tm-img-310x180-4.jpg" alt="Image"
							class="tm-margin-b-20 img-fluid">
						<h4 class="tm-margin-b-20 tm-gold-text">Lorem ipsum dolor #4</h4>
						<p class="tm-margin-b-20">Aenean cursus tellus mauris, quis
							consequat mauris dapibus id. Donec scelerisque porttitor pharetra</p>
						<a href="#" class="tm-btn text-uppercase">Read More</a>
					</div>

				</div>
			</div>
			<!-- row -->

		</div>
	</section>

	<footer class="tm-footer">
		<div class="container-fluid">
			<div class="row">

				<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

					<div class="tm-footer-content-box">
						<h3 class="tm-gold-text tm-title tm-footer-content-box-title">Proin
							eu posuere felis</h3>
						<div class="tm-gray-bg">
							<p>Classic is free HTML CSS website template provided by
								templatemo for everyone. Feel free to use it.</p>
							<p>Aenean cursus tellus mauris, quis consequat mauris dapibus
								id. Donec scelerisque porttitor pharetra.</p>
							<p>
								<strong>Danny Egg (Executive)</strong>
							</p>
						</div>
					</div>

				</div>

				<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">
					<div class="tm-footer-content-box tm-footer-links-container">

						<h3 class="tm-gold-text tm-title tm-footer-content-box-title">Nulla
							tortor dolor</h3>
						<nav>
							<ul class="nav">
								<li><a href="#" class="tm-footer-link">Tincidunt non
										faucibus</a></li>
								<li><a href="#" class="tm-footer-link">Vestibulum
										tempor</a></li>
								<li><a href="#" class="tm-footer-link">Fusce non turpis
										euismod</a></li>
								<li><a href="#" class="tm-footer-link">Lorem ipsum
										dolor sit</a></li>
								<li><a href="#" class="tm-footer-link">Nam in augue
										consectetur</a></li>
								<li><a href="#" class="tm-footer-link">Text Link Color
										#CCCC66</a></li>
							</ul>
						</nav>

					</div>

				</div>

				<!-- Add the extra clearfix for only the required viewport 
                        http://stackoverflow.com/questions/24590222/bootstrap-3-grid-with-different-height-in-each-item-is-it-solvable-using-only
                    -->
				<div class="clearfix hidden-lg-up"></div>

				<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

					<div class="tm-footer-content-box">

						<h3 class="tm-gold-text tm-title tm-footer-content-box-title">Etiam
							mollis ornare</h3>
						<p class="tm-margin-b-30">Aenean cursus tellus mauris, quis
							consequat mauris dapibus id. Donec scelerisque porttitor
							pharetra.</p>
						<hr class="tm-margin-b-30">
						<p class="tm-margin-b-30">Aenean cursus tellus mauris, quis
							consequat mauris dapibus id. Donec scelerisque porttitor
							pharetra.</p>
						<hr class="tm-margin-b-30">
						<p class="tm-margin-b-30">Aenean cursus tellus mauris, quis
							consequat mauris dapibus id. Donec scelerisque porttitor
							pharetra.</p>
						<a href="#" class="tm-btn tm-btn-gray text-uppercase">Read
							More</a>

					</div>

				</div>

				<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

					<div class="tm-footer-content-box">

						<h3 class="tm-gold-text tm-title tm-footer-content-box-title">Fusce
							non turpis</h3>
						<div class="tm-margin-b-30">
							<img src="img/tm-img-100x100-1.jpg" alt="Image"
								class="tm-footer-thumbnail"> <img
								src="img/tm-img-100x100-2.jpg" alt="Image"
								class="tm-footer-thumbnail"> <img
								src="img/tm-img-100x100-3.jpg" alt="Image"
								class="tm-footer-thumbnail"> <img
								src="img/tm-img-100x100-4.jpg" alt="Image"
								class="tm-footer-thumbnail"> <img
								src="img/tm-img-100x100-5.jpg" alt="Image"
								class="tm-footer-thumbnail"> <img
								src="img/tm-img-100x100-6.jpg" alt="Image"
								class="tm-footer-thumbnail">
						</div>
						<p class="tm-margin-b-20">Curabitur dui massa, aliquam quis mi
							sed, tempor vulputate tellus. Sed vestibulum non neque.</p>
						<a href="#" class="tm-btn tm-btn-gray text-uppercase">Browse</a>

					</div>

				</div>


			</div>

			<div class="row">
				<div class="col-xs-12 tm-copyright-col">
					<p class="tm-copyright-text">
						Copyright 2016 Your Company Name. More Templates <a
							href="http://www.cssmoban.com/" target="_blank"
							title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a> - Collect from <a
							href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿"
							target="_blank">ç½é¡µæ¨¡æ¿</a>
					</p>
				</div>
			</div>
		</div>
	</footer>

	<!-- load JS files -->
	<script src="js/jquery-1.11.3.min.js"></script>
	<!-- jQuery (https://jquery.com/download/) -->
	<script src="js/tether.min.js"></script>
	<!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->

</body>
</html>