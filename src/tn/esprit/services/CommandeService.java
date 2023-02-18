/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tn.esprit.entity.Commande;
import tn.esprit.tools.MaConnection;

/**
 *
 * @author hedi
 */
public class CommandeService implements InterfaceService<Commande> {
 Connection cnx;

    public CommandeService() {
        cnx = MaConnection.getInstance().getCnx();
    }

    @Override
    public void ajouter(Commande t) {
        try {
            String sql = "insert into commande_ticket(nom_evenement,prix,id_ticket,id_utilisateur)"
                    + "values (?,?,?,?)";
            PreparedStatement ste = cnx.prepareStatement(sql);
            ste.setString(1, t.getNom_evenement());
            ste.setDouble(2, t.getPrix());
            ste.setInt(3, t.getId_ticket());
            ste.setInt(4, t.getId_utilisateur());
            
            ste.executeUpdate();
            System.out.println("Commande ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public List<Commande> getAll() {
        List<Commande> commandes = new ArrayList<>();
        try {
            String sql = "select * from commande_ticket";
            Statement ste = cnx.createStatement();
            ResultSet s = ste.executeQuery(sql);
            while (s.next()) {

                Commande c = new Commande(s.getInt("id"), s.getInt("prix"),s.getInt("id_ticket"),s.getInt("id_utilisateur"),s.getString("nom_evenement") );
                        
                commandes.add(c);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return commandes;
    }

    public void supprimerCommande(Commande c) {
        String sql = "delete from commande_ticket where id=?";
        try {
            PreparedStatement ste = cnx.prepareStatement(sql);
            ste.setInt(1, c.getId());
            ste.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void modifierCommande(double d,Commande c) {
        String sql = "update commande_ticket set prix=? where id=?";
        try {
            PreparedStatement ste = cnx.prepareStatement(sql);
            ste.setDouble(1, d);
            ste.setInt(2, c.getId());
            ste.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
   
}
