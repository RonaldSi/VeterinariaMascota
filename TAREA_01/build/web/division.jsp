<%-- 
    Document   : division
    Created on : 25-mar-2019, 11:39:56
    Author     : RONALD SILVA GUTIERR
--%>

<%
    int division=0;
    if(request.getParameter("division")!=null){
    int numero1=Integer.parseInt(request.getParameter("num1"));
    int numero2=Integer.parseInt(request.getParameter("num2"));
    division=numero1/numero2;
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>division</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
    <center>
        <form method="post">
        <h1>DIVISION</h1>
        
        <br>
        <label>Numero 1:</label>
        <input type="text" name="num1">
        <br>
        <label>Numero 2:</label>
        <input type="text" name="num2">
        <input type="submit" name="division" value="division">
         <%
            if(request.getParameter("division")!=null){        
        %>
        <p>
            La division es: <%=division%>
        </p>
        <%
           } 
        %>
     </form>
    </center>
  
    </body>
</html>

