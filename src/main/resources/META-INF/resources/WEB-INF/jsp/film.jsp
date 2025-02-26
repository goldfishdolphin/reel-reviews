<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Reel Reviews</title>
<link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
<div  class="container">
<h1>Add details of a new film</h1>
<form method ="post">
Title: <input type="text" name ="title">
Review: <input type="text" name ="review">
Stars: <input type="text" name ="stars">
Year: <input type="number" name ="year">
Director: <input type="text" name ="director">
<input class="btn btn-success" type="submit">
</form>
	
	</div>
	<script src="webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>

