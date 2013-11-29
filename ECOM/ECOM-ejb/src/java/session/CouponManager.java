/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Coupon;
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
public class CouponManager {
    @PersistenceContext(unitName = "ECOM-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public List<Coupon> getLesCoupons() {
        Query q = em.createNamedQuery("Adresse.findAll");
        return q.getResultList();
    }

    public Coupon update(Coupon coupon) {
        return em.merge(coupon);
    }  
}
