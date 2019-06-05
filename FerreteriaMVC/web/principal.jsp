<%-- 
    Document   : principal
    Created on : 10-abr-2019, 9:02:20
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
        <h1>Bienvenido al Sistema!</h1>
        <table border="1" width="450">
            <tr>
                <th>Usuario</th>
                <th>Link</th>
            </tr>
            <tr>
                <td>${sessionScope.texto}</td>
                <td><a href="Salir">Cerrar Sessión</a></td>
            </tr>
        </table>
    </body>
</html>
