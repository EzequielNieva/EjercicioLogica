package arraylists;

import java.util.LinkedList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List <Persona> lista = new LinkedList<Persona>();
        
        lista.add(new Persona(1,"Ezequiel",20));
        lista.add(new Persona(2,"Tomas",25));
        lista.add(new Persona(3,"Pepe",30));
        lista.add(new Persona(4,"Santi",25));
        
        //Agregar al priincipio
        lista.add(0,new Persona(5,"Coqui",40));  
        //recorrer elemto por elemento
        for (Persona persona : lista) {
            
            System.out.println("prueba Fore : " +persona.getNombre());
            
        }
        
        
    }
    
}
