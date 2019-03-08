<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page contentType="text/html;charset=UTF-8"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Currency Conversion Factor</title>
</head>
<body>
<h2><spring:message code="lbl.page" text="Add Currency Conversion Factor" /></h2>
    <br/>
<form:form method="POST" modelAttribute="factor">
<table>

 <tr>
    <td><spring:message code="lbl.currency" text="Currency Code" /></td>
    <td><form:input path="currency" /></td>
  </tr>
  <tr>
     <td><spring:message code="lbl.factor" text="Conversion Factor" /></td>
      <td><form:input path="factor" /></td>
 </tr>
 <tr>
     <td colspan="2"><input type="submit" value="Submit"/></td>
 </tr>
<!-- <input type="text" name="currency"><br>
<input type="text" name="factor" > <br>
<input type="submit" name="Submit" ><br> -->
</table>
</form:form>

</body>
</html>