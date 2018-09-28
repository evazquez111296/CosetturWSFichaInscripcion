package com.cosettur.models.pojos;
// Generated 25/09/2018 11:20:59 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CatalogoGrado generated by hbm2java
 */
public class CatalogoGrado  implements java.io.Serializable {


     private Byte idGrado;
     private String grado;
     private Set fichaInscripcions = new HashSet(0);

    public CatalogoGrado() {
    }

	
    public CatalogoGrado(String grado) {
        this.grado = grado;
    }
    public CatalogoGrado(String grado, Set fichaInscripcions) {
       this.grado = grado;
       this.fichaInscripcions = fichaInscripcions;
    }
   
    public Byte getIdGrado() {
        return this.idGrado;
    }
    
    public void setIdGrado(Byte idGrado) {
        this.idGrado = idGrado;
    }
    public String getGrado() {
        return this.grado;
    }
    
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public Set getFichaInscripcions() {
        return this.fichaInscripcions;
    }
    
    public void setFichaInscripcions(Set fichaInscripcions) {
        this.fichaInscripcions = fichaInscripcions;
    }




}


