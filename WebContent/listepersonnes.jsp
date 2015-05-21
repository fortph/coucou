<%@ page import="beans.*,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>listing</title>
<%
	//recuperation de la liste	
	Enumeration<String> a=session.getAttributeNames();
	
	

	
%>
</head>
<body>
	<table>
		<tr>
			<th>nom</th>
			<th>prenom</th>
		</tr>
		<%
		//Enumeration a=sessio.getAttributeNames();
			while(a.hasMoreElements()){
				String une=a.nextElement();
				Personne x=(Personne)session.getAttribute(une);
	
		%>
		<tr>
			<td><%=x.getNom()%></td>
			<td><%=x.getPrenom()%></td>
		</tr>
		<%
			}
		%>

	</table>
	<br>
	<a href="index.jsp">Retour accueil</a>

</body>
</html>