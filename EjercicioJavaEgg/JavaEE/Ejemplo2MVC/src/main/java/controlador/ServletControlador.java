package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1. Procesamos parametros
        String accion = request.getParameter("accion");
        
        //2. Creamos los JavaBeans
        Rectangulo recRequest  = new Rectangulo(1,2);
        Rectangulo recSesion = new Rectangulo (3,4);
        Rectangulo recAplicacion = new Rectangulo (5,6);
        
        //3. Agregamos el javabean a alguna alcance
        
        //revisamos la accion proporcionada
        if("agregaVariables".equals(accion)){
            
            //Alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            
            //Alance session
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);

            //Alance application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recAplicacion);

            //Agregamos un mensaje
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            
            //.4 redireccionamos al jsp de index
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else if("listarVariables".equals(accion)){
            //4. redireccionar al jsp que despliega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }else{
            //4. redireccionamo a la pagina de inicio
            request.setAttribute("mensaje", "accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        
            //Esta linea no agregaria informacion al JSP, ya que no propaga los objeto request y response
            //response.sendRedirect("index.jsp");
        }
    }
}
