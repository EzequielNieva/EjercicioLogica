package com.gm.sga.cliente.asociaciones;

import com.gm.sga.domain.*;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ClienteAsociacionesJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
//cerramos la conexion
        em.close();

//Imprimir los objeto de tipo persona
        for (Persona persona : personas) {
            log.debug("Persona: " + persona);

//recuperamos los usuarios de cada persona
            for (Usuario usuario : persona.getUsuarioList()) {
                log.debug("Usuario: " + usuario);
            }
        }
    }
}
