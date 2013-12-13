/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedbeans;

import entities.Coupon;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author liuju
 */
@Named(value = "couponMBean")
@Dependent
public class CouponMBean {

    /**
     * Creates a new instance of CouponMBean
     */
    public CouponMBean() {
    }

    Coupon getCouponById(Integer integer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
