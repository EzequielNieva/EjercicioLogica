package com.mycompany.jdbc.introduccionjdbc;

import datos.*;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;

public class ManejoUsuario {

    public static void main(String[] args) {
        Connection conexion = null;

        
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            UsuarioDao usuarioDao = new UsuarioDaoJDBC(conexion);
            List<UsuarioDTO> usuarios = usuarioDao.select();
            
            for (UsuarioDTO usuario : usuarios) {
                System.out.println("usuario = " + usuario);
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
