<%-- 
    Document   : Ventas
    Created on : 18-mar-2019, 11:47:58
    Author     : LEONID
--%>

<%
    double total = 0;
    if(request.getParameter("enviar")!=null){
    total =(Double)(request.getAttribute("totalventas"));
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ventas</title>
    </head>
    <body>
        <h1>Ventas</h1>
        <form method="post" action="Vendedor">
        <input type="text" name="cantidad" placeholder="Ingrese cantidad" required="">
        <input type="text" name="precio" placeholder="Ingrese precio" required="">
        <input type="submit" name="enviar" value="Enviar">
        </form>
        <%if(request.getParameter("enviar")!=null){ 
        %>
        <p>La venta total es: <%=total%></p>
        <% }
        %>
    </body>
</html>
