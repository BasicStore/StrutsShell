<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Error Page</title>
  </head>
  <body>
    <h3>NULLPOINTER NULLPOINTER NULLPOINTER - verify the generic exception is not displayed for a specifric exception</h3>

	<img src="<s:url value="./images/error.jpeg"/>" align="absmiddle" alt="<s:text name="image.desc.text"></s:text>"/>

	<center>
        <h1>Sorry, unexpected exception occurred:</h1>
        <h2>Exception name: ${exception}</h2>
        <p>Exception stack trace: ${exceptionStack}</p>
    </center>

    <p><a href="<s:url action='users' />" >Return to home page</a>.</p>
    
  </body>
</html>