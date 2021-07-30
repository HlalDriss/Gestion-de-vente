     <%@ page contentType="text/html;charset=GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
   <title>Login</title>
</head>

<body>

<s:actionerror/>
    
<s:property value="message"/>
 <s:url namespace="/" action="Register" var="lien1"></s:url>
	<a href="%{lien1}">Sign up</a>
	<hr/>
Please login:
<s:form validate="true" action="Login" >
<s:textfield name="username" label="username"/>
<s:password name="password" label="password"/>
<s:submit value="submit"/>
</s:form>
<hr/>
</body>
</html>