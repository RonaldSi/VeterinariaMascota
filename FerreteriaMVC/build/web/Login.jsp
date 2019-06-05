<%-- 
    Document   : Login
    Created on : 10-abr-2019, 8:22:06
    Author     : RONALD SILVA GUTIERR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginAcceso">
             <center>
        <h1>Login!</h1>
        <input type="text" name="user" placeholder="Usuario" required=""><br>
        <input type="password" name="password" placeholder="Clave" required=""><br>
        <input type="submit" name="acceso" value="Ingresar"><br>
        <label>${sessionScope.texto}</label>
        </center>
        </form>
    </body>
</html>
