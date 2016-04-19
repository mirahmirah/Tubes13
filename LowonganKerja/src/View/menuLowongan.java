/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author ISMA
 */
public class menuLowongan extends javax.swing.JFrame {

    public String getIdLowongan() {
        return idLowonganfield.getText();
    }

    public String getNamaLowongan() {
        return namaLowonganfield.getText();
    }

    public String getDeadline() {
        return deadlinefield.getText();
    }

    public JButton getAdd() {
        return btnAdd;
    }

    public void setDeadline(String deadline) {
        this.deadlinefield.setText(deadline);
    }

    public void setIdLowongan(String idLowongan) {
        this.idLowonganfield.setText(idLowongan);
    }
    
    public void setNamaLowongan(String namaLowongan) {
        this.namaLowonganfield.setText(namaLowongan);
    }
    
    public void addListener(ActionListener e){
        btnAdd.addActionListener(e);
    }
    public menuLowongan() {
        initComponents();
    }

    public JButton getBtnLihat() {
        return btnLihat;
    }

    public JList<String> getListdaftarlowongan() {
        return listdaftarlowongan;
    }

    public void setListdaftarlowongan(String[] listdaftarlowongan) {
        this.listdaftarlowongan.setListData(listdaftarlowongan);
    }

    public JButton getBtnHapus() {
        return btnHapus;
    }

    public String getIdlowongan1field() {
        return idlowongan1field.getText();
    }

    public void setIdlowongan1field(String idlowongan1field) {
        this.idlowongan1field.setText(idlowongan1field);
    }
    
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        buatlowongan = new javax.swing.JPanel();
        idlowongan = new javax.swing.JLabel();
        namalowongan = new javax.swing.JLabel();
        deadline = new javax.swing.JLabel();
        namaLowonganfield = new javax.swing.JTextField();
        idLowonganfield = new javax.swing.JTextField();
        deadlinefield = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        daftarlowongan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listdaftarlowongan = new javax.swing.JList<>();
        btnLihat = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        hapuslowongan = new javax.swing.JPanel();
        idlowongan1 = new javax.swing.JLabel();
        idlowongan1field = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idlowongan.setText("Id Lowongan              :");

        namalowongan.setText("Nama Lowongan        :");

        deadline.setText("Deadline                    :");

        namaLowonganfield.setText("jTextField1");
        namaLowonganfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaLowonganfieldActionPerformed(evt);
            }
        });

        idLowonganfield.setText("jTextField1");

        deadlinefield.setText("jTextField3");

        btnAdd.setText("Tambah");

        javax.swing.GroupLayout buatlowonganLayout = new javax.swing.GroupLayout(buatlowongan);
        buatlowongan.setLayout(buatlowonganLayout);
        buatlowonganLayout.setHorizontalGroup(
            buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatlowonganLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buatlowonganLayout.createSequentialGroup()
                        .addComponent(idlowongan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idLowonganfield, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd)
                        .addGroup(buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(buatlowonganLayout.createSequentialGroup()
                                .addComponent(deadline)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deadlinefield))
                            .addGroup(buatlowonganLayout.createSequentialGroup()
                                .addComponent(namalowongan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaLowonganfield, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        buatlowonganLayout.setVerticalGroup(
            buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatlowonganLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idlowongan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLowonganfield))
                .addGap(16, 16, 16)
                .addGroup(buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namalowongan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLowonganfield))
                .addGap(34, 34, 34)
                .addGroup(buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deadlinefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnAdd)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("       Buat Lowongan       ", buatlowongan);

        listdaftarlowongan.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listdaftarlowongan);

        btnLihat.setText("Lihat");

        javax.swing.GroupLayout daftarlowonganLayout = new javax.swing.GroupLayout(daftarlowongan);
        daftarlowongan.setLayout(daftarlowonganLayout);
        daftarlowonganLayout.setHorizontalGroup(
            daftarlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarlowonganLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(daftarlowonganLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnLihat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        daftarlowonganLayout.setVerticalGroup(
            daftarlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarlowonganLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(daftarlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(btnLihat)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("       Daftar Lowongan       ", daftarlowongan);

        idlowongan1.setText("Id Lowongan   : ");

        btnHapus.setText("Hapus");

        javax.swing.GroupLayout hapuslowonganLayout = new javax.swing.GroupLayout(hapuslowongan);
        hapuslowongan.setLayout(hapuslowonganLayout);
        hapuslowonganLayout.setHorizontalGroup(
            hapuslowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hapuslowonganLayout.createSequentialGroup()
                .addGroup(hapuslowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hapuslowonganLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(idlowongan1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idlowongan1field, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hapuslowonganLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnHapus)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        hapuslowonganLayout.setVerticalGroup(
            hapuslowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hapuslowonganLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(hapuslowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlowongan1)
                    .addComponent(idlowongan1field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(btnHapus)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("       Hapus Lowongan      ", hapuslowongan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaLowonganfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaLowonganfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaLowonganfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLihat;
    private javax.swing.JPanel buatlowongan;
    private javax.swing.JPanel daftarlowongan;
    private javax.swing.JLabel deadline;
    private javax.swing.JTextField deadlinefield;
    private javax.swing.JPanel hapuslowongan;
    private javax.swing.JTextField idLowonganfield;
    private javax.swing.JLabel idlowongan;
    private javax.swing.JLabel idlowongan1;
    private javax.swing.JTextField idlowongan1field;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listdaftarlowongan;
    private javax.swing.JTextField namaLowonganfield;
    private javax.swing.JLabel namalowongan;
    // End of variables declaration//GEN-END:variables
}
