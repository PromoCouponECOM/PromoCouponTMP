/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Utilisateur;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author John624
 */
@Stateless
@LocalBean
public class UtilisateurManager {
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method"     
    public List<Utilisateur> getAllUtilisateur() {
        return null;
    }

    public Utilisateur update(Utilisateur utilisateur) {
        return null;
    }
}
