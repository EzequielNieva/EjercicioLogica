package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List <Persona> listaArray = new ArrayList<Persona>();
        
        listaArray.add(new Persona(1,"Ezequiel",20));
        listaArray.add(new Persona(2,"Tomas",25));
        listaArray.add(new Persona(3,"Pepe",30));
        listaArray.add(new Persona(4,"Santi",25));
        
        //recorrer por indice
        
        for (int i = 0; i < listaArray.size(); i++) {
            
            System.out.println("preuba For : " + listaArray.get(i).getNombre());
        
        }
        
        //recorrer elemto por elemento
        for (Persona persona : listaArray) {
            
            System.out.println("prueba Fore : " +persona.getNombre());
            
        }
        
        
    }
    
}
