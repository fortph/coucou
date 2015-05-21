<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>formulaire</title>

</head>
<body>
	<form method="post" action="/webAtrio/controleur">
	<input type="hidden" name="action" value="liste" />
	
		<table>
		<caption>liste des participants</caption> 
		<tr>
		<th>nom</th><th>Prenom</th>
		</tr>
			<tr>
				<td>Nom :</td>
				<td><input type="text" value="nom" name="nom"></td>
			</tr>
			<tr>
				<td>Prénom :</td>
				<td><input type="text" value="prenom" name="prenom"></td>
			</tr>
			</table>
			<input type="submit" value="valider" />

			</form>
</body>
</html>