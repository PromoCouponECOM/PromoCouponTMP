/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Utilisateur;
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
public class UtilisateurManager {
    @PersistenceContext(unitName = "ECOM-ejbPU")
    private EntityManager em;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method"     
    public List<Utilisateur> getAllUtilisateur() {
        Query query=em.createNamedQuery("Utilisateur.findAll");
        return query.getResultList();
    }

    public Utilisateur update(Utilisateur utilisateur) {
        return em.merge(utilisateur);
    }

    public void persist(Object object) {
        em.persist(object);
    }
}
