<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta content="width=device-width, initial-scale=1.0" name="viewport" />

<title>REVATURE</title>
<meta content="" name="description" />
<meta content="" name="keywords" />

<!-- Favicons -->
<link href="my_img/fav_icon.png" rel="icon">
<link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">


<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet" />

<!-- Vendor CSS Files -->
<link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
<link href="assets/vendor/aos/aos.css" rel="stylesheet">
<link href="assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
	rel="stylesheet">
<link href="assets/vendor/boxicons/css/boxicons.min.css"
	rel="stylesheet">
<link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
<link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

<!-- Template Main CSS File -->
<link href="assets/css/style.css" rel="stylesheet">

<!-- =======================================================
  * Template Name: Mentor - v4.10.0
  * Template URL: https://bootstrapmade.com/mentor-free-education-bootstrap-theme/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>
	<!-- ======= Header ======= -->
	<header id="header" class="fixed-top">
		<div class="container d-flex align-items-center">
			<h1 class="logo me-auto">
				<a href="index2.jsp">CodeTech</a>
			</h1>
			<!-- Uncomment below if you prefer to use an image logo -->
			<!-- <a href="index.html" class="logo me-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

			<nav id="navbar" class="navbar order-last order-lg-0">
				<ul>
					<li><a class="active" href="index2.jsp">Home</a></li>
					<li class="dropdown"><a href="#"><span>Operations</span>
							<i class="bi bi-chevron-down"></i></a>
						<ul>
							<li><a href="showBatches.jsp">Show All Batch Details</a></li>
							<li><a href="addBatch.jsp">Add Batch</a></li>
							<li><a href="editBatch.jsp">Update Batch</a></li>
							<li><a href="deleteBatch.jsp">Delete Batch</a></li>
						</ul></li>

				</ul>
				<i class="bi bi-list mobile-nav-toggle"></i>
			</nav>
			<!-- .navbar -->

			<a href="landingPage.jsp" class="get-started-btn">Logout</a>
		</div>
	</header>
	<!-- End Header -->

	<!-- ======= Hero Section ======= -->
	<section id="hero"
		class="d-flex justify-content-center align-items-center">
		<div class="container position-relative" data-aos="zoom-in"
			data-aos-delay="100">
			<h1>Welcome, Admin</h1>
			<h2>
				We are team of talented designers <br>developing freshers job
				ready</br>
			</h2>
			<a href="landingPage.html" class="btn-get-started">Logout</a>
		</div>
	</section>
	<!-- End Hero -->

	<main id="main">
		<!-- ======= About Section ======= -->

		<!-- End About Section -->

		<!-- ======= Counts Section ======= -->
		<section id="counts" class="counts section-bg">
			<div class="container">
				<div class="row counters">
					<div class="col-lg-3 col-6 text-center">
						<span data-purecounter-start="0" data-purecounter-end="1232"
							data-purecounter-duration="1" class="purecounter"></span>
						<p>Trainer</p>
					</div>

					<div class="col-lg-3 col-6 text-center">
						<span data-purecounter-start="0" data-purecounter-end="64"
							data-purecounter-duration="1" class="purecounter"></span>
						<p>Courses</p>
					</div>
				</div>
			</div>
		</section>
		<!-- End Counts Section -->
	</main>
	<!-- End #main -->

	<!-- ======= Footer ======= -->
	<footer id="footer">
		<div class="footer-top">
			<div class="container">
				<div class="row" style="justify-content: space-around;">
					<div class="col-lg-3 col-md-6 footer-contact">
						<h3>Admin</h3>
						<p>
							A108 Krunal Zodape <br /> New York, NY 535022<br /> United
							States <br />
							<br /> <strong>Phone:</strong> +1 5589 55488 55<br /> <strong>Email:</strong>
							info@example.com<br />
						</p>
					</div>

					<div class="col-lg-2 col-md-6 footer-links">
						<h4>Useful Links</h4>
						<ul>
							<li><i class="bx bx-chevron-right"></i> <a href="index2.jsp">Home</a>
							</li>
							<li><i class="bx bx-chevron-right"></i> <a
								href="">Register New Trainer</a></li>
						</ul>
					</div>

					<div class="col-lg-3 col-md-6 footer-links">
						<h4>Operations</h4>
						<ul>
							<li><i class="bx bx-chevron-right"></i> <a
								href="showbatches.jsp">Show All Batches</a></li>
							<li><i class="bx bx-chevron-right"></i> <a
								href="addBatch.jsp">Add Batches</a></li>
							<li><i class="bx bx-chevron-right"></i> <a
								href="deleteBatch.jsp">Delete Batch</a></li>
							<li><i class="bx bx-chevron-right"></i> <a
								href="editBatch.jsp">Edit Batch</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<div class="container d-md-flex py-4">
			<div class="me-md-auto text-center text-md-start">
				<div class="copyright">
					&copy; Copyright <strong><span>CodeTech</span></strong>. All Rights
					Reserved
				</div>
				<div class="credits">
					<!-- All the links in the footer should remain intact. -->
					<!-- You can delete the links only if you purchased the pro version. -->
					<!-- Licensing information: https://bootstrapmade.com/license/ -->
					<!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/mentor-free-education-bootstrap-theme/ -->
					Designed by <a>Krunal Zodape</a>
				</div>
			</div>
			<div class="social-links text-center text-md-right pt-3 pt-md-0">
				<a href="#" class="twitter"><i class="bx bxl-twitter"></i></a> <a
					href="#" class="facebook"><i class="bx bxl-facebook"></i></a> <a
					href="#" class="instagram"><i class="bx bxl-instagram"></i></a> <a
					href="#" class="google-plus"><i class="bx bxl-skype"></i></a> <a
					href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
			</div>
		</div>
	</footer>
	<!-- End Footer -->

	<div id="preloader"></div>
	<a href="#"
		class="back-to-top d-flex align-items-center justify-content-center"><i
		class="bi bi-arrow-up-short"></i></a>

	<!-- Vendor JS Files -->
	<script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
	<script src="assets/vendor/aos/aos.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
	<script src="assets/vendor/php-email-form/validate.js"></script>

	<!-- Template Main JS File -->
	<script src="assets/js/main.js"></script>
</body>
</html>
