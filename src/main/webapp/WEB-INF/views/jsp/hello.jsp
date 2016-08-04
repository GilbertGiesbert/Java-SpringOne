<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>HelloSpringOne</title>
</head>

<h1>HelloSpringOne</h1>
 
<c:if test="${not empty name}">
	Hello ${name}
</c:if>

<p>
	<c:if test="${not empty userId}">
		id: ${userId}
	</c:if>
</p>

<p>
	<spring:message code="key.123"/>
</p>
<p>
	<spring:message code="prompt.yes"/>
	<spring:message code="prompt.no"/>
</p>

<p>

	<c:set var="arg1"><spring:message code="prompt.dance"/></c:set>
	<spring:message code="key.feeling" arguments="a,${arg1}"/>
</p>
<p>
	<spring:message code="resource.prop.1"/>
</p>



</body>
</html>