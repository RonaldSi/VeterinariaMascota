<%-- 
    Document   : index
    Created on : 24/03/2019, 04:41:44 PM
    Author     : Katherim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                background-color: white;
                padding: 20px;
            }
        </style>
    </head>
    <body >
        
        
        <form method="post" action="IndexServlet" >
            
           <h1>PROMEDIO</h1>
            
            <label for="edt_examen_parcial">Examen Parcial</label>
            <input id="edt_examen_parcial" 
                   type="number"
                   name="n1" 
                   required=""
                   maxlength="2"
                   max="20"/>
            
            <br>
            <br>
        
            <label for="edt_examen_final">Examen Final</label>
            <input id="edt_examen_final" type="number" name="n2" required="" max="20"/>
            
            <br>
            <br>
        
            <label for="edt_trabajos">Presentacion de trabaos</label>
            <input id="edt_trabajos" type="number" name="n3" required="" max="20"/>
        
            <br>
            <br>
            
            <button type="submit">Enviar</button>
            
        </form>
        
    </body>
</html>
