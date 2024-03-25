
package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
       // no guarda un orden
        Set miSet = new HashSet();
        
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        //no se duplica elementos
        //polimorfismo
        
        imprimir(miSet);
        
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
