<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="acct" action="searchaccnt.obj" method="post">

Hello U R Account has beeen created
<div>
				<label for="id">Enter Id</label>
				<div>
					<form:input path="id" id="id"  placeholder="enter" />
		
				</div>
			</div>
			<div>
				<div>
					<button type="submit">search</button>
				</div>
			</div>
			
			
			<c:if test="${acct2 ne null}"><!-- 2 -->
			<div>${acct2.name}</div>
			<div>${acct2.id}</div>
			<div>${acct2.accntNo}</div>
			<div>${acct2.branch}</div>
		</c:if> 	
		<c:if test="${acct1 ne null}">
					<tr>
						<th>${acct1.id}</th>
			<!-- 3 -->  <th>${acct1.accntNo}</th>
						<th>${acct1.name}</th>
						<th>${acct1.branch}</th>
						<th>${acct1.accntType}</th>
					</tr>			
		</c:if>
</form:form>
</body>
</html>