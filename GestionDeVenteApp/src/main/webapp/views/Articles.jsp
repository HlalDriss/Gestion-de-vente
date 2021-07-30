<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Les Article de RayBan</title>

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

<body lang="fr" id="page-top">
  
	<nav style="margin-bottom: 20px" class="navbar navbar-expand-lg   bg-dark ">

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
				<li class="nav-item active"><a class="nav-link" href="#">Home
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

				<!-- Page Heading -->
				<h1 align="center" class="h3 mb-2 text-gray-800">Les Articles disponible sur RayBan</h1>
				

				<!-- DataTales Example -->
				<div class="card shadow mb-4">
			
					<div class="card-body">
						<div lang="fr" class="table-responsive">
							<table lang="fr" class="table table-bordered" id="dataTable" width="100%"
								cellspacing="0">
								 <thead>
			   <tr>
				   <th>Code</th>
				   <th>Nom</th>
				   <th>Description</th>
				   <th>Prix</th>
				   <th>Qte</th>
				  <th>...</th>
			   </tr>
		   </thead>
		   <tbody>
			  <s:iterator value="articles">
			  <tr>
				   <td><s:property value="codeArt" /></td>
				   <td><s:property value="nomArt" /></td>
				   <td><s:property value="descArt" /></td>
				   <td><s:property value="prixArt" /></td>
				   <td><s:property  value="qteArt" /></td>
				   <s:url  action="commander" var="liencom">
				   <s:param name="code">
				   <s:property value="codeArt"/>
				   </s:param>
				   <s:param name="nameArt">
				   <s:property value="nomArt"/>
				   </s:param>
				   <s:param name="prix">
				   <s:property value="prixArt"/>
				   </s:param>
				   <s:param name="qte">
				   <s:property value="qteArt"/>
				   </s:param>
				   </s:url>
				   
				   <td><s:a href="%{liencom}" class="btn btn-success">
		 
				   Commander</s:a></td>
			   </tr>
			  </s:iterator>
		   </tbody>
								
							</table>
						</div>
					</div>
				</div>

			</div>
<div>



<%-- <table class="table">
  <thead>
    <tr>
      <th scope="col">code</th>
      <th scope="col">le nom d'article</th>
      <th scope="col">prix</th>
      <th scope="col">Quantité</th>
    </tr>
  </thead>
  <tbody>
      <s:iterator value="articlesCommander">
			  <tr>
				   <td><s:property value="codeArt" /></td>
				   <td><s:property value="nomArt" /></td>
				   <td><s:property value="prixArt" /></td>
				   <td><s:textfield type="number" name="qte" min="1" max="%{qteArt}" step="1"/></td>
			</tr>
	</s:iterator>
  
  </tbody>
</table> --%>
 


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

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>


 <%-- <!-- Order Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Combien d'article vous voullez ??</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">
        
        
        
        
        </div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.html">Logout</a>
        </div>
      </div>
    </div>
  </div>
 --%>
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
