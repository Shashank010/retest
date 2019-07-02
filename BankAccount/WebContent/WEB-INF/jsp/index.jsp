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
<h1>Bank Form</h1>



		<form:form modelAttribute="acct" action="save.obj" method="post">
		
			<div>
				<label for="id">Enter Id</label>
				<div>
					<form:input path="id" id="id"  placeholder="enter" />
		
				</div>
			</div>
			<div>
				<label for="accntNo">Enter accntNo</label>
				<div>
					<form:input path="accntNo" id="accntNo" placeholder="enter accntNo" />
				
				</div>
			</div>
			<div>
				<label for="hotelid">Enter name</label>
				<div>
					<form:input path="name" id="hotelid" placeholder="name" />
				</div>
			</div>
			<div>
				<label for="date">Enter Branch</label>
				<div>
					<form:input path="branch" id="date" placeholder="enter branch" />
				</div>
			</div>
			
			<div>
				<label for="fdate">enter Account Type</label>
				<div>
					<form:input path="accntType" id="fdate" placeholder="enter Account Type" />
				</div>
			</div>
			
			
			
			<div>
				<div>
					<button type="submit">Add</button>
				</div>
			</div>
		</form:form>
</body>
</html>