<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>  

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="./js/global.js"></script>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <sx:head  />
    <title>Register</title>
  </head>
  <body>
    <h3>Register for a prize by completing this form.</h3>
    
    <p>Session Sheep1 = ${state.sheep.sheep1}</p>
    <p>Session Sheep2 = ${state.sheep.sheep2}</p>    
	
	<p>Testing internationalization from the property --> <s:property value = "getText('internatmsg')"/></p>

	
    <s:form action="register">
      <s:textfield name="personBean.firstName" key="firstname"/>
      <s:textfield key="lastName" name="personBean.lastName" value="%{getText('lastname')}" />
      <s:textfield name="personBean.email"  key="email" />  
      <s:textfield name="personBean.age"  key="declared-age" />
      
      <sx:datetimepicker name="personBean.birthday2" key="birthday" displayFormat="%{getText('struts.date.format')}"/>
      <s:submit  onclick="doSomeJS()"/>
    </s:form>	

	<p style="color: red; font-weight: bold">${dodgy}</p>    
    
  </body>
</html>

