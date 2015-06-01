/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.windows;

import com.tim10.glavna_knjiga.session.UserData;
import java.awt.Color;

/**
 *
 * @author faruk
 */
public class HomeFrameRacunovodja extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrameRacunovodja
     */
    public HomeFrameRacunovodja() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        
        initializeData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setText("Ime:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 170, 93, 21);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Trenutno ste ulogovani kao:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(190, 80, 396, 32);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.gray);
        jLabel2.setText("Prezime:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 220, 116, 21);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.gray);
        jLabel3.setText("Korisnicko ime:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 280, 191, 21);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.gray);
        jLabel4.setText("Broj kreiranih naloga:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 330, 261, 21);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 84, 0));
        jLabel5.setText("Ime:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(520, 160, 180, 24);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 84, 0));
        jLabel6.setText("Prezime:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(520, 220, 179, 24);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 84, 0));
        jLabel7.setText("Korisnicko ime:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 280, 196, 24);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 10, 540, 520);

        jMenuBar1.setBackground(new java.awt.Color(51, 153, 255));
        jMenuBar1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

        jMenu1.setForeground(java.awt.Color.white);
        jMenu1.setText("Konto opcije");
        jMenu1.setToolTipText("");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(0, 0, 0, 50));
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 25));

        jMenuItem1.setText("Kontni plan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Kontni okvir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setForeground(java.awt.Color.white);
        jMenu3.setText("Nalog opcije");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(0, 0, 0, 50));
        jMenu3.setPreferredSize(new java.awt.Dimension(200, 25));

        jMenuItem3.setText("Kreiraj novi nalog");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Pregled Naloga");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Izvještaj opcije");
        jMenu4.setActionCommand("Izveštaj opcije");
        jMenu4.setContentAreaFilled(false);
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(200, 25));

        jMenuItem5.setText("Izvještaj bilansa stanja");
        jMenuItem5.setToolTipText("");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Izvještaj bilansa uspjeha");
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu2.setForeground(java.awt.Color.white);
        jMenu2.setText("Help");
        jMenu2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 24));
        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.out.println("go...");
        KontniPlanFrame kontniPlanFrame = new KontniPlanFrame();
        kontniPlanFrame.setLocation(this.getX(), this.getY() + this.getHeight() / 2);
        kontniPlanFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        KontniOkvirFrameView kontniOkvirFrameView = new KontniOkvirFrameView();
        kontniOkvirFrameView.setLocation(this.getX(), this.getY() + this.getHeight() / 2);
        kontniOkvirFrameView.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setEnabled(false);
        
        Nalog noviNalog = new Nalog(this);
        noviNalog.setVisible(true);
        noviNalog.setBigTitle("NOVI NALOG");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.setEnabled(false);
        
        PregledNaloga nalozi = new PregledNaloga(this);
        nalozi.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public void refreshData() {
    }
           
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrameRacunovodja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrameRacunovodja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrameRacunovodja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrameRacunovodja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrameRacunovodja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    private void initializeData() {
        this.jLabel5.setText(UserData.getKorisnik().getIme());
        this.jLabel6.setText(UserData.getKorisnik().getPrezime());
        this.jLabel7.setText(UserData.getKorisnik().getKorisnickoIme());
        //this.jLabel8.setText(UserData.getKorisnik().getIme());
    }
}
