<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Reel Reviews</title>
<link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
<div  class="container">
<h1>Add details of a new film</h1>
<form:form method ="post" modelAttribute="film">
<form:input type="hidden" path="id" />
Title: <form:input type="text" path ="title" placeholder="Enter the title"/>
Review: <form:input type="text" path ="review"/>
<form:errors path="review" cssClass="text-warning" />
Stars: <form:input type="text" path ="star"/>
Year: <form:input type="number" path ="year"/>
Director: <form:input type="text" path ="director"/>
<form:input type="hidden" path="id" />
<input class="btn btn-success" type="submit"/>
</form:form>
	</div>
	<script src="webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>

