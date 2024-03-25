
package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
        Map miMapa= new HashMap();
        
        miMapa.put(1,"Romero");
        miMapa.put(2,"Rojo");
        miMapa.put(3,"Roberto");
        miMapa.put(10,"Messi");
        miMapa.put("valor9","Pipa");
        
        String elemento =(String) miMapa.get(1);
        String elemento2 =(String) miMapa.get("valor9");
        System.out.println("elemto = "+elemento);
        System.out.println("elemento2 = " + elemento2);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection coleccion){
        for (Object object : coleccion) {
            System.out.println("object = " + object);
        }
        
        coleccion.forEach(action->{
            System.out.println("action  = " + action);
        });
    }
}
