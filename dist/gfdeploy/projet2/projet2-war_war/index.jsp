<%-- 
    Document   : index
    Created on : 4 févr. 2023, 23:04:25
    Author     : HIGH TECH
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire JSP</title>
</head>
<body>
    
    <a href="resultat"> <button id="add-button" >Voir les notes </button></a>
    
    
    
<style>
	#add-button {
		background-color: black;
		color: white;
		padding: 12px 20px;
		border: none;
		border-radius: 10px;
		cursor: pointer;
		margin: 20px 0;
		width: 200px;
		text-align: center;
		font-size: 18px;
		box-shadow: 0 0 10px #ccc;
	}

	/* Les autres styles pour la formulaire, le tableau, etc... */
</style>

	<h1>Formulaire de saisie</h1>
	<form action="NewServlet" method="post">
		<table>
			<tr>
				<td>Nom :</td>
				<td><input type="text" name="nom"   required></td>
			</tr>
			<tr>
				<td>Prénom :</td>
				<td><input type="text" name="prenom" required></td>
			</tr>
			<tr>
				<td>Module 1 :</td>
                                <td><input type="number"  min="0" max="20" name="module1" required></td>
			</tr>
			<tr>
				<td>Module 2 :</td>
				<td><input type="number" min="0" max="20" name="module2"  required></td>
			</tr>
			<tr>
				<td>Module 3 :</td>
				<td><input type="number"   min="0" max="20" name="module3"   required></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Enregistrer"></td>
			</tr>
		</table>
	</form>
        
        
        <style>
	table {
		width: 500px;
		margin: 0 auto;
	}
	
	td {
		padding: 10px;
	}
	
	input[type="text"] {
		width: 100%;
		padding: 5px;
		font-size: 16px;
	}
        	input[type="number"] {
		width: 100%;
		padding: 5px;
		font-size: 16px;
	}
	
	input[type="submit"] {
		background-color: #4CAF50;
		color: white;
		padding: 12px 20px;
		border: none;
		border-radius: 4px;
		cursor: pointer;
		margin-top: 20px;
		width: 100%;
		font-size: 18px;
	}
</style>

<style>
	body {
		font-family: Arial, sans-serif;
		background-color: #f2f2f2;
	}
	
	.form-container {
		width: 500px;
		margin: 50px auto;
		background-color: white;
		padding: 30px;
		box-shadow: 0 0 10px #ccc;
		text-align: center;
	}
	
	h1 {
		margin-bottom: 30px;
		font-size: 36px;
		color: #333;
	}
	
	input[type="text"], input[type="submit"],input[type="number"]{
		width: 100%;
		padding: 12px 20px;
		margin-bottom: 20px;
		font-size: 18px;
		box-sizing: border-box;
		border-radius: 4px;
		border: 1px solid #ccc;
		outline: none;
	}
	
	input[type="submit"] {
		background-color: #4CAF50;
		color: white;
		cursor: pointer;
	}
	
	input[type="submit"]:hover {
		background-color: #3e8e41;
	}
</style>


</body>
</html>
