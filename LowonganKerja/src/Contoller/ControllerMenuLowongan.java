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
import javax.swing.JOptionPane;
import lowongankerja.AplikasiConsole;
import lowongankerja.Pelamar;
import lowongankerja.Perusahaan;

/**
 *
 * @author adhis
 */
public class ControllerMenuLowongan implements ActionListener{
    private AplikasiConsole model;
    private menuLowongan view;
    private Perusahaan p;

        
    public ControllerMenuLowongan(AplikasiConsole model,Perusahaan p){
        this.model=model;
        view= new menuLowongan();
        view.setVisible(true);
        view.addListener(this);
        view.setListdaftarlowongan(p.getNamaLowongan());
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        Object menulowongan = ae.getSource();
        if(menulowongan.equals(view.getAdd())){
            String idLowongan = view.getIdLowongan();
            String namaLowongan = view.getNamaLowongan();
            String deadline = view.getDeadline();
            p.createLowongan(deadline, namaLowongan, idLowongan);
            JOptionPane.showMessageDialog(null, "Data berhasil!");
        } else if(menulowongan.equals(view.getBtnLihat())){
            view.setVisible(false);
            new ControllerLihatPelamar(model, p);
            view.dispose();
        }else if(menulowongan.equals(view.getBtnHapus())){
            String idLowongan = view.getIdlowongan1field();
            p.removeLowongan(idLowongan);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        }
        
    }
}
