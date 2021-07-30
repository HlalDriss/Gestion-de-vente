<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type="text/css" href="assets/styles/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="assets/styles/font-awesome/css/font-awesome.min.css" />

    <script type="text/javascript" src="assets/styles/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="assets/styles/bootstrap/js/bootstrap.min.js"></script>
    
<!-- Custom fonts for this template -->
<link href="assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="assets/css/sb-admin-2.min.css" rel="stylesheet">

<!-- Custom styles for this page -	->
<link href="assets/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">
    
</head>
<body>

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


<div class="container">

<!-- Export a Table to PDF - START -->
<link rel="stylesheet" type="text/css" href="assets/styles/font-awesome/css/font-awesome.min.css" />

<div class="container">
    <button id="exportButton" class="btn btn-lg btn-danger clearfix"><span class="fa fa-file-pdf-o"></span> Export to PDF</button>

    <table id="exportTable" class="table table-hover">
        <thead>
            <tr>
                <th>Nom</th>
                <th>Prix </th>
                
            </tr>
        </thead>
        <tbody>
             <s:iterator value="products" var="product">
                  <tr>
				      <th scope="row"> <s:property value="key.nomArt"/></th>
				      <td><s:property value="key.prixArt"/> </td>
				     
				 </tr>
             </s:iterator> 
             <tr>
              <td>Total:</td><td><s:property value="total"/> </td>
             </tr>
                    </tbody>
    </table>
</div>

<!-- you need to include the shieldui css and js assets in order for the components to work -->
<link rel="stylesheet" type="text/css" href="http://www.shieldui.com/shared/components/latest/css/light/all.min.css" />
<script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js"></script>
<script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/js/jszip.min.js"></script>

<script type="text/javascript">
    jQuery(function ($) {
        $("#exportButton").click(function () {
            // parse the HTML table element having an id=exportTable
            var dataSource = shield.DataSource.create({
                data: "#exportTable",
                schema: {
                    type: "table",
                    fields: {
                    	Nom: { type: String },
                        Prix: { type: Number },
                    }
                }
            });

            // when parsing is done, export the data to PDF
            dataSource.read().then(function (data) {
                var pdf = new shield.exp.PDFDocument({
                    author: "PrepBootstrap",
                    created: new Date()
                });

                pdf.addPage("a4", "portrait");

                pdf.table(
                    50,
                    50,
                    data,
                    [
                        { field: "Nom", title: "Nom d'Article", width: 200 },
                        { field: "Prix", title: "Prix", width: 200 }
                    ],
                    {
                        margins: {
                            top: 50,
                            left: 50
                        }
                    }
                );

                pdf.saveAs({
                    fileName: "PrepBootstrapPDF"
                });
            });
        });
    });
</script>

<style>
    #exportButton {
        border-radius: 0;
    }
</style>

<!-- Export a Table to PDF - END -->

</div>

</body>
</html>