package guiaplikacijazaelektronskovodjenjekafica;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GlavniFrame extends javax.swing.JFrame {
    
    private static Korisnik k;

    public GlavniFrame(Korisnik k){
        this.k=k;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setBackground(new java.awt.Color(255, 204, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("Sto 1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 60));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Sto 2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 80, 60));

        jButton12.setBackground(new java.awt.Color(255, 204, 204));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText("Sto 3");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 80, 60));

        jButton13.setBackground(new java.awt.Color(255, 204, 204));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setText("Sto 4");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 80, 60));

        jButton14.setBackground(new java.awt.Color(255, 204, 204));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setText("Sto 5");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 80, 60));

        jButton15.setBackground(new java.awt.Color(255, 204, 204));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setText("Sto 6");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 80, 60));

        jButton16.setBackground(new java.awt.Color(255, 204, 204));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setText("Sto 7");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 80, 60));

        jButton17.setBackground(new java.awt.Color(255, 204, 204));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setText("Sto 8");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 80, 60));

        jButton18.setBackground(new java.awt.Color(255, 204, 204));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setText("Sto 9");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 80, 60));

        jButton19.setBackground(new java.awt.Color(255, 204, 204));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("Sto 10");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 80, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 660, 600));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\t\tKonobar:\n\n  Ime:  "+k.getIme()+"\n\n  Prezime:  "+k.getPrezime()+"\n\n");
        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 160));

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CallCentar!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButton3)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 330, 430));

        pack();
    }// </editor-fold>                        

    
    IzborPica iSto1 = new IzborPica();
    IzborPica iSto2 = new IzborPica();
    IzborPica iSto3 = new IzborPica();
    IzborPica iSto4 = new IzborPica();
    IzborPica iSto5 = new IzborPica();
    IzborPica iSto6 = new IzborPica();
    IzborPica iSto7 = new IzborPica();
    IzborPica iSto8 = new IzborPica();
    IzborPica iSto9 = new IzborPica();
    IzborPica iSto10 = new IzborPica();
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        iSto1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iSto1.setTitle("Sto 1");
        iSto1.setLocationRelativeTo(null);
        iSto1.setVisible(true);
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        iSto2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iSto2.setTitle("Sto 2");
        iSto2.setLocationRelativeTo(null);
        iSto2.setVisible(true);
    }                                        

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        iSto3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iSto3.setTitle("Sto 3");
        iSto3.setLocationRelativeTo(null);
        iSto3.setVisible(true);
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        iSto4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iSto4.setTitle("Sto 4");
        iSto4.setLocationRelativeTo(null);
        iSto4.setVisible(true);
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        iSto5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iSto5.setTitle("Sto 5");
        iSto5.setLocationRelativeTo(null);
        iSto5.setVisible(true);
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        iSto6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iSto6.setTitle("Sto 6");
        iSto6.setLocationRelativeTo(null);
        iSto6.setVisible(true);
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        iSto7.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iSto7.setTitle("Sto 7");
        iSto7.setLocationRelativeTo(null);
        iSto7.setVisible(true);
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        iSto8.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iSto8.setTitle("Sto 8");
        iSto8.setLocationRelativeTo(null);
        iSto8.setVisible(true);
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        iSto9.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iSto9.setTitle("Sto 9");
        iSto9.setLocationRelativeTo(null);
        iSto9.setVisible(true);
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        iSto10.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iSto10.setTitle("Sto 10");
        iSto10.setLocationRelativeTo(null);
        iSto10.setVisible(true);
    }                                         

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JOptionPane.showMessageDialog(null, "Za bilo kakvu podrsku, nazovite broj sa ekrana: 060/037-1768");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        LoginFrame frame1 = new LoginFrame();
        dispose();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setTitle("Login Frame!");
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        iSto1.dispose();
        iSto2.dispose();
        iSto3.dispose();
        iSto4.dispose();
        iSto5.dispose();
        iSto6.dispose();
        iSto7.dispose();
        iSto8.dispose();
        iSto9.dispose();
        iSto10.dispose();
        
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
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
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}

