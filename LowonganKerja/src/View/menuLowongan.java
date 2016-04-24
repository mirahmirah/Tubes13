/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.BerkasLamaran;
import Model.Lowongan;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ISMA
 */
public class menuLowongan extends javax.swing.JFrame {

    public String getNamaLowongan() {
        return namaLowonganfield.getText();
    }

    public Date getDeadline() {
        return (Date) date.getValue();
    }

    public JButton getAdd() {
        return btnAdd;
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



    public JButton getBtnHapus() {
        return btnHapus;
    }

    public String getIdlowongan1field() {
        return idlowongan1field.getText();
    }

    public void setIdlowongan1field(String idlowongan1field) {
        this.idlowongan1field.setText(idlowongan1field);
    }
    public void viewAll(){
        
    }
    public int getSelected(){
        return tblLowongan.getSelectedRow();
    }
    public void addAdapter(MouseAdapter e){
        tblLowongan.addMouseListener(e);
    }
    
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        buatlowongan = new javax.swing.JPanel();
        namalowongan = new javax.swing.JLabel();
        deadline = new javax.swing.JLabel();
        namaLowonganfield = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        date = new javax.swing.JSpinner();
        daftarlowongan = new javax.swing.JPanel();
        btnLihat = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLowongan = new javax.swing.JTable();
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

        namalowongan.setText("Nama Lowongan        :");

        deadline.setText("Deadline                    :");

        namaLowonganfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaLowonganfieldActionPerformed(evt);
            }
        });

        btnAdd.setText("Tambah");

        date.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout buatlowonganLayout = new javax.swing.GroupLayout(buatlowongan);
        buatlowongan.setLayout(buatlowonganLayout);
        buatlowonganLayout.setHorizontalGroup(
            buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatlowonganLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd)
                    .addGroup(buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(buatlowonganLayout.createSequentialGroup()
                            .addComponent(namalowongan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(namaLowonganfield, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(buatlowonganLayout.createSequentialGroup()
                            .addComponent(deadline)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(date))))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        buatlowonganLayout.setVerticalGroup(
            buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatlowonganLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namalowongan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLowonganfield))
                .addGap(18, 18, 18)
                .addGroup(buatlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(btnAdd)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("       Buat Lowongan       ", buatlowongan);

        btnLihat.setText("Lihat");

        tblLowongan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblLowongan);

        javax.swing.GroupLayout daftarlowonganLayout = new javax.swing.GroupLayout(daftarlowongan);
        daftarlowongan.setLayout(daftarlowonganLayout);
        daftarlowonganLayout.setHorizontalGroup(
            daftarlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daftarlowonganLayout.createSequentialGroup()
                .addGroup(daftarlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(daftarlowonganLayout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(btnLihat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daftarlowonganLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        daftarlowonganLayout.setVerticalGroup(
            daftarlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarlowonganLayout.createSequentialGroup()
                .addGroup(daftarlowonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(daftarlowonganLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(daftarlowonganLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLihat)))
                .addContainerGap(201, Short.MAX_VALUE))
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
                .addContainerGap(178, Short.MAX_VALUE))
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
                .addContainerGap(298, Short.MAX_VALUE))
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
            .addComponent(jTabbedPane1)
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
    private javax.swing.JSpinner date;
    private javax.swing.JLabel deadline;
    private javax.swing.JPanel hapuslowongan;
    private javax.swing.JLabel idlowongan1;
    private javax.swing.JTextField idlowongan1field;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField namaLowonganfield;
    private javax.swing.JLabel namalowongan;
    private javax.swing.JTable tblLowongan;
    // End of variables declaration//GEN-END:variables
}
