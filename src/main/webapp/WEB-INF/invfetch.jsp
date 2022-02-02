<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Management</title>

<style>
body{
    background-color: #080710;
    background-image:"/hotel/src/main/webapp/images/hotel.jpg";
}

.button{
    margin-top: 10px;
    width: 150px;
    background-color: #ffffff;
    color: #080710;
    padding: 15px 0;
    font-size: 18px;
    font-weight: 600;
    border-radius:25px;
    cursor: pointer;
    float:left;
    text-decoration:none;
    justify-content:center;
    text-align:center;
    
}



.button:hover {
  background-color: green;
  color: white;
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}

td{

    color: black;

}
</style>

</head>
<body>

<a href="/demo8/h" class="button">Home</a>

</body>
</html>



<%
String id = request.getParameter("inv_id");
String driverName = "org.postgresql.Driver";
String connectionUrl = "jdbc:postgresql://localhost:5432/";
String dbName = "hotel";
String userId = "postgres";
String password = "admin";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>




<h2 align="center"><font><strong>Hotel</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">

<tr>

</tr>
<tr bgcolor="green">
<td><b>Inv_Id</b></td>
<td><b>Inv_num</b></td>
<td><b>Inv_desc</b></td>
<td><b>Inv_items</b></td>
<td><b>Inv_type</b></td>


</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM inventory1";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887" color="black">

<td><%=resultSet.getString("inv_id") %></td>
<td><%=resultSet.getString("inv_num") %></td>
<td><%=resultSet.getString("inv_desc") %></td>
<td><%=resultSet.getString("inv_items") %></td>
<td><%=resultSet.getString("inv_type") %></td>

</tr>

</tr>

<% 
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

