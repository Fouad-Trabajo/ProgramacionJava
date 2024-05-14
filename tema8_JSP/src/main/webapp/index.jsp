<html>
<head>
<style>
h2 {
	color: red;
	border: solid black 1px;
}
</style>
</head>
<body>
	<h2>Hello World!</h2>
	<p>
		Que bueno que hace, jjjjajajajaj <br>
		<%=new java.util.Date()%>
	</p>
	<p>
		Voy a pasar mi nombre a Mayúculas
		<%=new String("fouad").toUpperCase()%>
	</p>
	<p>
		<br>
	<h3>Vamos ha hacer una expresión matemática</h3>
	La suma de 5 y 23 es la siguiente:
	<%=5 + 23%>
	</p>
	<p>
	<h2>Vamos ha hacer una expresión booleana</h2>
	Dime si 10 es igual o mayor 100:
	<%=10 >= 100%>
	</p>
	
	<p>
	Peticiones de datos al navegador : <%= request.getHeader("User-Agent") %><br>
	Petición del idioma utilizado: <%= request.getLocale() %>
	
	</p>

</body>
</html>
