package testClientews;

import clientews.servicio.ServicioSumarImplService;
import clientews.servicio.ServicioSumarWS;

public class TestServicioSumarWS {
    
    public static void main(String[] args) {
        ServicioSumarWS servicioSumar = new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutando Servicio sumar Ws");
        int x = 6;
        int y = 3;
        int resultado = servicioSumar.sumar(x, y);
        System.out.println("Resultado = " + resultado);
        System.out.println("Fin Servicio sumar WS");
    }
}
