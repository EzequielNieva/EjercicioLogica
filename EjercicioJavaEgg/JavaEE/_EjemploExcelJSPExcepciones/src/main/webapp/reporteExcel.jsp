<%@page errorPage="/WEB-INF/manejoErrores.jsp" %>
<%@page import="utelerias.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<% 
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Reporte de Exel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br/>
        <table border ="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamento de Java</td>
                <td>Aprendemos la sintaxis basica de Java</td>
                <td><%=Conversiones.format("500")%></td>    
            </tr>
            <tr>
                <td>2. Programacion con Java</td>
                <td>Pondremos en practica conceptos de la programacion orientada a objeto</td>
                <td><%=Conversiones.format(new Date())%></td>    
            </tr>
        </table>
    </body>
</html>
