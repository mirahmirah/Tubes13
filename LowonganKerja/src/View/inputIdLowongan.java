/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author ISMA
 */
public class inputIdLowongan extends javax.swing.JFrame {

    /**
     * Creates new form inputIdLowongan
     */
    public inputIdLowongan() {
        initComponents();
    }

    public String getIdLowongan(){
        return idLowongan.getText();
    }
    
    public void setIdLowongan(String idLowongan){
        this.idLowongan.setText(idLowongan);
    }
    
    public JButton getBtnDaftar(){
        return btnDaftar;
    }
    public void addListener(ActionListener e){
        btnDaftar.addActionListener(e);
    }

    public String getNamaperusahaan() {
        return namaperusahaan.getText();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idlowongan = new javax.swing.JLabel();
        idLowongan = new javax.swing.JTextField();
        btnDaftar = new javax.swing.JButton();
        namaperusahaan = new javax.swing.JTextField();
        namaPerusahaan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idlowongan.setText("Id Lowongan   :");

        btnDaftar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        btnDaftar.setText("Daftar");

        namaperusahaan.setText("Daftar Kerja");
        namaperusahaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaperusahaanActionPerformed(evt);
            }
        });

        namaPerusahaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPerusahaanActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama Perusahaan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnDaftar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(namaperusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idlowongan)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaPerusahaan)
                            .addComponent(idLowongan, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(namaperusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLowongan, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idlowongan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(btnDaftar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaperusahaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaperusahaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaperusahaanActionPerformed

    private void namaPerusahaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPerusahaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPerusahaanActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JTextField idLowongan;
    private javax.swing.JLabel idlowongan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField namaPerusahaan;
    private javax.swing.JTextField namaperusahaan;
    // End of variables declaration//GEN-END:variables
}
