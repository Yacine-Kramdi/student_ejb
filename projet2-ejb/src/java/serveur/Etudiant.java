/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author HIGH TECH
 */

@Entity
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prénom;


    private float mat1;
    private float mat2;
    private float mat3;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "serveur.Etudiant[ id=" + id + " ]";
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public float getMat1() {
        return mat1;
    }

    public float getMat2() {
        return mat2;
    }

    public float getMat3() {
        return mat3;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMat1(float mat1) {
        this.mat1 = mat1;
    }

    public void setMat2(float mat2) {
        this.mat2 = mat2;
    }

    public void setMat3(float mat3) {
        this.mat3 = mat3;
    }

 

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }


}
