package com.gm.sga.cliente.ciclovidajpa;

import com.gm.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;


public class EliminarObjetoJPA {
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1.Iniciar la transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso 2 Ejecta SQL de tipo select
        Persona persona1 = em.find(Persona.class, 7);
        
        //Paso 3 Termina la transaccion 1 
           tx.commit();
        
        //Objeto en estado detached
        log.debug("Objeto encontrado: " + persona1);
        
        //Paso 4 Inicia Transaccion 2 
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //Paso 5. Ejecuta el SQL que es un DELETE
        em.remove(em.merge(persona1));

        //Paso 6. Termina transaccion
        tx2.commit();
        
        //Objeto en estado detached ya eliminado
        log.debug("Objeto eliminado: " + persona1);
        
        //Cerramos el entity manajer
        em.close();
 }
}
