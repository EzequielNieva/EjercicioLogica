<%-- 
    Document   : expresiones
    Created on : 28 mar. 2024, 19:03:12
    Author     : nieva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JSP con Expresiones</h1>
        Concatenacion : <%= "Saludos" + " " + "JSP" %>
        <br>
        Operacion Matematica <%= 2*3/2 %>
        <br>
        Session id: <%= session.getId() %>
        <br>
        <br>
        <a href="index.html">Regresar al inicio </a>
    </body>
</html>
