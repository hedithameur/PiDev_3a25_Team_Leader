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

import tn.esprit.entity.Commande;
import tn.esprit.entity.Ticket;
import tn.esprit.services.CommandeService;
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

        CommandeService cs = new CommandeService();
        Commande c1 = new Commande(1,12,10 ,1, "hadhra");
        cs.ajouter(c1);
        // cs.supprimerCommande(c1);
        //cs.modifierCommande(24.3, c1);

        System.out.println(cs.getAll());


    }
    }
