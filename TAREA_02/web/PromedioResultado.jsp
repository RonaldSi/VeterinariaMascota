<%-- 
    Document   : PromedioResultado
    Created on : 24/03/2019, 05:01:36 PM
    Author     : Katherim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color: #eee;
                display: flex;
                justify-content: center;
            }
            form{
                width: 300px;
                box-shadow: 3px 3px 3px #ccc;
                background-color:blanchedalmond;
                padding: 20px;
            }
        </style>
        <script
    src="http://code.jquery.com/jquery-3.3.1.min.js"
    integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
    crossorigin="anonymous"></script>
    </head>
    <body>
        
        <form method="post" action="PromedioFinalServlet">
            
            <h1>El promedio es:</h1>
            
            <h2><c:out value="${promedio}"/></h2>
            
            <input value="<c:out value="${promedio}"/>" type="hidden" name="n"/>
            
            <br>
            <br>
        
            <button id="btn_add_project" type="button">Agregar proyecto</button>
            
            <br>
            <br>
        
            <input id="n4" type="number" name="n4" max="20" style="visibility: hidden"/>
            
            <br>
            <br>
        
            <button id="btn_send" type="submit" style="visibility: hidden">Enviar</button>
            
        </form>
        
        <script>
            
            $("#btn_add_project").click(function (){
                $("#n4").css("visibility", "visible")
                $("#btn_send").css("visibility", "visible")
            });
           
            
        </script>
        
    </body>
</html>
