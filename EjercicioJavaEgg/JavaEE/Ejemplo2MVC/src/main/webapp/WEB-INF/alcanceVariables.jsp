<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance Varaiables</title>
    </head>
    <body>
        <h1>Alance Variables</h1>
        <br/>
        Variables request:
        Base:${rectanguloRequest.base}
        Altura:${rectanguloRequest.altura}
        Area:${rectanguloRequest.area}
        <br/><br/>|
        Variables Sesion:
        Base:${rectanguloSesion.base}
        Altura:${rectanguloSesion.altura}
        Area:${rectanguloSesion.area}
        <br/><br/>
        Variables Aplicacion:
        Base:${rectanguloAplicacion.base}
        Altura:${rectanguloAplicacion.altura}
        Area:${rectanguloAplicacion.area}
        <br/><br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>
    </body>
</html>
