/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MyConnexion {
     /**
     * Déclaration des variables pour la connexion
     */
    String url = "jdbc:mysql://localhost:3306/gestion_vol?characterEncoding=UTF-8";
    private String login="root";
    private String pwd="";
    /**
     * Une variable de type le nom de la classe
     */
    private static MyConnexion instance;
    /**
     * Déclaration d'une variable de type Connection
     */
    private static Connection connection;
   
    public MyConnexion() {
        try {
            /**
             * Le constructeur étant privé pour
             * Le constructeur se charge de :
             *  1 - Charger le Driver (pilote) en mémoire
             *  2 - Créer l'objet de connexion à la base avec les variables déclarées ci-dessus
             */
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,login,pwd);
        } catch (SQLException ex) {
            Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Serveur n'est pas démarrer !\n Merci de lancer le serveur", "Erreur de connection au serveur", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Serveur n'est pas démarrer !\n Merci de lancer le serveur", "Erreur de connection au serveur", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

    }
    /**
     * Le constructeur étant privé, il nous faut une méthode public pour récupérer l'instance de connexion
     * - si l'instance de la classe courante est nule (la connexion à la base n'est pas établie - voir le contenu du constructeur)
     *     alors créer une nouvelle instance
     * - sinon retourner l'instance
     */
    public static MyConnexion getInstance(){
        if(instance == null){
            instance = new MyConnexion();
        }
        return instance;
    }

    /**
     * @return the connection
     */
    public static Connection getConnection() {
        return connection;
    }  
   
   
}