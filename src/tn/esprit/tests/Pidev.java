/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.tests;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tn.esprit.entity.Livraison;
import tn.esprit.entity.Ticket;
import tn.esprit.services.LivraisonService;
import tn.esprit.services.TicketService;
import tn.esprit.tools.MaConnection;

import java.util.Date;
import java.util.List;
/**
 *
 * @author hedit
 */
public class Pidev {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*TicketService t = new TicketService();
        Ticket t1 = new Ticket(17,45,15,"VIP",1);
        //t.ajouter(t1);
       //t.supprimerTicket(t1);
       t.modifierTicket("chaise", t1);
       System.out.println(t.getAll());*/

       LivraisonService livraisonService = new LivraisonService();

        
        // Test the add method
        Livraison livraison = new Livraison(4,new java.util.Date(),"paris",25,1,1);
        //livraisonService.ajouter(livraison);
        //livraisonService.supprimerLivraison(livraison);
        //livraisonService.modifierLivraison("france",livraison);
        //System.out.println(livraison);
    }
    }
