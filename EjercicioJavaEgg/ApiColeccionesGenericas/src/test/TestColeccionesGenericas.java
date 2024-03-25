
package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
//        String elemnto = miLista.get(0);
//        System.out.println("elemnto = " + elemnto);
//        imprimir(miLista);
        
        Map<String,String> miMapa= new HashMap();
        
        miMapa.put("1","Romero");
        miMapa.put("2","Rojo");
        miMapa.put("3","Roberto");
        miMapa.put("10","Messi");
        miMapa.put("valor9","Pipa");//se elimina, no se duplica.
        miMapa.put("valor9","Pepe");
        
        String elemento =miMapa.get("1"); 
        System.out.println("elemto = "+elemento);
    
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> coleccion){
        for (String object : coleccion) {
            System.out.println("object = " + object);
        }
        
        coleccion.forEach(action->{
            System.out.println("action  = " + action);
        });
    }
}
