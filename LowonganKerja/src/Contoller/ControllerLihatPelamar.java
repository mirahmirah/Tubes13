/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import View.lihatPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Aplikasi;
import Model.BerkasLamaran;
import Model.Lowongan;
import Model.Perusahaan;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
class ControllerLihatPelamar extends MouseAdapter implements ActionListener{
        private Aplikasi model;
        private lihatPelamar view;
        private Perusahaan p;
        private int idLowongan;
        private int idPelamar;
        private Lowongan lowongan;
    public ControllerLihatPelamar(Aplikasi model, Perusahaan p,int idLowongan) {
        this.model = model;
        this.p=p;
        this.idLowongan=idLowongan;
        view = new lihatPelamar();
        view.setVisible(true);
        view.addListener(this);
        view.addAdapter(this);
        view.viewAll(model.getBerkas(idLowongan));
        lowongan=p.getLowongan(idLowongan);
        lowongan.setBerkasMasuk(model.getBerkas(idLowongan));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        System.out.println("idPelamar"+idPelamar);
        System.out.println(""+lowongan.getBerkas(idPelamar).getIdBerkas());
        System.out.println(""+lowongan.getBerkas(idPelamar).getNama());
        if(source.equals(view.getBtnTerima())){
            p.getLowongan(idLowongan).pindahBerkas(lowongan.getBerkas(idPelamar).getIdBerkas());
            model.pindahBerkas(lowongan.getBerkas(idPelamar).getIdBerkas(), idLowongan);
            JOptionPane.showMessageDialog(null, "Data telah diApprove!");
            view.dispose();
            view.viewAll(model.getBerkas(idLowongan));
            lowongan.setBerkasMasuk(model.getBerkas(idLowongan));
        }
    }
    public void MouseClicked(MouseEvent e){
        if(e.getSource().equals(view.getTblBerkas())){
            idPelamar=view.getSelected();
        }
    }    
}
