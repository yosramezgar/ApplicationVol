/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Vol {
    private Integer id ; 
    private Date datedepart;
    private String heuredepart;
    private Date datearrive;
    private String heurearrive;
    private boolean reservable ;

    public Vol() {
    }

    public Vol(Date datedepart, String heuredepart, Date datearrive, String heurearrive, boolean reservable) {
        this.datedepart = datedepart;
        this.heuredepart = heuredepart;
        this.datearrive = datearrive;
        this.heurearrive = heurearrive;
        this.reservable = reservable;
    }

    public Vol(Integer id, Date datedepart, String heuredepart, Date datearrive, String heurearrive, boolean reservable) {
        this.id = id;
        this.datedepart = datedepart;
        this.heuredepart = heuredepart;
        this.datearrive = datearrive;
        this.heurearrive = heurearrive;
        this.reservable = reservable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatedepart() {
        return datedepart;
    }

    public void setDatedepart(Date datedepart) {
        this.datedepart = datedepart;
    }

    public String getHeuredepart() {
        return heuredepart;
    }

    public void setHeuredepart(String heuredepart) {
        this.heuredepart = heuredepart;
    }

    public Date getDatearrive() {
        return datearrive;
    }

    public void setDatearrive(Date datearrive) {
        this.datearrive = datearrive;
    }

    public String getHeurearrive() {
        return heurearrive;
    }

    public void setHeurearrive(String heurearrive) {
        this.heurearrive = heurearrive;
    }

    public boolean isReservable() {
        return reservable;
    }

    public void setReservable(boolean reservable) {
        this.reservable = reservable;
    }

    @Override
    public String toString() {
        return "Vol{" + "id=" + id + ", datedepart=" + datedepart + ", heuredepart=" + heuredepart + ", datearrive=" + datearrive + ", heurearrive=" + heurearrive + ", reservable=" + reservable + '}';
    }
 
    
    
    
    
    
    
}

