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

<a href="/demo/h" class="button">Home</a>

</body>
</html>

<%
String id = request.getParameter("hotel_id");
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




<h2 align="center"><font><strong>Hotel Management</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">

<tr>

</tr>
<tr bgcolor="green">
<td><b>Id</b></td>
<td><b>Hote_Id</b></td>
<td><b>Hotel_Name</b></td>
<td><b>Location</b></td>
<td><b>R_id</b></td>
<td><b>fname</b></td>
<td><b>lname</b></td>

</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM hotel,rooms";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887" color="black">
<td><%=resultSet.getString("id") %></td>
<td><%=resultSet.getString("hotel_id") %></td>
<td><%=resultSet.getString("hotel_name") %></td>

<td><%=resultSet.getString("location") %></td>
<td><%=resultSet.getString("r_id") %></td>
<td><%=resultSet.getString("fname") %></td>
<td><%=resultSet.getString("lname") %></td>


</tr>

<% 
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

