package arraylists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        LinkedList <Persona> listaLinked = new LinkedList<Persona>();
        
        listaLinked.add(new Persona(1,"Ezequiel",20));
        listaLinked.add(new Persona(2,"Tomas",25));
        listaLinked.add(new Persona(3,"Pepe",30));
        listaLinked.add(new Persona(4,"Santi",25));
        
        List <Persona> listaArray = new ArrayList<Persona>();
        
        listaArray.add(new Persona(1,"Ezequiel",20));
        listaArray.add(new Persona(2,"Tomas",25));
        listaArray.add(new Persona(3,"Pepe",30));
        listaArray.add(new Persona(4,"Santi",25));
        

       //Remove en ArrayList
       listaArray.remove(1);
       
       //Remove en LinkedList
       
       String nombreBorrar="Tomas";
        for (Persona persona2 : listaLinked) {
            if(persona2.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona2);
                break; //corto que deje de recorrer
            }
        }
        
        for (Persona persona : listaArray) {
            System.out.println("Pueba Array: "+persona.getNombre());
        }
        
        for (Persona persona : listaLinked) {
            System.out.println("Prueba Linked : " + persona.getNombre());
        }
        
        //Tamaño de lista
        
        System.out.println("¿Que tamaño tiene las lista?");
        System.out.println("ArrayList: "+listaArray.size());
        System.out.println("LinkedList: "+listaLinked.size());
        
        //obtener primer objeto
        System.out.println("Primer y ultimo objeto (solo para LinkedList)");
        System.out.println("Primer : " + listaLinked.getFirst().toString());
        System.out.println("Segundo : "+listaLinked.getLast().toString());
        
        //borrar toda la lista
        System.out.println("Borrando Listas ");
        listaArray.clear();
        listaLinked.clear();
        
        //comprobar si esta vacia
        
        System.out.println("¿Esta vacia?");
        System.out.println("ArrayList : " +listaArray.isEmpty());
        System.out.println("LinkedList: "+listaLinked.isEmpty());
        
    }
    
}
