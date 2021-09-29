package guiaplikacijazaelektronskovodjenjekafica;

import static guiaplikacijazaelektronskovodjenjekafica.Main.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;


public class IzborPica extends javax.swing.JFrame {
 Pica p;
 String ime;
 int cena;
 List<Pica> listaPica = new ArrayList<>();
 int ukCena = 0;

     public Pica nadjiPice(String ime){
        
        String upit = "select * from pica where proizvod ='"+ime+"';";
            try {
                PreparedStatement pst = conn.prepareStatement(upit);
                ResultSet rs = pst.executeQuery();
                Pica p = new Pica();
                if(rs.next()){
                    p.setId(rs.getInt(1));
                    p.setIme(rs.getString(2));
                    p.setCena(rs.getInt(3));
                    Porudzbine.setText(Porudzbine.getText() + ime + " " + p.getCena() + "\n");
                    listaPica.add(p);
                    //pogledano na netu!
                    int ukupnaCena = 0;
                    for(int i=0; i<listaPica.size(); i++) {
                        ukupnaCena += listaPica.get(i).getCena();
                    }
                    ukCena = ukupnaCena;
                    
                    String s = Porudzbine.getText();
                    int indexUkupneCene = s.indexOf("Ukupna cena je");
                    if(indexUkupneCene == -1) {
                        Porudzbine.setText(s + "Ukupna cena je: " + ukupnaCena + "\n");
                        return p;
                    }
                    String tekstPreUkupneCene = s.substring(0, indexUkupneCene);
                    
                    String svePosleUkupneCene = s.substring(s.indexOf("\n", indexUkupneCene));
                    
                    Porudzbine.setText(tekstPreUkupneCene + svePosleUkupneCene + "Ukupna cena je: " + ukupnaCena + "\n");
                    //kraj!
                    return p;
                }
                else 
                    JOptionPane.showMessageDialog(null, "Nema pica");
                return null;
            } catch (SQLException ex) {
                Logger.getLogger(IzborPica.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
           return null; 
    }
    
    
     
    public IzborPica() {
        this.p=p;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Porudzbine = new javax.swing.JTextArea();
        jButton64 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Esspreso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 90));

        jButton2.setBackground(new java.awt.Color(153, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Esspreso sa mlekom");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 90));

        jButton3.setBackground(new java.awt.Color(153, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton3.setText("Domaca kafa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 90));

        jButton4.setBackground(new java.awt.Color(153, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton4.setText("Nescafe");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 90));

        jButton5.setBackground(new java.awt.Color(153, 0, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton5.setText("Caj");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 90));

        jButton6.setBackground(new java.awt.Color(153, 0, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton6.setText("Cappuccino");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 150, 90));

        jButton7.setBackground(new java.awt.Color(153, 0, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton7.setText("Ice coffee");
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 90));

        jButton8.setBackground(new java.awt.Color(153, 0, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton8.setText("Topla Cokolada");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, 90));

        jButton9.setBackground(new java.awt.Color(153, 0, 51));
        jButton9.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton9.setText("Nescafe sa slagom");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, 90));

        jTabbedPane1.addTab("Topli Naptici", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setBackground(new java.awt.Color(0, 102, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton10.setText("Coca-Cola");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 90));

        jButton11.setBackground(new java.awt.Color(0, 102, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton11.setText("Sprite");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 90));

        jButton12.setBackground(new java.awt.Color(0, 102, 204));
        jButton12.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton12.setText("Fanta");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 90));

        jButton13.setBackground(new java.awt.Color(0, 102, 204));
        jButton13.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton13.setText("Djus");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 90));

        jButton14.setBackground(new java.awt.Color(0, 102, 204));
        jButton14.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton14.setText("Cedjena pomorandza");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 90));

        jButton15.setBackground(new java.awt.Color(0, 102, 204));
        jButton15.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton15.setText("Nestea");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 150, 90));

        jButton16.setBackground(new java.awt.Color(0, 102, 204));
        jButton16.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton16.setText("Coca-Cola zero");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 90));

        jButton17.setBackground(new java.awt.Color(0, 102, 204));
        jButton17.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton17.setText("Schweppes");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, 90));

        jButton18.setBackground(new java.awt.Color(0, 102, 204));
        jButton18.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton18.setText("Ultra");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, 90));

        jButton19.setBackground(new java.awt.Color(0, 102, 204));
        jButton19.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton19.setText("Guarana");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 150, 90));

        jButton20.setBackground(new java.awt.Color(0, 102, 204));
        jButton20.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton20.setText("Jabuka");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 150, 90));

        jButton21.setBackground(new java.awt.Color(0, 102, 204));
        jButton21.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton21.setText("Limunada");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 150, 90));

        jButton22.setBackground(new java.awt.Color(0, 102, 204));
        jButton22.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton22.setText("Knjaz Milos");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 150, 90));

        jButton23.setBackground(new java.awt.Color(0, 102, 204));
        jButton23.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton23.setText("Rosa");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 150, 90));

        jButton24.setBackground(new java.awt.Color(0, 102, 204));
        jButton24.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton24.setText("RedBull");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 150, 90));

        jTabbedPane1.addTab("Bezalkoh. pica", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton25.setBackground(new java.awt.Color(255, 153, 153));
        jButton25.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton25.setText("Vranac crveno");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 90));

        jButton26.setBackground(new java.awt.Color(255, 153, 153));
        jButton26.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton26.setText("Vranac belo");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 90));

        jButton27.setBackground(new java.awt.Color(255, 153, 153));
        jButton27.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton27.setText("Vranac 0.75");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 90));

        jButton28.setBackground(new java.awt.Color(255, 153, 153));
        jButton28.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton28.setText("Zvonko Bogdan crveno");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 90));

        jButton29.setBackground(new java.awt.Color(255, 153, 153));
        jButton29.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton29.setText("Zvonko Bogdan belo");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 90));

        jButton30.setBackground(new java.awt.Color(255, 153, 153));
        jButton30.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton30.setText("Zvonko Bogdan 0.75");
        jButton30.setToolTipText("");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 150, 90));

        jButton31.setBackground(new java.awt.Color(255, 153, 153));
        jButton31.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton31.setText("13.jul crveno");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 90));

        jButton32.setBackground(new java.awt.Color(255, 153, 153));
        jButton32.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton32.setText("13.jul belo");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, 90));

        jButton33.setBackground(new java.awt.Color(255, 153, 153));
        jButton33.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton33.setText("13.jul 0.75");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, 90));

        jTabbedPane1.addTab("Vina", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton34.setBackground(new java.awt.Color(153, 153, 0));
        jButton34.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton34.setText("Zajecarsko");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 90));

        jButton35.setBackground(new java.awt.Color(153, 153, 0));
        jButton35.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton35.setText("Niksicko svetlo");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 90));

        jButton36.setBackground(new java.awt.Color(153, 153, 0));
        jButton36.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton36.setText("Niksicko tamno");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 90));

        jButton37.setBackground(new java.awt.Color(153, 153, 0));
        jButton37.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton37.setText("Heineken");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 90));

        jButton38.setBackground(new java.awt.Color(153, 153, 0));
        jButton38.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton38.setText("Lasko");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 90));

        jButton39.setBackground(new java.awt.Color(153, 153, 0));
        jButton39.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton39.setText("Zajecarsko 0.3");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 150, 90));

        jButton40.setBackground(new java.awt.Color(153, 153, 0));
        jButton40.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton40.setText("Niksicko svetlo 0.3");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 90));

        jButton41.setBackground(new java.awt.Color(153, 153, 0));
        jButton41.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton41.setText("Niksicko tamno 0.3");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, 90));

        jButton42.setBackground(new java.awt.Color(153, 153, 0));
        jButton42.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton42.setText("Heineken 0.3");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, 90));

        jTabbedPane1.addTab("Piva", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton43.setBackground(new java.awt.Color(153, 153, 153));
        jButton43.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton43.setText("Domaca Sljiva");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 90));

        jButton44.setBackground(new java.awt.Color(153, 153, 153));
        jButton44.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton44.setText("Vinjak");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 90));

        jButton45.setBackground(new java.awt.Color(153, 153, 153));
        jButton45.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton45.setText("Pelinkovac");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 90));

        jButton46.setBackground(new java.awt.Color(153, 153, 153));
        jButton46.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton46.setText("Vermut");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 90));

        jButton47.setBackground(new java.awt.Color(153, 153, 153));
        jButton47.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton47.setText("Votka");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 90));

        jButton48.setBackground(new java.awt.Color(153, 153, 153));
        jButton48.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton48.setText("Dzin");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 150, 90));

        jButton49.setBackground(new java.awt.Color(153, 153, 153));
        jButton49.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton49.setText("Jack Danniels");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 90));

        jButton50.setBackground(new java.awt.Color(153, 153, 153));
        jButton50.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton50.setText("Johnny Walker");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, 90));

        jButton51.setBackground(new java.awt.Color(153, 153, 153));
        jButton51.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton51.setText("Domaca kajsija");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, 90));

        jButton52.setBackground(new java.awt.Color(153, 153, 153));
        jButton52.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton52.setText("Viljamovka");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 150, 90));

        jButton53.setBackground(new java.awt.Color(153, 153, 153));
        jButton53.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton53.setText("Baileys");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 150, 90));

        jButton54.setBackground(new java.awt.Color(153, 153, 153));
        jButton54.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton54.setText("Campari");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 150, 90));

        jTabbedPane1.addTab("Zestina", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton55.setBackground(new java.awt.Color(0, 204, 204));
        jButton55.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton55.setText("Banana sejk");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 90));

        jButton56.setBackground(new java.awt.Color(0, 204, 204));
        jButton56.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton56.setText("Plazma sejk");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 90));

        jButton57.setBackground(new java.awt.Color(0, 204, 204));
        jButton57.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton57.setText("Long Island icetea");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 90));

        jButton58.setBackground(new java.awt.Color(0, 204, 204));
        jButton58.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton58.setText("Blue frog/red frog");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 90));

        jButton59.setBackground(new java.awt.Color(0, 204, 204));
        jButton59.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton59.setText("Bloody Mary");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 90));

        jButton60.setBackground(new java.awt.Color(0, 204, 204));
        jButton60.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton60.setText("Tequila sunrise");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 150, 90));

        jButton61.setBackground(new java.awt.Color(0, 204, 204));
        jButton61.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton61.setText("Cuba libre");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 90));

        jTabbedPane1.addTab("KokteliIsejkovi", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 460, 500));

        Porudzbine.setColumns(20);
        Porudzbine.setRows(5);
        Porudzbine.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PorudzbineAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(Porudzbine);

        jButton64.setText("Ponisti porudzbinu");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 600));

        jButton62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton62.setText("Nazad");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 553, 110, 50));

        jButton63.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton63.setText("Naplati");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 513, 130, 90));

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {                                          
      ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ime = evt.getActionCommand();
        p=nadjiPice(ime);
        System.out.println(evt.getActionCommand());
        System.out.println(p);
    }                                         

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.setVisible(false);
    }                                         

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        JOptionPane.showMessageDialog(null, "Izdat je racun sa ukupnom cenom: " + ukCena+" RSD.");
        Porudzbine.setText("");
        listaPica.clear();
        ukCena = 0;
        this.dispose();
    }                                         

    private void PorudzbineAncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        
    }                                        

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Ocistili ste porudzbinu");
        Porudzbine.setText("");
        listaPica.clear();
        ukCena=0;
        
    }                                         

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea Porudzbine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration                   
}
