<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>List Page</title>
  </head>
  <body>
    <h3>this is the list page....</h3>

	<ol>
		<s:iterator value="comboMeals">
		  <li><s:property /></li>
		</s:iterator>
	</ol>

    <p><h3>this is another list....</h3></p>

	<ol>
		<s:iterator value="peopleList">
	     		<li><s:property value="lastName"/>, <s:property value="firstName"/></li>
	   	</s:iterator>
    </ol>
    
    <p><h3>the same list as a table....</h3></p>
    
	    <table border="solid, red, 1px">
	        <tr>
		    	<th><s:text name="firstname" /></th>
		    	<th><s:text name="lastname" /></th>
	    	</tr>	    	
	    	<s:iterator value="peopleList">
	    	<tr>
		    	<td><s:property value="lastName"/></td>
		    	<td><s:property value="firstName"/></td>
	    	</tr>
	    	</s:iterator>
	    </table>
	   
	   <p><h3>sheep values...fetch these from session, then need to add drop down here, then add a form with corresponding values in FormReaderAction</h3></p>
	   <p>Sheep1 = ${mySheep.sheep1}</p>
	   <p>Sheep1 = ${mySheep.sheep2}</p>
	   
	   
	   <p>Sheep within a request scope variable initializing this component <s:property value="#request.mySheep.sheep1" /></p>
	   
	   <s:form action="formReader">
	      <s:textfield name="sheep.sheep1" key="sheep1" value="%{#request.mySheep.sheep1}" />
	      <s:select    label="%{getText('select-country')}"
				       name="sheep.countryFrom"
				       headerKey="0" headerValue="%{getText('select-country')}" 
				       list="%{countriesList}" ></s:select>
		  
		  <s:checkbox name="sheep.black" fieldValue="true" value="true" label="Sheep colour"/>
		  
		  <s:radio label="%{getText('favourite-field')}" name="sheep.favouriteField" list="%{favouriteFieldsList}" value="defaultFavouriteFieldValue"/>
		  
		  <s:select    label="%{getText('squash-racket')}"
				       name="sheep.squashRacket" required="true"
				       headerKey="0" headerValue="%{getText('squash-racket')}" 
				       list="%{squashRacketEnumList}" 
					   listKey="val" listValue="getText('SquashRacket.' + val)" >
		  </s:select>
	      
	      <s:submit />
       </s:form>	
    
  </body>
</html>