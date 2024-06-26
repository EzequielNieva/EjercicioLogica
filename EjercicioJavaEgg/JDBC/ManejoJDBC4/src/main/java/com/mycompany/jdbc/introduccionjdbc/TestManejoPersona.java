package com.mycompany.jdbc.introduccionjdbc;

import datos.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.List;


public class TestManejoPersona {

    public static void main(String[] args) {
         
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            PersonaDao personaDao= new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personaDao.select();
            
            for (PersonaDTO persona : personas) {
                System.out.println("persona = " + persona);
            }
            
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
