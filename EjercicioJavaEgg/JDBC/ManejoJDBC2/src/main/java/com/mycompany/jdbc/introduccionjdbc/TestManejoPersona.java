package com.mycompany.jdbc.introduccionjdbc;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersona {

    public static void main(String[] args) {
        
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDAO = new PersonaDAO(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Karla Ivonne ");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("Kgomez@gmail.com");
            cambioPersona.setTelefono("87654321");
            personaDAO.actualizar(cambioPersona);
            Persona nuevaPersona = new Persona("Ezequiel", "Nieva","en@gmail.com","123456");
            personaDAO.insertar(nuevaPersona);
            
            conexion.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
     
    
    }
    
}
