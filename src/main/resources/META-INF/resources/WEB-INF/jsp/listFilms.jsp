<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Reel Reviews</title>
<link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
<div  class="container">
	<h1>Welcome to Reel Review Page!</h1>
	These are films:

	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Year</th>
				<th>Director</th>
				<th>Stars</th>
				<th>Reviews</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${films}" var="film">
				<tr>
					<td>${film.id}</td>
					<td>${film.title}</td>
					<td>${film.year}</td>
					<td>${film.director}</td>
					<td>${film.stars}</td>
					<td>${film.review}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	</div>
	<script src="webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>


