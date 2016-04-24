/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import Database.Database;
import View.menuLowongans;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Model.Aplikasi;
import Model.Pelamar;
import Model.Perusahaan;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.List;

/**
 *
 * @author adhis
 */
public class ControllerMenuLowongan implements ActionListener{
    private Aplikasi model;
    private menuLowongans view;
    private Perusahaan p;
    public ControllerMenuLowongan(Aplikasi model,Perusahaan p){
        this.model=model;
        this.p=p;
        view =new menuLowongans();
        view.viewAll(model.cariPerusahaan(p.getNama()));
        view.setVisible(true);
        view.addListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        Object menulowongan = ae.getSource();
        if(menulowongan.equals(view.getAdd())){
            String namaLowongan = view.getNamaLowongan();
            Date deadline = view.getDeadline();
            p.createLowongan(deadline, namaLowongan);
            JOptionPane.showMessageDialog(null, "Data berhasil!"+deadline);
            model.createLowongan(p, p.getLowongan(namaLowongan));
            JOptionPane.showMessageDialog(null, "Data berhasil!");
            new ControllerMenuLowongan(model,p);
        } else if(menulowongan.equals(view.getBtnLihat())){
            view.setVisible(false);
            new ControllerLihatPelamar(model, p);
            view.dispose();
        }else if(menulowongan.equals(view.getBtnHapus())){
            String idLowongan = view.getIdlowongan1field();
     //       p.removeLowongan(idLowongan);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        }
        
    }
}
