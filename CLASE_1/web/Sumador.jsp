<%
    int suma=0;
    if(request.getParameter("sumar")!=null){
    int numero1=Integer.parseInt(request.getParameter("num1"));
    int numero2=Integer.parseInt(request.getParameter("num2"));
    suma=numero1+numero2;
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sumador</title>
    </head>
    <body>
        <center>
        <form method="post">
         <h1>SUMA</h1><br>
        <label>NÜMERO 1: </label>
        <input type="text" name="num1"><br>
        <label>NÜMERO 2: </label>
        <input type="text" name="num2">
        <input type="submit" name="sumar" value="Sumar">
        <%
            if(request.getParameter("sumar")!=null){        
        %>
        <p>
            <%=suma%>
        </p>
        <%
           } 
        %>
        </form>
    </center>
    </body>
</html>
