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

</body>
</html>