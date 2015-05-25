
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html">

<h:body>
	<h1>Choose an action</h1>

	<form action="User">
		<input type="submit" value="Users" />
	</form>
	<form action="Item">
		<input type="submit" value="Item" />
	</form>
	
	<form action="Pos">
		<input type="submit" value="Pos" />
	</form>
	
	
<form action="Pos" method="post" >


   <input type="text" name="userName">

  <input type="submit"  name="submit" value="Submit">

</form>

</h:body>
</html>
