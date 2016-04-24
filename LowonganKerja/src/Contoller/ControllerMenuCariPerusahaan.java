/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import Database.Database;
import Model.Aplikasi;
import Model.BerkasLamaran;
import Model.Lowongan;
import View.menuCariPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Model.Pelamar;
import Model.Perusahaan;
import java.awt.event.MouseEvent;
import java.util.List;
public class ControllerMenuCariPerusahaan implements ActionListener{
    private Aplikasi model;
    private menuCariPerusahaan view;
    private Pelamar p;
    private int selected;
    public ControllerMenuCariPerusahaan(Aplikasi model,Pelamar p){
        this.model=model;
        view= new menuCariPerusahaan();
        view.setVisible(true);
        view.addListener(this);
        view.viewAll(model.tampilLowongan());
        this.p=p;
    }
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if(source.equals(view.getBtnCari())){
            String namaPerusahaan=view.getNmperusahaan();
            if(model.cariPerusahaan(namaPerusahaan)!=null){
                List<Lowongan> low=model.cariPerusahaan(namaPerusahaan);
                view.setVisible(false);
                new ControllerHasilPencarianPerusahaan(model,low,p);
            }
        }else if(source.equals(view.getBtnBuat())){
            String skill=view.getSkill();
            String pengalaman=view.getPengalaman();
//            BerkasLamaran b=new BerkasLamaran();
//            b.setSkill(skill);
//            b.setPendidikan(pengalaman);
            p.createBerkas(skill, pengalaman);
            model.createBerkas(p, p.getBerkas());
        }else if(source.equals(view.getBtnDaftar())){
            model.daftarKerja(p, selected+1);
        }
    }
    public void mouseClicked(MouseEvent e){
        if(e.getSource().equals(view.getSelected())){
            selected=view.getSelected();
        }
    }
    
}
    