package com.gm.sga.cliente.ciclovidajpa;

import com.gm.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class EncontrarObjetoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1.Iniciar la transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso 2. Ejecutar SQL de tipo select
        Persona persona1 = em.find(Persona.class, 1);
        
        //Paso 3. Termina la transaccion
        tx.commit();
        
        //Objeto en estado de detach
        log.debug("Objeto recuperado: " + persona1);
        
        //Cerramos el entity manajer
        em.close();
    }
}
