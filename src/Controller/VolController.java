/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Aeroport;
import Model.Vol;
import config.Crude;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class VolController {
     private Crude crude = new Crude();

    public boolean insert(Vol vol, Integer id_aeroport_depart, Integer id_aeroport_arrive) {
        //Check for unique login/pwd

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String sql
                = "INSERT INTO vol (datedepart, heuredepart, datearrive, heurearrive, reservable, id_aeroport_depart, id_aeroport_arrive) VALUES ("
                + "str_to_date('" + dateFormat.format(vol.getDatedepart()) + "', '%d/%m/%Y'),"
                + " str_to_date('" + vol.getHeuredepart() + "','%h:%i %p'),"
                + "str_to_date('" + dateFormat.format(vol.getDatearrive()) + "', '%d/%m/%Y'),"
                + " str_to_date('" + vol.getHeurearrive() + "','%h:%i %p'),"
                + vol.isReservable() + ","
                + id_aeroport_depart + ","
                + id_aeroport_arrive
                + ")";

        System.out.println(sql);
        return crude.exeCreate(sql);
    }

    public List<Aeroport> getAll() {
        try {
            String sql = "SELECT * FROM vol ORDER BY pays";
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
