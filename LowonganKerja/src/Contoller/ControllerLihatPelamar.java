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
import Model.Perusahaan;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
class ControllerLihatPelamar implements ActionListener{
        private Aplikasi model;
        private lihatPelamar view;
        private Perusahaan p;
        private int idBerkas;
        private int idPelamar;
    public ControllerLihatPelamar(Aplikasi model, Perusahaan p,int idBerkas) {
        this.model = model;
        this.p=p;
        this.idBerkas=idBerkas;
        view = new lihatPelamar();
        view.setVisible(true);
        view.addListener(this);        
        view.viewAll(model.getBerkas(idBerkas));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnTerima())){
            model.pindahBerkas(idPelamar, idBerkas);
            JOptionPane.showMessageDialog(null, "Data telah diApprove!");
//            new ControllerListPelamar(model,idPelamar,idLowongan);
            view.dispose();
        }
    }
    public void MouseClicked(MouseEvent e){
        if(e.getSource().equals(view.getSelected())){
            idPelamar=view.getSelected();
        }
    }
        
        
    
}
