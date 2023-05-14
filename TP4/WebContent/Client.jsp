<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Affichage d'un client</title>
</head>
<body>
<jsp:useBean id="client" class="modeles.ClientBean" scope="session" ></jsp:useBean>
<h2>Nom:
<jsp:getProperty name="client" property="nom"/>
</h2>
<h2>Prénom:
<jsp:getProperty name="client" property="prénom"/>
</h2>
<h2>Adresse:
<jsp:getProperty name="client" property="adresse"/>
</h2>
<h2>Numéro:
<jsp:getProperty name="client" property="numero"/>
</h2>

<h2>email:
<jsp:getProperty name="client" property="email"/>
</h2>
</body>
</html>