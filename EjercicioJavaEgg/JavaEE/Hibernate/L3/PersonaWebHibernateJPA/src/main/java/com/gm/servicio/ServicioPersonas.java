package com.gm.servicio;

import com.gm.dao.PersonaDAO;
import com.gm.domain.Persona;
import java.util.List;

public class ServicioPersonas {
    private PersonaDAO personaDao;

    public ServicioPersonas() {
        this.personaDao = new PersonaDAO();
    }
    
    public List<Persona> lisarPersonas(){
        return this.personaDao.listar();
    }
    
    
}
