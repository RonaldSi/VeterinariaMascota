<%-- 
    Document   : VistaPrimo
    Created on : 18-mar-2019, 12:28:16
    Author     : LEONID
--%>
<%
    boolean rpta=false;
    String mensaje="";
    if(request.getParameter("enviar")!=null){
    rpta = (Boolean) request.getAttribute("rpta");
    if(rpta==true){
        mensaje = "Es Primo";
    }else{
        mensaje = "No es Primo";
    }
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRIMO</title>
    </head>
    <body>
        <h1>Primo!</h1>
        <form method="post" action="ServletPrimo">
        <input type="text" name="numero" placeholder="Ingrese numero" required="">
        <input type="submit" name="enviar" value="Enviar">
        </form>
        <%
            if(request.getParameter("enviar")!=null){
               %> 
            
        <p>
            <%=mensaje%>
        </p>
        <%
            }
            %>
    </body>
</html>
