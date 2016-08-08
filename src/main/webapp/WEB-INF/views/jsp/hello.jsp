<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>HelloSpringOne</title>
</head>

<h1>HelloSpringOne</h1>

<c:set var="varName" value="${not empty name ? name : 'name not available'}"/>
<c:set var="varMessage" value="${not empty message ? message : 'message not available'}"/>
<c:set var="varUserId" value="${not empty userId ? userId : 'userId not available'}"/>

<c:set var="varUserList">
	<c:choose>
		<c:when test="${not empty userList}">
			<ul>
				<c:forEach items="${userList}" var="user">
					<li>${user.name}</li>
				</c:forEach>
			</ul>
		</c:when>
		<c:otherwise>
			user list not available
		</c:otherwise>
	</c:choose>
</c:set>


<p>name: ${varName}</p>

<p>message: ${varMessage}</p>

<p>userId: ${varUserId}</p>

<p>userList: ${varUserList}</p>



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