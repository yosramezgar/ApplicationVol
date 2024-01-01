/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Aeroports;
import Model.Aeroport;

import config.Crude;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class AeroportController {
    
     private Crude crude = new Crude();

    public boolean insert(Aeroport aeroport) {
        //Check for unique login/pwd

        String sql
                = "INSERT INTO aeroport (nom, pays) VALUES ('"
                + aeroport.getNom() + "','" + aeroport.getPays() + "')";
        System.out.println(sql);
        return crude.exeCreate(sql);
    }

    public List<Aeroport> getAll() {
        try {
            String sql = "SELECT * FROM aeroport ORDER BY pays";
            ResultSet rs = crude.exeRead(sql);
            List<Aeroport> liste = new ArrayList<Aeroport>();
            while (rs.next()) {
                Aeroport aeroport = new Aeroport();
                aeroport.setId(rs.getInt(1));
                aeroport.setNom(rs.getString(2));
                aeroport.setPays(rs.getString(3));
               

                liste.add(aeroport);
            }
            return liste;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur AdministratorDAO ", "Erreur ", JOptionPane.ERROR_MESSAGE);

            return null;
        }
    }
     public List<Aeroport> getAllByPays(String pays) {
        try {
            String sql = "SELECT * FROM aeroport  Where pays='"+pays+"' ORDER BY nom ";
            ResultSet rs = crude.exeRead(sql);
            List<Aeroport> liste = new ArrayList<Aeroport>();
            while (rs.next()) {
                Aeroport aeroport = new Aeroport();
                aeroport.setId(rs.getInt(1));
                aeroport.setNom(rs.getString(2));
                aeroport.setPays(rs.getString(3));
               

                liste.add(aeroport);
            }
            return liste;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur AdministratorDAO ", "Erreur ", JOptionPane.ERROR_MESSAGE);

            return null;
        }

    }

    }

    
    

