package com.gm.sga.servicio;

import com.gm.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface UsuarioServiceRemote {

    public List<Usuario> listarUsuarios();

    public Usuario encontrarUsuarioPorId(Usuario usuario);

    public void registrarUsuario(Usuario usuario);

    public void modificarUsuario(Usuario usuario);

    public void eliminarUsuario(Usuario usuario);
}
