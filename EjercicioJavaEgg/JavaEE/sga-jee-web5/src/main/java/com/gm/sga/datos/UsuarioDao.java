package com.gm.sga.datos;

import com.gm.sga.domain.Usuario;
import java.util.List;

public interface UsuarioDao {
    
    public List<Usuario> findAllUsuario();

    public Usuario findUsuarioById(Usuario usuario);

    public void insertUsuario(Usuario usuario);

    public void updateUsuario(Usuario usuario);

    public void deleteUsuario(Usuario usuario);
}
