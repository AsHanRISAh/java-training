<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<P>booked successfully</P>
	<table style="width: 10%; border: 1px">
		<tr>
			<td>Id</td>
			<td>UserId</td>
			<td>RouteId</td>
			<td>Date</td>
		</tr>
		<c:forEach items="${ride}" var="ride"><tr>
			<td>${ride.rideId}</td>
		<!-- 	<td><input type="hidden" name="userid" value=${userId} ></td> -->
			 <td>${ride.userId}</td> 
			<td>${ride.routeId}</td>
			<td>${ride.date}</td>
		</tr>
</c:forEach>

	</table>

</body>
</html>