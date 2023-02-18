/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.entity;

/**
 *
 * @author hedi
 */
public class Commande {
    private int id,id_ticket,id_utilisateur;
    double prix;
    private String nom_evenement;

    public Commande() {
    }

    
    public Commande(int id, double prix, int id_ticket, int id_utilisateur ,String nom_evenement) {
        this.id = id;
        this.prix = prix;
        this.id_ticket = id_ticket;
        this.id_utilisateur = id_utilisateur;
        this.nom_evenement = nom_evenement;
        
    }
    public Commande(double prix, int id_ticket, int id_utilisateur ,String nom_evenement) {

        this.prix = prix;
        this.id_ticket = id_ticket;
        this.id_utilisateur = id_utilisateur;
        this.nom_evenement = nom_evenement;
    }

    public int getId() {
        return id;
    }

    public double getPrix() {
        return prix;
    }

    public String getNom_evenement() {
        return nom_evenement;
    }

    public int getId_ticket() {
        return id_ticket;
    }
    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom_evenement(String nom_evenement) {
        this.nom_evenement = nom_evenement;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }
    
public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    @Override
    public String toString() {
        return "Panier{" + "id=" + id + ", prix=" + prix +", id_ticket=" + id_ticket + ", id_utilisteur=" + id_utilisateur + ", nom_evenement=" + nom_evenement + '}';
    }
    
    
  
}
