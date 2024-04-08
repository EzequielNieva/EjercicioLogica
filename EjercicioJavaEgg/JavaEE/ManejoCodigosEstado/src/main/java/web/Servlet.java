package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Simulando los valores correcto
        String usuarioOk = "Juan";
        String passwordOk = "123";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario:" + usuario);
            out.print("<br>Password:" + password);
            out.print("</h1>");
        }else{
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Las credenciales son incorresctas");
        }
        out.close();
    }
    
}
