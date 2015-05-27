/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.windows;

import com.tim10.glavna_knjiga.mappings.StavkeNaloga;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Omar
 */
public class Stavka extends javax.swing.JFrame {

    private Nalog _parent;
    private StavkeNaloga _stavka;
    
    /**
     * Creates new form Stavka
     */
    public Stavka() {
        initComponents();
    }
    
    public Stavka(Nalog parent, StavkeNaloga novaStavka) {
        initComponents();
        
        _parent = parent;
        _stavka = novaStavka;
        
        this.txtSifraNaloga.setText(_stavka.getNalozi().getSifraNaloga());
        this.btnSpasiIzmjene.setEnabled(false);
    }
    
    public Stavka(Nalog parent, String naziv, String dokument, String konto, String duguje, String potrazuje) {
        initComponents();
        
        _parent = parent;
        
        this.txtSifraNaloga.setText(_parent.getSifraNaloga());
        this.txtNaziv.setText(naziv);
        this.txtDokument.setText(dokument);
        this.txtSifraKonta.setText(konto);
        this.txtDuguje.setText(duguje);
        this.txtPotrazuje.setText(potrazuje);

        this.btnDodajStavku.setEnabled(false);
    }
    
    public Stavka(Nalog parent, StavkeNaloga stavka, String dokument, String konto) {
        initComponents();
        
        _parent = parent;
        _stavka = stavka;
        
        this.txtSifraNaloga.setText(_parent.getSifraNaloga());
        this.txtNaziv.setText(_stavka.getNaziv());
        this.txtDokument.setText(dokument);
        this.txtSifraKonta.setText(konto);
        this.txtDuguje.setValue(_stavka.getDuguje());
        this.txtPotrazuje.setValue(_stavka.getPotrazuje());

        this.btnDodajStavku.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSifraNaloga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDokument = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSifraKonta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtNalogDuguje = new javax.swing.JTextField();
        txtNalogPotrazuje = new javax.swing.JTextField();
        btnDodajStavku = new javax.swing.JButton();
        btnZatvori = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDuguje = new javax.swing.JFormattedTextField();
        txtPotrazuje = new javax.swing.JFormattedTextField();
        btnSpasiIzmjene = new javax.swing.JButton();
        lbErrorMsg = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSifraKlijenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STAVKA KNJIŽENJA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Šifra Naloga:");

        txtSifraNaloga.setEditable(false);
        txtSifraNaloga.setBackground(new java.awt.Color(204, 204, 204));
        txtSifraNaloga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSifraNaloga.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Naziv:");

        txtNaziv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNaziv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Dokument:");

        txtDokument.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDokument.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Šifra Konta:");

        txtSifraKonta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSifraKonta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("DUGUJE:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("POTRAŽUJE:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Stanje Naloga:");

        txtNalogDuguje.setEditable(false);
        txtNalogDuguje.setBackground(new java.awt.Color(204, 204, 204));
        txtNalogDuguje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNalogDuguje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNalogDuguje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNalogDuguje.setFocusable(false);

        txtNalogPotrazuje.setEditable(false);
        txtNalogPotrazuje.setBackground(new java.awt.Color(204, 204, 204));
        txtNalogPotrazuje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNalogPotrazuje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNalogPotrazuje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNalogPotrazuje.setFocusable(false);

        btnDodajStavku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDodajStavku.setText("Dodaj Stavku");
        btnDodajStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajStavkuActionPerformed(evt);
            }
        });

        btnZatvori.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnZatvori.setText("Zatvori");
        btnZatvori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZatvoriActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("KM");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("KM");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("KM");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("KM");

        txtDuguje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtDuguje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtDuguje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDuguje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPotrazuje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtPotrazuje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPotrazuje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPotrazuje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSpasiIzmjene.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSpasiIzmjene.setText("Spasi Izmjene");
        btnSpasiIzmjene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpasiIzmjeneActionPerformed(evt);
            }
        });

        lbErrorMsg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErrorMsg.setForeground(new java.awt.Color(255, 51, 51));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Šifra Klijenta:");
        jLabel13.setToolTipText("");

        txtSifraKlijenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSifraKlijenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDokument, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSifraNaloga, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSifraKlijenta, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSifraKonta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1)
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbErrorMsg)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtNalogDuguje)
                                                    .addComponent(txtDuguje, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(37, 37, 37)
                                                        .addComponent(jLabel7))
                                                    .addComponent(jLabel12))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtPotrazuje)
                                                    .addComponent(txtNalogPotrazuje, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addComponent(btnDodajStavku)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSpasiIzmjene)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnZatvori)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSifraNaloga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDokument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSifraKonta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSifraKlijenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(28, 28, 28)
                .addComponent(lbErrorMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(txtDuguje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPotrazuje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNalogPotrazuje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNalogDuguje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajStavku)
                    .addComponent(btnZatvori)
                    .addComponent(btnSpasiIzmjene))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(629, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnZatvoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZatvoriActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnZatvoriActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        _parent.setEnabled(true);
        _parent.setFocusOnDodajStavku();
    }//GEN-LAST:event_formWindowClosed

    private void btnDodajStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajStavkuActionPerformed
        
        clearErrorMsg();
        
        if (this.txtSifraKonta.getText().isEmpty() || this.txtNaziv.getText().isEmpty() || this.txtDokument.getText().isEmpty() || this.txtDuguje.getText().isEmpty() || this.txtPotrazuje.getText().isEmpty())
        {
            setErrorMsg("Molimo unesite sva polja.");
            
            return;
        }
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        
        Object[] dataRow = new Object[]{this.txtSifraKonta.getText(),
                                        this.txtNaziv.getText(),
                                        this.txtDokument.getText(),
                                        dateFormat.format(currentDate),
                                        this.txtDuguje.getText(),
                                        this.txtPotrazuje.getText(),
                                        -1};

        _parent.addDataRow(dataRow);

        this.dispose();
    }//GEN-LAST:event_btnDodajStavkuActionPerformed

    private void btnSpasiIzmjeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpasiIzmjeneActionPerformed
        
        clearErrorMsg();
        
        if (this.txtSifraKonta.getText().isEmpty() || this.txtNaziv.getText().isEmpty() || this.txtDokument.getText().isEmpty() || this.txtDuguje.getText().isEmpty() || this.txtPotrazuje.getText().isEmpty())
        {
            setErrorMsg("Molimo unesite sva polja.");
            
            return;
        }
        
        if (_stavka != null)
        {
            // implement
        }
        else
        {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date currentDate = new Date();
            
            Object[] dataRow = new Object[]{this.txtSifraKonta.getText(),
                                        this.txtNaziv.getText(),
                                        this.txtDokument.getText(),
                                        dateFormat.format(currentDate),
                                        this.txtDuguje.getText(),
                                        this.txtPotrazuje.getText()
            };
            
            _parent.updateDataRow(dataRow);
        }
        
        this.dispose();
    }//GEN-LAST:event_btnSpasiIzmjeneActionPerformed

    public void setErrorMsg(String msg) {
        this.lbErrorMsg.setText(msg);
    }
    
    public void clearErrorMsg() {
        this.lbErrorMsg.setText("");
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
            java.util.logging.Logger.getLogger(Stavka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stavka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stavka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stavka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stavka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajStavku;
    private javax.swing.JButton btnSpasiIzmjene;
    private javax.swing.JButton btnZatvori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbErrorMsg;
    private javax.swing.JTextField txtDokument;
    private javax.swing.JFormattedTextField txtDuguje;
    private javax.swing.JTextField txtNalogDuguje;
    private javax.swing.JTextField txtNalogPotrazuje;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JFormattedTextField txtPotrazuje;
    private javax.swing.JTextField txtSifraKlijenta;
    private javax.swing.JTextField txtSifraKonta;
    private javax.swing.JTextField txtSifraNaloga;
    // End of variables declaration//GEN-END:variables
}
