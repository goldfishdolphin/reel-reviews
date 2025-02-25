<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Reel Reviews</title>
</head>
<body>
	<h1>Welcome to Reel Review Page!</h1>

	These are films:

	<table>
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
</body>
</html>


