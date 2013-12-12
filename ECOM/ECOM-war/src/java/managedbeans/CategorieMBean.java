/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Categorie;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author John624
 */
@Named(value="categorieMBean")
@SessionScoped
public class CategorieMBean implements Serializable{

    /**
     * Creates a new instance of CategorieMBean
     */
    private List<Categorie> categories;
    public CategorieMBean() {
    }
    
    public  List<Categorie> getCategories(){
        if((categories == null)|| (categories.isEmpty())){
           refresh();
        }
        return categories;
    }

    private void refresh() {
        //TODO
       //tousLesComptes = compteBancaireFacade.findAll();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
