package com.mycompany.jdbc.introduccionjdbc;

import datos.Conexion;
import datos.UsuarioJDBC;
import domain.Usuario;
import java.sql.*;


public class ManejoUsuario {

    public static void main(String[] args) {
        Connection conexion = null;

        
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            UsuarioJDBC usuarioJdbc = new UsuarioJDBC();
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setId_usuario(1);
            cambioUsuario.setUsername("juan.perez");
            cambioUsuario.setPassword("1234");
            usuarioJdbc.actualizar(cambioUsuario);
            Usuario nuevoUsuario = new Usuario("eze.nieva","321");
            usuarioJdbc.insertar(nuevoUsuario);
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
