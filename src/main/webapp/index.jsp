
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core">

<h:body>
	<h1>Choose an action</h1>

	<form action="User">
		<input type="submit" value="User" />
	</form>
	<form action="Item">
		<input type="submit" value="Item" />
	</form>



	<form method="post" action="Pos">
		<table cellpadding="0" cellspacing="0" border="0">
			<tr>
				<td>Please enter some text:</td>
				<td><input type="text" name="enteredValue" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="List posesions"></td>
			</tr>
		</table>
	</form>

</h:body>
</html>
