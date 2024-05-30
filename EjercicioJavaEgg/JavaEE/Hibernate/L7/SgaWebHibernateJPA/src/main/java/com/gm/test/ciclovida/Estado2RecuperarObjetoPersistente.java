package com.gm.test.ciclovida;

import com.gm.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado2RecuperarObjetoPersistente {
     public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //definimos la varible
        Contacto contacto = null;
        
        //recuperamos objeto
        contacto = em.find(Contacto.class, 3);
        
        //detached
         System.out.println("contacto = " + contacto);
        
    }
}
