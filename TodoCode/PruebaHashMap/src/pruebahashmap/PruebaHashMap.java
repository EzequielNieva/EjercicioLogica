package pruebahashmap;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] args) {

        Map<Integer,String> mapaEmpleados= new HashMap<>();
        
        mapaEmpleados.put(123, "Jefe");
        mapaEmpleados.put(1234, "Empleado");
        mapaEmpleados.put(1235, "Gerente");
        mapaEmpleados.put(12356, "Hola");

        boolean estaono=mapaEmpleados.containsValue("Gerente");
        
        if(estaono == true){
            System.out.println("El valor buscado esta");
        }else{
            System.out.println("No esta el valor");
        }
        
        boolean esta=mapaEmpleados.containsKey(123);
        
        if(esta == true){
            System.out.println("El valor buscado esta");
        }else{
            System.out.println("No esta el valor");
        }
        
        System.out.println(mapaEmpleados.values()); 
        System.out.println(mapaEmpleados.keySet());
        
        String nombre = mapaEmpleados.get(1234);
        System.out.println("nombre = " + nombre);
        
        mapaEmpleados.remove(12356);
    }
    
}
