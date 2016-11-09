<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Taller 4</title>
</head>
<link rel="stylesheet" href="/springhibernate/resourses/estiloinicio/estilos.css">
<link rel="stylesheet" href="/springhibernate/resourses/font.css">
<body>
	<header>
	<h1 class="cabecera">Menú</h1>
	<input type="checkbox" id="btn-menu">
	<label for="btn-menu"><span class="icon-menu"></span></label>
		<nav class="menu">
			<ul>
			<!--<img class="img-logo-desktop" src="img/titulo de web.png">-->
				<li><a href="http://localhost:8080/springhibernate/"><span class="icon-home iconos-menu"></span>Inicio</a></li>
				<li><a href="http://localhost:8080/springhibernate/clientes/formulario"><span class="icon-users iconos-menu"></span>Formulario Clientes</a></li>
				<li><a href="http://localhost:8080/springhibernate/producto/form"><span class="icon-cart iconos-menu"></span>Formulario Producto</a></li>
				<li><a href="http://localhost:8080/springhibernate/pedido/form"><span class="icon-truck iconos-menu"></span>Formulario Pedido</a></li>
				<li><a href="http://localhost:8080/springhibernate/usuario/form"><span class="icon-user iconos-menu"></span>Formulario Usuario</a></li>
				
			</ul>
		</nav>
	</header>
	<section>
		<h2 class="titulo">Bienvenido a la Página Principal</h2>
		<p>Qué deseas hacer?</p>
		<div>
			<ul class="opcion">
				<li><a href="http://localhost:8080/springhibernate/clientes/formulario"><span class="icon-users iconos"></span>Abrir Formulario de Clientes</a></li>
				<li><a href="http://localhost:8080/springhibernate/producto/form"><span class="icon-cart iconos"></span>Abrir Formulario de Productos</a></li>
				<li><a href="http://localhost:8080/springhibernate/pedido/form"><span class="icon-truck iconos"></span>Abrir Formulario de Pedidos</a></li>
				<li><a href="http://localhost:8080/springhibernate/usuario/form"><span class="icon-user iconos"></span>Abrir Formulario de Usuario</a></li>
			</ul>
		</div>

	</section>
</body>

</html>