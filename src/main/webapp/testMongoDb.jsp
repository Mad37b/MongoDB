<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="org.bson.Document"%>



<%@ page import="com.iesVda.testMongo.Util"%>
<%@ page import="java.lang.reflect.*" %>
<%

Field[] classFields;
int fieldSize;
int fieldCounter;
Util newUtil= new Util();

classFields = newUtil.studyAClass(Util.class);
fieldSize = classFields.length;
	while (fieldCounter < fieldSize) {
	out.print("Field Name :" + classFields[fieldCounter].getName() + "Field Type:" + classFields[fieldCounter].getType()
	+ "<br>");
	fieldCounter++;
}
%>
<HTML>
<BODY>
	<h2>Bye bye! The system time is now</h2>
	<%=new java.util.Date()%>

	<%
	Document result;
	//initialize driver class
	newUtil = new Util();
	result = newUtil.findFilm("Back to the Future");
	out.println("Film " + result.toJson() + "<BR>");
	%>
	
	
</BODY>
</HTML>