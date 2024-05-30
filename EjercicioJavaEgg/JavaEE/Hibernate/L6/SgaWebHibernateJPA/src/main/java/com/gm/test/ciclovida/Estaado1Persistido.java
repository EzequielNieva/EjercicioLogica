package com.gm.test.ciclovida;

import com.gm.domain.Contacto;
import javax.persistence.*;

public class Estaado1Persistido {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //1. estado transitivo
        Contacto contacto = new Contacto();
        contacto.setEmail("clara");
        contacto.setTelefono("55446677");

        //2. persistimos el objeto
        em.getTransaction().begin();
        em.persist(contacto);
        em.getTransaction().commit();

        //3. detached (separado)
        System.out.println("contacto = " + contacto);
    }
}
