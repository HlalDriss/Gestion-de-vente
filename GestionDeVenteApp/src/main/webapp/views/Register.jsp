
<%@ page contentType="text/html;charset=GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>registered</title>
</head>
<body>
	<s:property value="message" />
	<a href="index.jsp">Return to login</a>
	<hr />
	Please register:
	<div style="color: red;">
		<s:fielderror />
		<s:actionerror />
	</div>
	<s:form action="Register" validate="true">
		<s:textfield name="username" label="username" />
		<s:password name="password" label="password" />
		<s:submit value="submit" />
	</s:form>
	<hr />
</body>
</html>