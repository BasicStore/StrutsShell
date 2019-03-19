<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Registration Successful</title>
  </head>
  <body>
    <h3>Thank you for registering for a prize.</h3>

    <p>Your registration information: <s:property value="personBean" /> </p>
    
    <p>First name: <s:property value="personBean.firstName" /> </p>
    <p>Last name: <s:property value="personBean.lastName" /> </p>
    <p>Email: <s:property value="personBean.email" /> </p>
    <p>Age: <s:property value="personBean.age" /> </p>
    
    
    <p>Birthday date:<s:date name = "personBean.birthday2" format = "%{getText('struts.date.format')}" /></p>
    
    <p>Birthday date and time <s:date name = "personBean.birthday2" format = "%{getText('MM/dd/YYYY HH:mm')}" /></p>
    
    
    <p><a href="<s:url action='users' />" >Return to home page</a>.</p>
    
    
    <s:property value="#request.doodles" />
    
    
    <p><a href="register.jsp">Please register</a> for our prize drawing.</p>
    
    <a href="<s:url action="listdisplay" />">Click here and see what happens</a>
    
  </body>
</html>