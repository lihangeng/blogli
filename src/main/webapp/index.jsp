<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<html>
<head>
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
<!-- load JS files -->
<script src="js/jquery-1.11.3.min.js"></script>
<!-- jQuery (https://jquery.com/download/) -->
<script src="js/tether.min.js"></script>
<!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h -->
<script src="js/bootstrap.min.js"></script>
<!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->
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
					<div class="focus">
						<a href="getblogdetail.html?blogid=${blog.id}"> <img
							class="thumb" src="${blog.imageurl}" alt="${blog.title}"></a>
					</div>
					<span class="note">${blog.summary}...</span>
					<p class="auth-span">
						<span class="muted"><i class="fa fa-clock-o"></i>
							${blog.createTime}</span> <span class="muted"><i
							class="fa fa-eye"></i> ${blog.hits}浏览</span>
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
			</div>
			<!-- row -->
		</div>
		<%@include file="sidebar.jsp"%>>
	</section>
<%@include file="foot.jsp" %>
</body>
</html>