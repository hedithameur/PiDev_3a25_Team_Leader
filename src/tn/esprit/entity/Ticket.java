/*²²
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.entity;

/**
 *
 * @author hedit
 */
public class Ticket {
  private int id;
  private double prix;
  private int nb_tickets;
  private String type;
  private int id_evenement;
  
    public Ticket() {}
    public Ticket(double prix, int nb_tickets, String type, int id_evenement) {
      this.prix = prix;
      this.nb_tickets = nb_tickets;
      this.type = type;
      this.id_evenement = id_evenement;
    }
    public Ticket(int id, double prix, int nb_tickets, String type, int id_evenement) {
      this.id = id;
      this.prix = prix;
      this.nb_tickets = nb_tickets;
      this.type = type;
      this.id_evenement = id_evenement;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public double getPrix() {
      return prix;
    }

    public void setPrix(double prix) {
      this.prix = prix;
    }

    public int getNb_tickets() {
      return nb_tickets;
    }

    public void setNb_tickets(int nb_tickets) {
      this.nb_tickets = nb_tickets;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public int getId_evenement() {
      return id_evenement;
    }

    public void setId_evenement(int id_evenement) {
      this.id_evenement = id_evenement;
    }
    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", prix=" + prix + ", nb_tickets=" + nb_tickets + ", type=" + type + ", id_evenement=" + id_evenement + '}' + "\n";
    }
    
}
