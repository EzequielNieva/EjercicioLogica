package com.gm.test.ciclovida;

import com.gm.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado4EliminarObjeto {

   public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        //definimos variable
        Contacto contacto = null;
        //1. estado transitivo
        contacto = em.find(Contacto.class, 3);
        
        em.getTransaction().begin();
        
        //2.remove
        em.remove(em.merge(contacto));
        em.getTransaction().commit();
        
        //3. transitivo
        System.out.println("contacto = " + contacto);
    }
}
