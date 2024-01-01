/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Aeroport {
    
    private Integer id;

   
    private String nom, pays;

    public Aeroport() {
    }

    public Aeroport(String nom, String pays) {
        this.nom = nom;
        this.pays = pays;
    }

    public Aeroport(Integer id, String nom, String pays) {
        this.id = id;
        this.nom = nom;
        this.pays = pays;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Aeroport{" + "id=" + id + ", nom=" + nom + ", pays=" + pays + '}';
    }

    
    
}

