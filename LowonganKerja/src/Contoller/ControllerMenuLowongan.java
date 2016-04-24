/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import Database.Database;
import View.menuLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Model.Aplikasi;
import Model.BerkasLamaran;
import Model.Pelamar;
import Model.Perusahaan;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.List;

/**
 *
 * @author adhis
 */
public class ControllerMenuLowongan implements ActionListener{
    private Aplikasi model;
    private menuLowongan view;
    private Perusahaan p;
    private int selected;
    public ControllerMenuLowongan(Aplikasi model,Perusahaan p){
        this.model=model;
        this.p=p;
        view =new menuLowongan();
        view.viewAll(model.cariPerusahaan(p.getNama()));
        view.setVisible(true);
        view.addListener(this);
   //     view.addAdapter();
    }
    public void mouseClicked(MouseEvent e){
        if(e.getSource().equals(view.getSelected())){
            selected=view.getSelected();
        }
    }
    public void actionPerformed(ActionEvent ae){
        Object menulowongan = ae.getSource();
        if(menulowongan.equals(view.getAdd())){
            String namaLowongan = view.getNamaLowongan();
            String deadline = view.getDeadline();
            p.createLowongan(deadline, namaLowongan);
            model.createLowongan(p, p.getLowongan(namaLowongan));
            JOptionPane.showMessageDialog(null, "Data berhasil!"+p.getLowongan(namaLowongan).getNama());
            JOptionPane.showMessageDialog(null, "Data berhasil!");
            new ControllerMenuLowongan(model,p);
        } else if(menulowongan.equals(view.getBtnLihat())){
            view.setVisible(false);
            new ControllerLihatPelamar(model, p,selected+1);
            view.dispose();
        }else if(menulowongan.equals(view.getBtnHapus())){
            String idLowongan = view.getIdlowongan1field();
     //       p.removeLowongan(idLowongan);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        }
        
    }

}
