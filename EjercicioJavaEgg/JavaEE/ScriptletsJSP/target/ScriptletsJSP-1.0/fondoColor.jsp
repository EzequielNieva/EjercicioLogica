<%-- 
    Document   : fondoColor
    Created on : 28 mar. 2024, 19:27:19
    Author     : nieva
--%>
<% 
    String fondo = request.getParameter("colorFondo");
    if(fondo == null || fondo.trim().equals("")){
        fondo = "while";
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP cambio de color</title>
    </head>
    <body bgcolor="<%=fondo%>">
        <h1>JSP cambio de color</h1>
        <br>
        Color de fondo aplicado: <%=fondo%>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
