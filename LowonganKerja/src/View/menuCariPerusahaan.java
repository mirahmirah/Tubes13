/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Button;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ISMA
 */
public class menuCariPerusahaan extends javax.swing.JFrame {

    /**
     * Creates new form menuCariPerusahaan
     */
    public menuCariPerusahaan() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        cariperusahaan = new javax.swing.JPanel();
        nmperusahaanlabel = new javax.swing.JLabel();
        nmperusahaan = new javax.swing.JTextField();
        btnCari = new java.awt.Button();
        buatberkas = new javax.swing.JPanel();
        skilllabel = new javax.swing.JLabel();
        pengalamanlabel = new javax.swing.JLabel();
        riwayatpendidikanlabel = new javax.swing.JLabel();
        skill = new javax.swing.JTextField();
        pengalaman = new javax.swing.JTextField();
        riwayatpendidikan = new javax.swing.JTextField();
        btnBuat = new javax.swing.JButton();
        infolowongankerja = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollBar();
        btnDaftar = new javax.swing.JButton();
        infolowongankerjascroll = new javax.swing.JScrollPane();
        lowongankerjalist = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nmperusahaanlabel.setFont(new java.awt.Font("Myriad Hebrew", 0, 14)); // NOI18N
        nmperusahaanlabel.setText("Nama Perusahaan :");
        nmperusahaanlabel.setName("nmperusahaanlabel"); // NOI18N

        nmperusahaan.setText("PT. Pertamina");
        nmperusahaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmperusahaanActionPerformed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCari.setLabel("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cariperusahaanLayout = new javax.swing.GroupLayout(cariperusahaan);
        cariperusahaan.setLayout(cariperusahaanLayout);
        cariperusahaanLayout.setHorizontalGroup(
            cariperusahaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cariperusahaanLayout.createSequentialGroup()
                .addGroup(cariperusahaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cariperusahaanLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(nmperusahaanlabel)
                        .addGap(18, 18, 18)
                        .addComponent(nmperusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cariperusahaanLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        cariperusahaanLayout.setVerticalGroup(
            cariperusahaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cariperusahaanLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(cariperusahaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nmperusahaanlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nmperusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jTabbedPane1.addTab("        Cari Perusahaan     ", cariperusahaan);

        skilllabel.setText("Skill                                 :");

        pengalamanlabel.setText("Pengalaman                   :");

        riwayatpendidikanlabel.setText("Riwayat Pendidikan       :");

        skill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillActionPerformed(evt);
            }
        });

        btnBuat.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnBuat.setText("Buat");

        javax.swing.GroupLayout buatberkasLayout = new javax.swing.GroupLayout(buatberkas);
        buatberkas.setLayout(buatberkasLayout);
        buatberkasLayout.setHorizontalGroup(
            buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatberkasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skilllabel)
                    .addComponent(pengalamanlabel)
                    .addComponent(riwayatpendidikanlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buatberkasLayout.createSequentialGroup()
                        .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pengalaman, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addComponent(skill))
                            .addComponent(riwayatpendidikan, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(buatberkasLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnBuat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(164, Short.MAX_VALUE))))
        );
        buatberkasLayout.setVerticalGroup(
            buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatberkasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skilllabel)
                    .addComponent(skill, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pengalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pengalamanlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(riwayatpendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(riwayatpendidikanlabel))
                .addGap(18, 18, 18)
                .addComponent(btnBuat)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("         Buat Berkas       ", buatberkas);

        btnDaftar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        btnDaftar.setText("Daftar");

        lowongankerjalist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        infolowongankerjascroll.setViewportView(lowongankerjalist);

        javax.swing.GroupLayout infolowongankerjaLayout = new javax.swing.GroupLayout(infolowongankerja);
        infolowongankerja.setLayout(infolowongankerjaLayout);
        infolowongankerjaLayout.setHorizontalGroup(
            infolowongankerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infolowongankerjaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(infolowongankerjascroll, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(infolowongankerjaLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnDaftar)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        infolowongankerjaLayout.setVerticalGroup(
            infolowongankerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infolowongankerjaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(infolowongankerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infolowongankerjascroll)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnDaftar)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("      Info Lowongan Kerja     ", infolowongankerja);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nmperusahaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmperusahaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmperusahaanActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed
    
    private void skillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skillActionPerformed

    public JButton getBtnBuat() {
        return btnBuat;
    }

    public Button getBtnCari() {
        return btnCari;
    }

    public JButton getBtnDaftar() {
        return btnDaftar;
    }

    public JPanel getBuatberkas() {
        return buatberkas;
    }

    public JPanel getCariperusahaan() {
        return cariperusahaan;
    }

    public JPanel getInfolowongankerja() {
        return infolowongankerja;
    }

    public JList<String> getLowongankerjalist() {
        return lowongankerjalist;
    }

    public JTextField getNmperusahaan() {
        return nmperusahaan;
    }

    public String getPengalaman() {
        return pengalaman.getText();
    }

    public String getRiwayatpendidikan() {
        return riwayatpendidikan.getText();
    }

    public String getSkill() {
        return skill.getText();
    }

    public void setNmperusahaan(String nmperusahaan) {
        this.nmperusahaan.setText(nmperusahaan);
    }

    public void setPengalaman(String pengalaman) {
        this.pengalaman.setText(pengalaman);
    }

    public void setRiwayatpendidikan(String riwayatpendidikan) {
        this.riwayatpendidikan.setText(riwayatpendidikan);
    }

    public void setSkill(String skill) {
        this.skill.setText(skill);
    }
    public void addListener(ActionListener e){
        btnBuat.addActionListener(e);
        btnCari.addActionListener(e);
        btnDaftar.addActionListener(e);
    }
    public void setLowonganKerjaList(String[] list){
        lowongankerjalist.setListData(list);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuat;
    private java.awt.Button btnCari;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JPanel buatberkas;
    private javax.swing.JPanel cariperusahaan;
    private javax.swing.JPanel infolowongankerja;
    private javax.swing.JScrollPane infolowongankerjascroll;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> lowongankerjalist;
    private javax.swing.JTextField nmperusahaan;
    private javax.swing.JLabel nmperusahaanlabel;
    private javax.swing.JTextField pengalaman;
    private javax.swing.JLabel pengalamanlabel;
    private javax.swing.JTextField riwayatpendidikan;
    private javax.swing.JLabel riwayatpendidikanlabel;
    private javax.swing.JScrollBar scroll;
    private javax.swing.JTextField skill;
    private javax.swing.JLabel skilllabel;
    // End of variables declaration//GEN-END:variables
}
