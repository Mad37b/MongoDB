<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="org.bson.Document"%>

<%@page import="com.iesVda.testMongo.movies" %>
<%@ page import="com.iesVda.testMongo.FilmDao" %>
<%@ page import="com.iesVda.testMongo.Util"%>
<%@ page import="java.lang.reflect.*" %>
<%

Field[] classFields;
int fieldSize;
int fieldCounter;

FilmDao newDao = new FilmDao();
movies newMovies = new movies();
movies.setTitle(setTitle()));
newDao.save(newMovies);




%>
<HTML>
<BODY>
	<h2>Bye bye! The system time is now</h2>
	<%=new java.util.Date()%>

	<%
	Document result;
	//initialize driver class
	newMovies = new movies();
	
	
	out.println("Film " + "<BR>"+result.toJson() + "<BR>");
	%>
	
	
</BODY>
</HTML>