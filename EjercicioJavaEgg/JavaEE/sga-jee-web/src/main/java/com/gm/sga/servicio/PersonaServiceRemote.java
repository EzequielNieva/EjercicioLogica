package com.gm.sga.servicio;

import com.gm.sga.domain.Persona;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface PersonaServiceRemote {

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

}
