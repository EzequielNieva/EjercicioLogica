<%-- 
    Document   : scriptlets
    Created on : 28 mar. 2024, 19:27:48
    Author     : nieva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%--Scriptlets para enviar informacion al navegador --%>
        <% 
            out.print("Saludos desde un scriptlets");
        %>
        <%--Scriptlets para manipular los objetos implicitos--%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("nombre de la aplicacion: " + nombreAplicacion);
        %>
        <br>
        <%--Scriptlets con codigo condicionado --%>
        <%
            if(session != null && session.isNew()){
        %>
        la sesion es nueva
        <%
            }else if (session != null) {
        %>
        la sessio No es nueva
        <% } %>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
