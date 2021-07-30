<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Produits</title>
</head>
<body>
   <div>
   <s:form action="save" method="post">
     <s:textfield label="code" name="article.codeArt"></s:textfield>
     <s:textfield label="Nom de l'artice" name="article.nomArt"></s:textfield>
     <s:textfield label="description" name="article.descArt"></s:textfield>
     <s:textfield label="Prix" name="article.prixArt"></s:textfield>
     <s:textfield label="Quantité" name="article.qteArt"></s:textfield>
     <s:submit value="save"></s:submit>
   
   </s:form>
   </div>
   <div>
	   <table border="1" id="table-1">
		   <thead>
			   <tr>
				   <th>Code</th>
				   <th>Nom</th>
				   <th>Description</th>
				   <th>Prix</th>
				   <th>Qte</th>
				  
			   </tr>
		   </thead>
		   <tbody>
			  <s:iterator value="articles">
			  <tr>
				   <td><s:property value="codeArt" /></td>
				   <td><s:property value="nomArt" /></td>
				   <td><s:property value="descArt" /></td>
				   <td><s:property value="prixArt" /></td>
				   <td><s:property value="qteArt" /></td>
			   </tr>
			  </s:iterator>
		   </tbody>
		   <tfoot>
			   <tr>
				  <th>Code</th>
				   <th>Nom</th>
				   <th>Description</th>
				   <th>Prix</th>
				   <th>Qte</th>
			   </tr>
		   </tfoot>
	   </table>
   </div>
</body>
</html>

