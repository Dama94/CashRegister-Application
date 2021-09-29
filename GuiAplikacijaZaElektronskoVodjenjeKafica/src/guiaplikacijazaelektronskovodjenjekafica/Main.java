
package guiaplikacijazaelektronskovodjenjekafica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Main {

 static Connection conn = null;

    public static void konektujSe() {
        String url = "jdbc:mysql://127.0.0.1:3306/kafiic";
        String user = "root";
        String pass = "anaivana8";
        try {
            conn = DriverManager.getConnection(url, user, pass);
            if(conn==null)
                     System.out.println("Nema konecije");
            else
                     System.out.println("Ima konekcije");
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        konektujSe();
        PocetniFrame frame = new PocetniFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login Frame!");
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
