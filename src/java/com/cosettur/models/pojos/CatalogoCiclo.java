package com.cosettur.models.pojos;
// Generated 25/09/2018 11:20:59 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CatalogoCiclo generated by hbm2java
 */
public class CatalogoCiclo  implements java.io.Serializable {


     private Byte idCiclo;
     private String ciclo;
     private Set fichaInscripcions = new HashSet(0);

    public CatalogoCiclo() {
    }

	
    public CatalogoCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    public CatalogoCiclo(String ciclo, Set fichaInscripcions) {
       this.ciclo = ciclo;
       this.fichaInscripcions = fichaInscripcions;
    }
   
    public Byte getIdCiclo() {
        return this.idCiclo;
    }
    
    public void setIdCiclo(Byte idCiclo) {
        this.idCiclo = idCiclo;
    }
    public String getCiclo() {
        return this.ciclo;
    }
    
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    public Set getFichaInscripcions() {
        return this.fichaInscripcions;
    }
    
    public void setFichaInscripcions(Set fichaInscripcions) {
        this.fichaInscripcions = fichaInscripcions;
    }




}


