package com.gm.sga.cliente.ciclovidajpa;

import com.gm.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirObjetoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        //Inicia la transaccion
        //Paso 1.Crea nuevo objeto
        //Objeto en estado transitativo
        Persona persona1 = new Persona("Leo", "Messi", "lmessi@gmail.com", "6543789");

        //Paso 2. Inicia transaccion
        tx.begin();

        //Paso 3. Ejecuta SQL
        em.persist(persona1);

        //Paso 4. commit/rollback
        tx.commit();

        //Objeto en estado detached
        log.debug("Objeto persistido - estado detached: " + persona1);

        //Cerramos el entity manajer
        em.close();
    }
}
