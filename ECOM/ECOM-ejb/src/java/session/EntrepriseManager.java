/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Entreprise;
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
public class EntrepriseManager {

    @PersistenceContext(unitName = "ECOM-ejbPU")
    private EntityManager em;

    public List<Entreprise> getAllEntreprise() {
        return null;
    }

    public Entreprise update(Entreprise entreprise) {
        return null;
    }

    public void persist(Object object) {
        em.persist(object);
    }
}
