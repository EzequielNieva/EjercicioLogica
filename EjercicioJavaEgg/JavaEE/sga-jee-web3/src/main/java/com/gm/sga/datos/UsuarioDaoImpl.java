package com.gm.sga.datos;

import com.gm.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class UsuarioDaoImpl implements UsuarioDao {

    @PersistenceContext(unitName = "PersonaPU")
    EntityManager em;

    @Override
    public List<Usuario> findAllUsuario() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioById(Usuario usuario) {
        return em.find(Usuario.class, usuario.getIdUsuario());
    }

    @Override
    public void insertUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        em.remove(em.merge(usuario));
    }

}
