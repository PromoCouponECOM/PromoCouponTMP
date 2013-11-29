/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Categorie;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author John624
 */
@Stateless
@LocalBean
public class CategorieManager {
    @PersistenceContext(unitName = "ECOM-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public List<Categorie> getLesCategories() {
        Query q = em.createNamedQuery("Adresse.findAll");
        return q.getResultList();
    }

    public Categorie update(Categorie cat) {
        return em.merge(cat);
    }
    
    

    
}
