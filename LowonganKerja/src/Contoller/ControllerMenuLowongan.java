/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import View.menuCariPerusahaan;
import View.menuLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lowongankerja.AplikasiConsole;
import lowongankerja.Pelamar;
import lowongankerja.Perusahaan;

/**
 *
 * @author adhis
 */
public class ControllerMenuLowongan implements ActionListener{
    private AplikasiConsole model;
    private menuCariPerusahaan view;
    private Perusahaan p;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ControllerMenuLowongan(AplikasiConsole model){
        this.model=model;
        view= new menuLowongan();
        view.setVisible(true);
        view.addListener(this);
        view.setListdaftarlowongan(p.getDaftarLowongan());
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        Object menulowongan = ae.getSource();
        if(menulowongan.equals(view.getAdd(model))){
            new ControllerMenuLowongan(model);
            view.dispose();
        } else if(menulowongan.equals(view.getBtnLihat(model))){
            view.dispose();
        }else if(menulowongan.equals(view.getBtnHapus)){
            
            view.dispose();
        }
        
    }
}
