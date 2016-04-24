/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import Model.Aplikasi;
import Model.Lowongan;
import View.menuHasilPencarianPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Pelamar;
import Model.Perusahaan;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 *
 * @author adhis
 */
public class ControllerHasilPencarianPerusahaan implements ActionListener{
    private Aplikasi model;
    private menuHasilPencarianPerusahaan view;
    private Pelamar p;
    private List<Lowongan> lowongan;
    private int selected;
    public ControllerHasilPencarianPerusahaan(Aplikasi model,List<Lowongan> lowongan,Pelamar p){
        this.model=model;
        this.p=p;
        this.lowongan=lowongan;
        view=new menuHasilPencarianPerusahaan();
        view.setVisible(true);
        view.addListener(this);
        view.viewAll(lowongan);
    }
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if(source.equals(view.getBtnDaftar())){
            view.setVisible(false);
            model.daftarKerja(p, selected+1);
        }
    }
    public void mouseClicked(MouseEvent e){
        if(e.getSource().equals(view.getSelected())){
            selected=view.getSelected();
        }
    }
    
}
