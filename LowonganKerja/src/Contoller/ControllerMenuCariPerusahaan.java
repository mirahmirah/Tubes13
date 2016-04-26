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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
public class ControllerMenuCariPerusahaan extends MouseAdapter implements ActionListener{
    private Aplikasi model;
    private menuCariPerusahaan view;
    private Pelamar p;
    private int selected;
    private List<Lowongan> lowongan;
    public ControllerMenuCariPerusahaan(Aplikasi model,Pelamar p){
        this.model=model;
        view= new menuCariPerusahaan();
        view.setVisible(true);
        view.addListener(this);
        view.viewAllLowongan(model.tampilLowongan());
        view.viewAllBerkasDiterima(model.getBerkasDiterima(p));
        view.addAdapter(this);
        this.p=p;
        lowongan=model.tampilLowongan();
    }
    public void mouseClicked(MouseEvent e){
        if(e.getSource().equals(view.getTableLowongan())){
            selected=view.getSelectedLowongan();
        }
        else if(e.getSource().equals(view.getTableBerkasDiterima())){
            selected=view.getSelectedBerkasDiterima();
        }
    }
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if(source.equals(view.getBtnCari())){
            String namaPerusahaan=view.getNmperusahaan();
            if(model.cariPerusahaan(namaPerusahaan)!=null){
                List<Lowongan> low=model.cariPerusahaan(namaPerusahaan);
                view.setVisible(false);
                new ControllerHasilPencarianPerusahaan(model,low,p,namaPerusahaan);
            }
        }else if(source.equals(view.getBtnBuat())){
            String skill=view.getSkill();
            String pengalaman=view.getPengalaman();
            p.createBerkas(skill, pengalaman);
            model.createBerkas(p, p.getBerkas());
            view.setPengalaman("");
            view.setSkill("");
        }else if(source.equals(view.getBtnDaftar())){
            model.daftarKerja(p, lowongan.get(selected).getIdLowongan());
        }else if(source.equals(view.getBtnLogOut())){
            new ControllerLogin(model);
        }else if(source.equals(view.getBtnLogOut1())){
            new ControllerLogin(model);
        }else if(source.equals(view.getBtnLogOut2())){
            new ControllerLogin(model);
        }else if(source.equals(view.getBtnLogOut3())){
            new ControllerLogin(model);
        }else if(source.equals(view.getBtnLogOut4())){
            new ControllerLogin(model);
        }else if(source.equals(view.getBtnEdit())){
            String skilledit = view.getSkilledit();
            String pengalamanedit = view.getPengalamanedit();
            model.updateBerkas(p,p.getBerkas());
        }
    }

    
}
    