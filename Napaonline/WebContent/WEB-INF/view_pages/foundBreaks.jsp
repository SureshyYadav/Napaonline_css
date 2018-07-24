<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
    
<c:if test="${!empty breaksList}">
<h2> Car Details</h2>
	<table class="tg">
	<tr>
		<th width="80">Part</th>
		<th width="120">Description</th>
		<th width="120">Price</th>
		
	</tr>
	<c:forEach items="${breaksList}" var="breaks">
		<tr>
			<td><c:out escapeXml="false" value="${breaks.part}"/></td>
			<td><c:out escapeXml="false" value="${breaks.description}"/></td>
			<td><c:out escapeXml="false" value="${breaks.price}"/></td>
			
		</tr>
	</c:forEach>
	</table>
	
</c:if>
</table>
</body>
</html>