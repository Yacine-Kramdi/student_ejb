<%-- 
    Document   : Resultat
    Created on : 5 févr. 2023, 01:05:30
    Author     : HIGH TECH
--%>

<%@page import="java.util.List"%>
<%@page import="serveur.Etudiant"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <table>
  <tr>
    <th>Nom</th>
    <th>Prénom</th>
    <th>Module 1</th>
    <th>Module 2</th>
    <th>Module 3</th>
     <th>Moyenne</th>
    
  </tr>
  <%
    List<Etudiant> etudiants = (List<Etudiant>) request.getAttribute("etudiants");
    for (Etudiant etudiant : etudiants){
        
  %>
  <tr>
    <td><%= etudiant.getNom() %></td>
    <td><%= etudiant.getPrenom() %></td>
    <td><%= etudiant.getNom() %></td>
    <td><%= etudiant.getMat1() %></td>
    <td><%= etudiant.getMat2() %></td>
    <td><%= etudiant.getMat3() %></td>
    <td><%= etudiant.getMat3() %></td>
     
        
  </tr>
  <%
    }
  %>
</table>

    </body>
</html>
