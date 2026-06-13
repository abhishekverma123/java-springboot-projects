
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<h1>This is the signup page</h1>
<!--
 <a href = "/registrationPage"> Registration Page!</a>
 -->
<form:form action= "done" modelAttribute= "car">
    Car Number:
    <form:input path="RegisterationNumber" />
	<br />
	<br />
    Car Name:
    <form:select path="CarName">
		<form:option value="Seltos"></form:option>
		<form:option value="Verna"></form:option>
	   <form:option value="Honda"></form:option>
	</form:select>
    <br />
	<br />
	
    Covered In Warranty:
    <form:select path="CarWork">
		<form:option value="Yes"></form:option>
		<form:option value="No"></form:option>
	</form:select>
	<br />
	<br />
	Any Remarks: 
	<form:input path="CarDetails"/>
	<br />
	<br />
	<input type="submit">
</form:form>
</html>
