package com.gm.sga.datos;

import com.gm.sga.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;


@Stateless
public class PersonaDaoImpl implements PersonaDao{
   
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersona() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona){
        Query query = em.createQuery("from Persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona){
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona){
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona){
        em.remove(em.merge(persona));
    }
    
    
}
