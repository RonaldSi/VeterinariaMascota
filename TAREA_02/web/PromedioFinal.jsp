<%-- 
    Document   : PromedioFinal
    Created on : 24/03/2019, 05:37:08 PM
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
            .form{
                width: 300px;
                box-shadow: 3px 3px 3px #ccc;
                background-color: white;
                padding: 20px;
            }
        </style>
    </head>
    <body>
        <div class="form">
            
           <h1>El promedio final es:</h1>
           <h2><c:out value="${promedio}"/></h2>
            
        </div>
    </body>
</html>
