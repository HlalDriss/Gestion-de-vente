<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Articles</title>

<!-- Custom fonts for this template -->
<link href="assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="assets/css/sb-admin-2.min.css" rel="stylesheet">

<!-- Custom styles for this page -->
<link href="assets/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">

</head>

<body id="page-top">
  
	<nav class="navbar navbar-expand-lg   bg-dark ">

		<!-- Navbar brand -->
		<a class="navbar-brand" href="#">
		   <img height="100px" width="100px" src="assets/img/RayBan.png" />
		</a>

		<!-- Collapse button -->
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#basicExampleNav" aria-controls="basicExampleNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<!-- Collapsible content -->
		<div class="collapse navbar-collapse" id="basicExampleNav">

			<!-- Links -->
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link " href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item">
				   <s:url namespace="/" action="articles" var="lien1"></s:url>
    
				  <s:a class="nav-link" href="%{lien1}">Articles</s:a></li>
				<li class="nav-item"><a class="nav-link" href="#">Mon
						Compte</a></li>

				<!-- Dropdown -->


			</ul>
			<!-- Links -->

			<form class="form-inline">
				<div class="md-form my-0">
					<input class="form-control mr-sm-2" type="text"
						placeholder="Rechercher" aria-label="Search">
				</div>
			</form>
		</div>
		<!-- Collapsible content -->

	</nav>
	<div id="wrapper">

		<div id="content-wrapper" class="d-flex flex-column">
			<div class="container-fluid">


				<div class="card shadow mb-4">
					
					<div style="text-align: center" class="card-body">
									
				<h1 class="h3 mb-2 text-gray-800">Bienvenue dans RayBan .</h1>
				<p class="mb-4">
					Commandez chez nos et gerer votre commande .
				</p>

					
	
					</div>
				</div>

			</div>

			<div id="content"></div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<footer class="sticky-footer bg-white">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright &copy; RayBan 2021</span>
					</div>
				</div>
			</footer>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button -->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>


	<!-- Bootstrap core JavaScript-->
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="assets/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="assets/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="assets/vendor/datatables/jquery.dataTables.min.js"></script>
	<script src="assets/vendor/datatables/dataTables.bootstrap4.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="assets/js/demo/datatables-demo.js"></script>

</body>

</html>
