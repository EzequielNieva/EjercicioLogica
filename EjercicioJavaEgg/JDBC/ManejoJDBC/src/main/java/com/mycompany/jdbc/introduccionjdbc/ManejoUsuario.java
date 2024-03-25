package com.mycompany.jdbc.introduccionjdbc;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class ManejoUsuario {
    
    public static void main(String[] args) {
        
        UsuarioJDBC usuarioJdbc= new UsuarioJDBC();
        
        //Ejecucion de listado de usuarios
        List<Usuario> usuarios = usuarioJdbc.seleccionar();
        
        for (Usuario usuario : usuarios) {
            
            System.out.println("usuario = " + usuario);
            
        }
        
        // Insertamos un nuevo usuario
        
//        Usuario usuario = new Usuario("eze.nieva","123");
//        
//        usuarioJdbc.insertar(usuario);


        // Modificamos un usuario existente
        
//        Usuario usuario = new Usuario(3,"eze.nieva","456");
//        usuarioJdbc.actualizar(usuario);

        //Eliminamo un usuario
        
        usuarioJdbc.eliminar(new Usuario(3));
    }
    
}
