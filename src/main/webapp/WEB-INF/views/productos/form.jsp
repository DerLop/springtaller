<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="registroProducto">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Producto</title>


<script type="text/javascript" src="/springhibernate/resourses/angular/angular.js"></script>

<!--Import Google Icon Font-->
<link href="/springhibernate/resourses/materialize/iconos/index.css" rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href="/springhibernate/resourses/materialize/css/materialize.min.css" media="screen,projection" />

<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="widtd=device-widtd, initial-scale=1.0" />


<script type="text/javascript">

		angular.module("registroProducto",[]);
		
		angular.module("registroProducto").controller("productoController", function($scope,$http){
			
			$scope.aplicativo="Registro de Producto";
			
			$scope.registrarProducto = function(producto){
				
				$http.post("http://localhost:8080/springhibernate/producto", producto).success(function(){
					
					//Vaciar los campos del formulario
					$scope.producto = undefined;
					
					cargarProductos();
					
				});
			};
			var editarProducto=function(){
				$scope.$watch(function(){
					Materialize.updateTextFields();
				});//para editar un producto que cargue en los textfiels
			};
			var cargarProductos=function(){
				$http.get("http://localhost:8080/springhibernate/producto").success(function(productos){
					
					$scope.productos = productos;
				});
			};
			
			cargarProductos();
		});

</script>






</head>
<body ng-controller="productoController">


	<h2 ng-bind="aplicativo"></h2>


	<div class="row">

		<div class="col s2"></div>

		{{producto}}

		<form class="col s8">

			<div class="card-panel">
				<div class="row">
					<div class="input-field col s6">
					<!--  	<i class="material-icons prefix">account_circle</i> -->
						<input id="descripcion" type="text" class="validate" ng-model="producto.descripcion"> 
						<label for="descripcion">Descripcion</label>
					</div>

					<div class="input-field col s6">
						<i class="material-icons prefix">today</i> 
						<input id="fecha" type="date" class="datepicker" ng-model="producto.fechaVencimiento"> 
						<label for="fecha">Fecha de Vencimiento</label>
					</div>

					<div class="input-field col s6">
					<!--  	<i class="material-icons prefix">phone</i>  -->
					 <input id="precio" type="number" class="validate" ng-model="producto.precio">
						<label for="precio">Precio</label>
					</div>
					<div class="input-field col s6">
					<!--	<i class="material-icons prefix">phone</i> --> 
					<input id="cantidad" type="number" class="validate" ng-model="producto.cantidad">
						<label for="cantidad">Cantidad</label>
					</div>



				</div>

			</div>

			<button ng-click="registrarProducto(producto)" class="btn waves-effect waves-light" type="submit" name="action"> Registrar 
			<i class="material-icons right">save</i>
			</button>


		</form>


		<div class="col s2"></div>
	</div>
	
	
	<div class="row">
	
	<div class="col s12">
	
	<table class="responsive-table highlight">
	<thead>
	<tr>
	<th>Eliminar</th>
	<th>Descripcion</th>
	<th>Fecha Vencimiento</th>
	<th>Precio</th>
	<th>Cantidad</th>
	<th>Editar</th>
	
	</tr>
	</thead>
	<tbody>
	<tr ng-repeat="producto in productos">
	
	<td></td>
	<td>{{producto.descripcion}}</td>
	<td>{{producto.fechaVencimiento}}</td>
	<td>{{producto.precio}}</td>
	<td>{{producto.cantidad}}</td>
	<td></td>
	
	
	</tr>
	</tbody>
	
	</table>
	
	</div>
	</div>










	<!--Import jQuery before materialize.js-->
	<script type="text/javascript"
		src="/springhibernate/resourses/jquery.js"></script>
	<script type="text/javascript"
		src="/springhibernate/resourses/materialize/js/materialize.min.js"></script>



	<script type="text/javascript">


	$(document).ready(function() {
    
		$('.datepicker').pickadate();
	
     });

</script>


</body>
</html>
