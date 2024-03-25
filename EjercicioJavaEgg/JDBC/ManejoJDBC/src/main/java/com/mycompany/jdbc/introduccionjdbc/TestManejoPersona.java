package com.mycompany.jdbc.introduccionjdbc;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersona {

    public static void main(String[] args) {
        
        PersonaDAO personaDAO = new PersonaDAO();
        
        //Insertando un nuevo objeto de tipo Persona
        
//        Persona personaNueva = new Persona("Ezequiel", "Nieva", "en@gmail.com","3871234563");
//        personaDAO.insertar(personaNueva);

        //Modificar un objeto de persona existente
    
//        Persona personaModificar = new Persona(4, "Ezequiel", "Noria", "en@gmail.com", "3871234563");
//        personaDAO.actualizar(personaModificar);
        
        //Eliminar un resgistro 
        
           Persona personaEliminar = new Persona(4);
           personaDAO.eliminar(personaEliminar);
        
        
        List<Persona> personas = personaDAO.seleccionar();
        
        for (Persona persona : personas) {
            
            System.out.println("persona = " + persona);
            
        }
        
//        personas.forEach(persona ->{
//            System.out.println("persona = " + persona);
//        });
    
    }
    
}
