<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 

<html>

<head>

	<title>CO2 Readings</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://localhost:8080/project/jquery/jquery.mobile-1.4.5.min.css" />
	<script src="http://localhost:8080/project/jquery/jquery-1.12.4.min.js"></script>
	<script src="http://localhost:8080/project/jquery/jquery.mobile-1.4.5.min.js"></script>
		
	<style>
	
		table {
		    font-family: arial, sans-serif;
		    border-collapse: collapse;
		    width: 50%;
		}
		
		td, th {
		    border: 1px solid #000000;
		    padding: 10px 15px 15px 10px;
		    text-align: left;
		}
		
		tr:nth-child(even) {
		    background-color: #dddddd;
		}
	
	</style>

</head>

<body>

<div data-role="header" data-theme="b">
    <h1>CO2 Readings</h1>
</div>

<div style="padding:30px;"> <!-- Padding div -->  


	<div>
		<c:if test="${ sort == 'new' }">
			Showing Newest First
		</c:if>
			
		<c:if test="${ sort == 'old' }">
			Showing Oldest First
		</c:if>
		
		<c:if test="${ sort != 'old' }">
			<c:if test="${ sort != 'new' }">
				Showing Oldest First
			</c:if>
		</c:if>
		
	</div>
	<br/>
	<br/>
	
	
	<div > <!--  Table div -->
		
		<c:if test="${ enteries_in_last_x > 0 }">
			<table>
				<tr>
					<th style="font-size:150%"> Time </th>
					<th style="font-size:150%"> CO2 Reading</th>
					<th style="font-size:150%"> Location ID</th>
				</tr>
				
			<c:forEach var="co2" items="${ test }">
				<tr>
					<td> ${ co2.getTime() }</td>
					<td> ${ co2.getCo2_reading() }</td>
					<td> ${ co2.getSensor_id() }</td>
				</tr>
			</c:forEach>
	
			</table>
		</c:if>
	</div> <!-- Table div -->
	
	<div>
		<c:if test="${ enteries_in_last_x == 0 }">There were no reading in the last ${ x_in_min } minutes.</c:if>
	</div>
	
	<br>
	
	<div>
		<c:if test="${ enteries_not_in_last_x == 0 }">
			There are no more values to be shown.
			
		</c:if>
	</div>
	
	<div>
		<c:if test="${ enteries_not_in_last_x > 0 }">
			Show ${ enteries_not_in_last_x } 
			<c:if test="${ enteries_in_last_x != 0 }">
				more 
			</c:if> 
			values.
		</c:if>
	</div>
	
	<br/>
	<br/>

	<div class="ui-bar ui-bar-a ui-grid-c">
		<div class="ui-block-a" style="padding:10px;">
			<form method="get"> 
				<input type="submit" name="sort" value="new">
			</form>
		</div>
		<div class="ui-block-b" style="padding:10px;">
			<form method="get"> 
				<input type="submit" name="sort" value="old">
			</form>
		</div>
		<div class="ui-block-c" style="padding:10px;">
			<form method="get"> 
				<input type="submit" name="sort" value="small">
			</form>
		</div>
		<div class="ui-block-d" style="padding:10px;">
			<form method="get"> 
				<input type="submit" name="sort" value="big">
			</form>
		</div>
	</div>	
</div> <!-- Padding div -->

</body>

</html>