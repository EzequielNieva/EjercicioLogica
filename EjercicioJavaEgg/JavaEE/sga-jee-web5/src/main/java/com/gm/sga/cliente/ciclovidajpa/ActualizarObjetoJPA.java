package com.gm.sga.cliente.ciclovidajpa;

import com.gm.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ActualizarObjetoJPA {
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1.Iniciar la transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso 2. Ejecutar SQL de tipo select
        // El id proporcionado debe existir en la base de datos
        Persona persona1 = em.find(Persona.class, 1);
        
        //Paso 3. Termina la transaccion 1
        tx.commit();
        
        //Objeto en estado de detach
        log.debug("Objeto recuperado: " + persona1);
        
        //Paso 4. setValue (nuevoValor)
        persona1.setApellido("Juarez");
        
        //Paso 5. Inicia la transaccio 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //Paso 6. Modificamos el objeto
        em.merge(persona1);
        
        //Paso 7. Termina transaccion 2
        tx2.commit();
        
        //Objeto en estado de detached ya modificado
        log.debug("Objeto recuperado: " + persona1);
        
        //Cerramos el entity manajer
        em.close();
 }
}
