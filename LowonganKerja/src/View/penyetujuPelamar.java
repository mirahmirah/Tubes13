package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISMA
 */
public class penyetujuPelamar extends javax.swing.JFrame {

    /**
     * Creates new form penyetujuPelamar
     */
    public penyetujuPelamar() {
        initComponents();
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
        idPelamar = new javax.swing.JTextField();
        btnSetuju = new javax.swing.JButton();
        namajabatanfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idlowongan.setText("Id Pelamar       :");

        idPelamar.setText("003");
        idPelamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPelamarActionPerformed(evt);
            }
        });

        btnSetuju.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        btnSetuju.setText("Setuju");

        namajabatanfield.setText("Finance Manager");
        namajabatanfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namajabatanfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnSetuju))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(idlowongan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idPelamar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(namajabatanfield, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(namajabatanfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPelamar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idlowongan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(btnSetuju)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namajabatanfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namajabatanfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namajabatanfieldActionPerformed

    private void idPelamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPelamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPelamarActionPerformed

    /**
     * @param args the command line arguments
     */

    public JButton getBtnSetuju() {
        return btnSetuju;
    }

    public String getIdPelamar() {
        return idPelamar.getText();
    }

    public String getNamajabatanfield() {
        return namajabatanfield.getText();
    }

    public void addListener(ActionListener e){
        btnSetuju.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSetuju;
    private javax.swing.JTextField idPelamar;
    private javax.swing.JLabel idlowongan;
    private javax.swing.JTextField namajabatanfield;
    // End of variables declaration//GEN-END:variables
}
