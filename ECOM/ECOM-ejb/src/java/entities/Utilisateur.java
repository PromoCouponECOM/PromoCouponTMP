/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author John624
 */
@Entity
@Table(name = "UTILISATEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findByIdutilisateur", query = "SELECT u FROM Utilisateur u WHERE u.idutilisateur = :idutilisateur"),
    @NamedQuery(name = "Utilisateur.findByAdrUser", query = "SELECT u FROM Utilisateur u WHERE u.adrUser = :adrUser"),
    @NamedQuery(name = "Utilisateur.findByMailUser", query = "SELECT u FROM Utilisateur u WHERE u.mailUser = :mailUser"),
    @NamedQuery(name = "Utilisateur.findByTelUser", query = "SELECT u FROM Utilisateur u WHERE u.telUser = :telUser"),
    @NamedQuery(name = "Utilisateur.findByPassUser", query = "SELECT u FROM Utilisateur u WHERE u.passUser = :passUser"),
    @NamedQuery(name = "Utilisateur.findByNom", query = "SELECT u FROM Utilisateur u WHERE u.nom = :nom"),
    @NamedQuery(name = "Utilisateur.findByPrenom", query = "SELECT u FROM Utilisateur u WHERE u.prenom = :prenom"),
    @NamedQuery(name = "Utilisateur.findBySexe", query = "SELECT u FROM Utilisateur u WHERE u.sexe = :sexe"),
    @NamedQuery(name = "Utilisateur.findByDateMotificationuser", query = "SELECT u FROM Utilisateur u WHERE u.dateMotificationuser = :dateMotificationuser")})
public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUTILISATEUR")
    private Integer idutilisateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ADR_USER")
    private String adrUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "MAIL_USER")
    private String mailUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TEL_USER")
    private BigInteger telUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "PASS_USER")
    private String passUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOM")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PRENOM")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEXE")
    private int sexe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_MOTIFICATIONUSER")
    @Temporal(TemporalType.DATE)
    private Date dateMotificationuser;

    public Utilisateur() {
    }

    public Utilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Utilisateur(Integer idutilisateur, String adrUser, String mailUser, BigInteger telUser, String passUser, String nom, String prenom, int sexe, Date dateMotificationuser) {
        this.idutilisateur = idutilisateur;
        this.adrUser = adrUser;
        this.mailUser = mailUser;
        this.telUser = telUser;
        this.passUser = passUser;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateMotificationuser = dateMotificationuser;
    }

    public Integer getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public String getAdrUser() {
        return adrUser;
    }

    public void setAdrUser(String adrUser) {
        this.adrUser = adrUser;
    }

    public String getMailUser() {
        return mailUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public BigInteger getTelUser() {
        return telUser;
    }

    public void setTelUser(BigInteger telUser) {
        this.telUser = telUser;
    }

    public String getPassUser() {
        return passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public Date getDateMotificationuser() {
        return dateMotificationuser;
    }

    public void setDateMotificationuser(Date dateMotificationuser) {
        this.dateMotificationuser = dateMotificationuser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idutilisateur != null ? idutilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idutilisateur == null && other.idutilisateur != null) || (this.idutilisateur != null && !this.idutilisateur.equals(other.idutilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Utilisateur[ idutilisateur=" + idutilisateur + " ]";
    }
    
}
