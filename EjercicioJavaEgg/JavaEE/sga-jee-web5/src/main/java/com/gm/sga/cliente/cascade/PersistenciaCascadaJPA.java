package com.gm.sga.cliente.cascade;

import com.gm.sga.domain.*;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistenciaCascadaJPA {
    static Logger log = LogManager.getRootLogger();
    public static void main(String[] args) {
        
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
       EntityManager em = emf.createEntityManager();
       EntityTransaction tx = em.getTransaction();
       tx.begin(); 
       //Paso 1. Crea nuevo objeto
       //Objeto en estado transitivo
       Persona persona1 = new Persona("Hugo","Pepe","hpepe@gmai.com","55446688");
       
       //Crea objeto usuario (tiene dependencia con el objeto persona)
       Usuario usuario1 = new Usuario("hpepe","123",persona1);
    
       //Paso 3. persistimos el objeto usuario
       em.persist(usuario1);
       
       //Paso 4. commit transaccion
       tx.commit();
       
       //objetos en estados detached
      log.debug("Objeto persistido persona: " + persona1);
      log.debug("Objeto persistido usuario: " + usuario1);
      
      em.close();
    }
}
