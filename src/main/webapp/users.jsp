<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <title>User Information</title>
        
        <link rel="stylesheet" type="text/css" href="./css/global.css"/>
        
        
        <style>
            body{
                 font-family: verdana;
            }
         
            table {
                width: 500px;
                 
            }
             
            table, th, td {
                border: 1px solid black;
                padding: 2px;
            }
             
            th{
                background-color: #00439A;
                color : #FFFFFF;
            }
             
            tr.odd{
                background-color: #CFCFCF;
            }
             
            tr.even{
                background-color: #1076F5;
            }
        </style>
        
    </head>
    <body>
    <h1>User Information</h1>   
    <table>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
            <th>Gender</th>
        </tr> 
        <s:iterator value="users">
        <tr class="<s:if test="id%2==0">even</s:if><s:else>odd</s:else>">
            <td align="center"><s:property value="id"/></td>
            <td><s:property value="firstName"/></td>
            <td><s:property value="lastName"/></td>
            <td align="center"><s:property value="age"/></td>           
            <td align="center"><s:if test="gender == 'Male'">Male</s:if><s:else>Female</s:else></td>
        </tr>
        </s:iterator>
    </table>
    
    <h3>Ways of accessing a message:</h3>
    <h2 class="mycss"><s:text name="message" /></h2>
	<h2 class="mycss2"><s:property value="message" /></h2>
    <h2>This value is obtained directly from JSP: <s:property value = "getText('internatmsg')" /></h2>

    <p>THE SESSION VAL STATE X VALUE = ${state.x}</p>
    <p>Sheep1 = ${state.sheep.sheep1}</p>
    <p>Sheep2 = ${state.sheep.sheep2}</p>
    
    <ul>
		<li>
		  <s:url action = "users" var = "myurl">
	         <s:param name="request_locale">en</s:param>
	      </s:url>
	
	      Click <a href = '<s:property value = "#myurl"/>'>here </a> to greet in English
       </li>
       <li>
		  <s:url action = "users" var = "myurl2">
	         <s:param name="request_locale">fr</s:param>
	      </s:url>
	
	      Click <a href = '<s:property value = "#myurl2"/>'>here </a> to greet in French
       </li>
    </ul>
    
    <p><a href="register.jsp">Please register</a> for our prize drawing.</p>
        
    
        
    <img src="<s:url value="./images/cricket.jpg"/>" align="absmiddle" alt="<s:text name="image.desc.text"></s:text>"/>
        
        
    </body>
</html>