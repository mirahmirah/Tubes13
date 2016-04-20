/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import View.lihatPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lowongankerja.AplikasiConsole;
import lowongankerja.Perusahaan;

/**
 *
 * @author user
 */
class ControllerLihatPelamar implements ActionListener{
        private AplikasiConsole model;
        private lihatPelamar view;
        private Perusahaan p;

    public ControllerLihatPelamar(AplikasiConsole model, Perusahaan p) {
        this.model = model;
        view = new lihatPelamar();
        view.setVisible(true);
        view.addListener(this);        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object lihatpelamar = e.getSource();
        if(lihatpelamar.equals(view.getBtnLihat())){
            String idLowongan = view.getIdlowonganfield();
            new ControllerListPelamar(model,p,idLowongan);
            view.dispose();
        }
    }
        
        
    
}
