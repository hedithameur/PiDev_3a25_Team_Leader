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
import tn.esprit.tools.MaConnection;
import tn.esprit.entity.Ticket;

/**
 *
 * @author hedit
 */
public class TicketService implements InterfaceService<Ticket>  {
    Connection cnx;
    
    public TicketService() {
        cnx = MaConnection.getInstance().getCnx();
    }
    @Override
    public void ajouter(Ticket ticket) {
        try {
        String sql = "INSERT INTO ticket (prix, nb_tickets, type, id_evenement) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = cnx.prepareStatement(sql);
        stmt.setDouble(1, ticket.getPrix());
        stmt.setInt(2, ticket.getNb_tickets());
        stmt.setString(3, ticket.getType());
        stmt.setInt(4, ticket.getId_evenement());
        stmt.executeUpdate();
        System.out.println("Personne ajoutée");
      } catch (SQLException ex) {
              System.out.println(ex.getMessage());
          }
    }

    @Override
    public List<Ticket> getAll() {
        List<Ticket> tickets = new ArrayList<>();
        try {
            String sql = "select * from ticket";
            Statement ste = cnx.createStatement();
            ResultSet s = ste.executeQuery(sql);
            while (s.next()) {

                Ticket p = new Ticket(s.getInt(1), s.getDouble(2),s.getInt(3),
                        s.getString("type"), s.getInt(5));
                tickets.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return tickets;
    }

    /*@Override
    public List<Ticket> findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    public void supprimerTicket(Ticket t) {
        String sql = "delete from ticket where id=?";
        try {
            PreparedStatement ste = cnx.prepareStatement(sql);
            ste.setInt(1, t.getId());
            ste.executeUpdate();
            System.out.println("Ticket supprimée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public void modifierTicket(String type,Ticket p) {
        String sql = "update ticket set type=? where id=?";
        try {
            PreparedStatement ste = cnx.prepareStatement(sql);
            ste.setString(1, type);
            ste.setInt(2,p.getId());
            ste.executeUpdate();
            System.out.println("Ticket modifiée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
