<!DOCTYPE html>
<html>
	<head>
		<style type="text/css">
			body{
				background-color: black;
			}
			
			h1, form{
				color: silver;
			}
		</style>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>P�gina cool</title>
	</head>
	
	<body>
		<h1>Bem vindo a p�gina cool </h1>
		<br/>
		<br/>
		
		<a href="webcool.jsp">Venha conhecer a melhor p�gina!</a>
		
		<form action="IndexServlet" method="post">
		<label for="p">Me diga numa escala de 0 a 10, qu�o puto voc� est�:</label>
		<input id="p" name="p" type="number" step="1" min="0" max="10" maxlength="2">
		<br/>
		
		<input type="button" onclick="submit()" value="Enviar">
		
		</form>
	</body>
</html>