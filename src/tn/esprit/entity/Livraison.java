package tn.esprit.entity;

import java.util.Date;

public class Livraison {
    private int id;
    private Date date;
    private String adresse;
    private double prix;
    private int id_user;
    private int id_instrument;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(java.util.Date date2) {
        this.date = date2;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getId_user() {
        return id_user;
    }
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    public int getId_instrument() {
        return id_instrument;
    }
    public void setId_instrument(int id_instrument) {
        this.id_instrument = id_instrument;
    }
    public Livraison(int id, Date date, String adresse, double prix, int id_user, int id_instrument) {
        this.id = id;
        this.date = date;
        this.adresse = adresse;
        this.prix = prix;
        this.id_user = id_user;
        this.id_instrument = id_instrument;
    }
    public Livraison(Date date, String adresse, double prix, int id_user, int id_instrument) {
        this.date = date;
        this.adresse = adresse;
        this.prix = prix;
        this.id_user = id_user;
        this.id_instrument = id_instrument;
    }
    public Livraison() {
    }
    @Override
    public String toString() {
        return "Livraison [id=" + id + ", date=" + date + ", adresse=" + adresse + ", prix=" + prix + ", id_user="
                + id_user + ", id_instrument=" + id_instrument + "]";
    }
    
}
