<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta content="width=device-width, initial-scale=1.0" name="viewport" />

<title>REVATURE Delete Batch</title>
<meta content="" name="description" />
<meta content="" name="keywords" />

<!-- Favicons -->
<link href="assets/img/favicon.png" rel="icon" />
<link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon" />

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet" />

<script src="https://kit.fontawesome.com/6ce3a30560.js"
	crossorigin="anonymous"></script>

<!-- Vendor CSS Files -->
<link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet" />
<link href="assets/vendor/aos/aos.css" rel="stylesheet" />
<link href="assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
	rel="stylesheet" />
<link href="assets/vendor/boxicons/css/boxicons.min.css"
	rel="stylesheet" />
<link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet" />
<link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet" />

<!-- Template Main CSS File -->
<link href="assets/css/style.css" rel="stylesheet" />

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
				<a href="index2.html">Revature</a>
			</h1>
			<!-- Uncomment below if you prefer to use an image logo -->
			<!-- <a href="index.html" class="logo me-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

			<nav id="navbar" class="navbar order-last order-lg-0">
				<ul>
					<li><a class="active" href="index2.jsp">Home</a></li>
					<li class="dropdown"><a href="#"><span>Operations</span> <i
							class="bi bi-chevron-down"></i></a>
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

	<main id="main">
		<!-- ======= Breadcrumbs ======= -->
		<div class="breadcrumbs" data-aos="fade-in">
			<div class="container">
				<h2>Add Batch</h2>
			</div>
		</div>
		<!-- End Breadcrumbs -->

		<section class="vh-100" style="background-color: #eee">
			<div class="container h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-lg-12 col-xl-11">
						<div class="card text-black" style="border-radius: 25px">
							<div class="card-body p-md-5">
								<div class="row justify-content-center">
									<div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
										<p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">
											Delete Batch Details</p>
										<form method="get" action="DeleteBatch" class="mx-1 mx-md-4">
											<div class="d-flex flex-row align-items-center mb-4">
												<i class="fas fa-book fa-lg me-3 fa-fw"></i>
												<div class="form-outline flex-fill mb-0">
													<input type="text" name="oldTopicName" id="form3Example1c"
														class="form-control" placeholder="Enter Old Batch Name"
														required />
												</div>
											</div>



											<div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
												<input type="submit" value="delete Batch"
													class="btn btn-primary btn-lg">
											</div>
										</form>
										<!--   <div
											class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">
											<img src="my_img/add-animate.svg" class="img-fluid"
												alt="Sample image" />
										</div> -->
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</main>
	<!-- End #main -->

	<!-- ======= Footer ======= -->
	<footer id="footer">
		<div class="footer-top">
			<div class="container">
				<div class="row" style="justify-content: space-around">
					<div class="col-lg-3 col-md-6 footer-contact">
						<h3>Admin</h3>
						<p>
							A108 Krunal Zodape <br /> New York, NY 535022<br /> United
							States <br /> <br /> <strong>Phone:</strong> +1 5589 55488 55<br />
							<strong>Email:</strong> info@example.com<br />
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
