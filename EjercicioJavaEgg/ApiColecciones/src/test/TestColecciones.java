
package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        //guarda en orden
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        //duplica elementos
        for (Object object : miLista) {
            System.out.println(object);
        }
        
        miLista.forEach(object->{
            System.out.println("object = " + object);  
        });
        
        
    }
}
