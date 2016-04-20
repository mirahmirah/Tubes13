/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import View.menuCariPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import lowongankerja.AplikasiConsole;
/**
 *
 * @author adhis
 */
import lowongankerja.Pelamar;
import lowongankerja.Perusahaan;
public class ControllerMenuCariPerusahaan implements ActionListener{
    private AplikasiConsole model;
    private menuCariPerusahaan view;
    private Pelamar p;
    public ControllerMenuCariPerusahaan(AplikasiConsole model,Pelamar p){
        this.model=model;
        view= new menuCariPerusahaan();
        view.setVisible(true);
        view.addListener(this);
        view.setLowonganKerjaList(model.getNamaPerusahaan());
        this.p=p;
    }
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if(source.equals(view.getBtnCari())){
            String namaPerusahaan=view.getNmperusahaan();
            if(model.getPerusahaan(namaPerusahaan)!=null){
                Perusahaan per=model.getPerusahaan(namaPerusahaan);
                view.setVisible(false);
                new ControllerHasilPencarianPerusahaan(model,per,p);
            }
        }else if(source.equals(view.getBtnBuat())){
            String skill=view.getSkill();
            String pengalaman=view.getPengalaman();
            String pendidikan=view.getRiwayatpendidikan();
            p.createBerkas(pendidikan, skill, pengalaman);
            JOptionPane.showMessageDialog(null, "Berkas berhasil dibuat");
        }else if(source.equals(view.getBtnDaftar())){
            view.setVisible(false);
            new ControllerDaftarKerja(model,p);
        }
    }
    
}
