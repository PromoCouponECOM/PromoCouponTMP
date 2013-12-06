/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Offre;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author John624
 */
@Stateless
@LocalBean
public class OffreManager {
    @PersistenceContext(unitName = "ECOM-ejbPU")
    private EntityManager em;

    public List<Offre> getAllOffer() {
        return null;
    }

    public Offre update(Offre offre) {
        return null;
    }

    public void persist(Object object) {
        em.persist(object);
    }
}
