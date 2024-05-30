package test;

import com.gm.dao.PersonaDAO;
import com.gm.domain.Persona;

public class OperacionesHibernateJPA {

    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        personaDAO.listar();
        
        Persona persona = new Persona();
        
        persona.setIdPersona(15);
        personaDAO.buscarPersonaPorId(persona);
        
        //persona.setNombre("Remigio");
        //persona.setApellido("Nieva");
        //persona.setEmail("rnieva@gamil.com");
        //persona.setTelefono("654321");

        //personaDAO.insertar(persona);
        //personaDAO.modificar(persona);
        personaDAO.eliminar(persona);
        personaDAO.listar();
    }
}
