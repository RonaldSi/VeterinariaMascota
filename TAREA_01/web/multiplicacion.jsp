<%-- 
    Document   : multiplicacion
    Created on : 25-mar-2019, 11:40:22
    Author     : RONALD SILVA GUTIERR
--%>

<%
    int multiplicacion=0;
    if(request.getParameter("multiplicacion")!=null){
    int numero1=Integer.parseInt(request.getParameter("num1"));
    int numero2=Integer.parseInt(request.getParameter("num2"));
    multiplicacion=numero1*numero2;
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>multiplicacion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
    <center>
        <form method="post">
        <h1>MULTIPLICACION</h1>
        
        <br>
        <label>Numero 1:</label>
        <input type="text" name="num1">
        <br>
        <label>Numero 2:</label>
        <input type="text" name="num2">
        <input type="submit" name="multiplicacion" value="Multiplicacion">
         <%
            if(request.getParameter("multiplicacion")!=null){        
        %>
        <p>
             La multiplicacion es: <%=multiplicacion%>
            
        </p>
        <%
           } 
        %>
     </form>
    </center>
  
    </body>
</html>