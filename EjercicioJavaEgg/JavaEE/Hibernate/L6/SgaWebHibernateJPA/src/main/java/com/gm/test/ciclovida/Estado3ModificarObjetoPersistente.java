package com.gm.test.ciclovida;

import com.gm.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado3ModificarObjetoPersistente {
    
     public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        //definimos variable
        Contacto contacto = null;
        //1. estado transitivo
        contacto = em.find(Contacto.class, 3);
        
        //modificamos el objeto
        contacto.setEmail("clara@mail.com");
        
        em.getTransaction().begin();
        
        //2.persistente
        //em.persist(contacto);
        em.merge(contacto);
        em.getTransaction().commit();
        
        //3. detached
        System.out.println("contacto = " + contacto);
    }
}
