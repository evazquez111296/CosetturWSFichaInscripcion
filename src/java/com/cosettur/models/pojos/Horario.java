package com.cosettur.models.pojos;
// Generated 25/09/2018 11:20:59 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Horario generated by hbm2java
 */
public class Horario  implements java.io.Serializable {


     private int folio;
     private FichaInscripcion fichaInscripcion;
     private Date fechaInicioLunes;
     private Date fechaFinLunes;
     private Date fechaInicioMartes;
     private Date fechaFinMartes;
     private Date fechaInicioMiercoles;
     private Date fechaFinMiercoles;
     private Date fechaInicioJueves;
     private Date fechaFinJueves;
     private Date fechaInicioViernes;
     private Date fechaFinViernes;

    public Horario() {
    }

    public Horario(FichaInscripcion fichaInscripcion, Date fechaInicioLunes, Date fechaFinLunes, Date fechaInicioMartes, Date fechaFinMartes, Date fechaInicioMiercoles, Date fechaFinMiercoles, Date fechaInicioJueves, Date fechaFinJueves, Date fechaInicioViernes, Date fechaFinViernes) {
       this.fichaInscripcion = fichaInscripcion;
       this.fechaInicioLunes = fechaInicioLunes;
       this.fechaFinLunes = fechaFinLunes;
       this.fechaInicioMartes = fechaInicioMartes;
       this.fechaFinMartes = fechaFinMartes;
       this.fechaInicioMiercoles = fechaInicioMiercoles;
       this.fechaFinMiercoles = fechaFinMiercoles;
       this.fechaInicioJueves = fechaInicioJueves;
       this.fechaFinJueves = fechaFinJueves;
       this.fechaInicioViernes = fechaInicioViernes;
       this.fechaFinViernes = fechaFinViernes;
    }
   
    public int getFolio() {
        return this.folio;
    }
    
    public void setFolio(int folio) {
        this.folio = folio;
    }
    public FichaInscripcion getFichaInscripcion() {
        return this.fichaInscripcion;
    }
    
    public void setFichaInscripcion(FichaInscripcion fichaInscripcion) {
        this.fichaInscripcion = fichaInscripcion;
    }
    public Date getFechaInicioLunes() {
        return this.fechaInicioLunes;
    }
    
    public void setFechaInicioLunes(Date fechaInicioLunes) {
        this.fechaInicioLunes = fechaInicioLunes;
    }
    public Date getFechaFinLunes() {
        return this.fechaFinLunes;
    }
    
    public void setFechaFinLunes(Date fechaFinLunes) {
        this.fechaFinLunes = fechaFinLunes;
    }
    public Date getFechaInicioMartes() {
        return this.fechaInicioMartes;
    }
    
    public void setFechaInicioMartes(Date fechaInicioMartes) {
        this.fechaInicioMartes = fechaInicioMartes;
    }
    public Date getFechaFinMartes() {
        return this.fechaFinMartes;
    }
    
    public void setFechaFinMartes(Date fechaFinMartes) {
        this.fechaFinMartes = fechaFinMartes;
    }
    public Date getFechaInicioMiercoles() {
        return this.fechaInicioMiercoles;
    }
    
    public void setFechaInicioMiercoles(Date fechaInicioMiercoles) {
        this.fechaInicioMiercoles = fechaInicioMiercoles;
    }
    public Date getFechaFinMiercoles() {
        return this.fechaFinMiercoles;
    }
    
    public void setFechaFinMiercoles(Date fechaFinMiercoles) {
        this.fechaFinMiercoles = fechaFinMiercoles;
    }
    public Date getFechaInicioJueves() {
        return this.fechaInicioJueves;
    }
    
    public void setFechaInicioJueves(Date fechaInicioJueves) {
        this.fechaInicioJueves = fechaInicioJueves;
    }
    public Date getFechaFinJueves() {
        return this.fechaFinJueves;
    }
    
    public void setFechaFinJueves(Date fechaFinJueves) {
        this.fechaFinJueves = fechaFinJueves;
    }
    public Date getFechaInicioViernes() {
        return this.fechaInicioViernes;
    }
    
    public void setFechaInicioViernes(Date fechaInicioViernes) {
        this.fechaInicioViernes = fechaInicioViernes;
    }
    public Date getFechaFinViernes() {
        return this.fechaFinViernes;
    }
    
    public void setFechaFinViernes(Date fechaFinViernes) {
        this.fechaFinViernes = fechaFinViernes;
    }




}

