package org.example.persistencia;

import org.example.logica.Platillo;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

public class PlatilloJpaController implements Serializable {
    private EntityManagerFactory emf = null;

    public PlatilloJpaController() {
        // Obtiene la unidad de persistencia
        this.emf = Persistence.createEntityManagerFactory("restaurante");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Platillo platillo) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.persist(platillo);
        em.getTransaction().commit();
    }

    public void destroy(int id) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        Platillo platillo;
        platillo = em.getReference(Platillo.class, id);
        platillo.getId();
        em.remove(platillo);
        em.getTransaction().commit();
    }

    public void edit(Platillo platillo) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        platillo = em.merge(platillo);
        em.getTransaction().commit();
    }
    public List<Platillo> findPlatilloEntities() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Platillo.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }
    public Platillo findPlatillo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Platillo.class, id);
        } finally {
            em.close();
        }
    }

}
