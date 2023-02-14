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
import tn.esprit.entity.Livraison;
import tn.esprit.tools.MaConnection;

public class LivraisonService implements InterfaceService <Livraison>{
    Connection cnx;
    public LivraisonService() {
        cnx = MaConnection.getInstance().getCnx();
    }

    @Override
    public void ajouter(Livraison livraison) {
        try {
            String sql = "INSERT INTO livraison (date, adresse, prix, id_user, id_instrument) "
            + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = cnx.prepareStatement(sql);
            statement.setDate(1, new java.sql.Date(livraison.getDate().getTime()));
            statement.setString(2, livraison.getAdresse());
            statement.setDouble(3, livraison.getPrix());
            statement.setInt(4, livraison.getId_user());
            statement.setInt(5, livraison.getId_instrument());
            statement.executeUpdate();
            System.out.println("Livraison ajoutée");
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
    }

    @Override
    public List<Livraison> getAll() {
        List<Livraison > livraisons  = new ArrayList<>();
        try {
            String sql = "select * from livraison";
            Statement ste = cnx.createStatement();
            ResultSet s = ste.executeQuery(sql);
            while (s.next()) {

                Livraison  rs = new Livraison (s.getInt(1), s.getDate(2),s.getString(3),
                        s.getDouble(4), s.getInt(5), s.getInt(6));
                        livraisons.add(rs);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return livraisons ;
    }

    /*@Override
    public List<Livraison> findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }*/
    public void supprimerLivraison(Livraison t) {
        String sql = "delete from livraison where id=?";
        try {
            PreparedStatement ste = cnx.prepareStatement(sql);
            ste.setInt(1, t.getId());
            ste.executeUpdate();
            System.out.println("livarison supprimée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

        public void modifierLivraison(String adresse,Livraison p) {
            String sql = "update livraison set adresse=? where id=?";
            try {
                PreparedStatement ste = cnx.prepareStatement(sql);
                ste.setString(1, adresse);
                ste.setInt(2,p.getId());
                ste.executeUpdate();
                System.out.println("livraison modifiée");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
    
        }
    
}
