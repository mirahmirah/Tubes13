/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import View.menuHasilPencarianPerusahaan;
import java.awt.event.ActionListener;
import lowongankerja.AplikasiConsole;
import lowongankerja.Pelamar;
import lowongankerja.Perusahaan;

/**
 *
 * @author adhis
 */
public class ControllerHasilPencarianPerusahaan implements ActionListener{
    private AplikasiConsole model;
    private menuHasilPencarianPerusahaan view;
    private Pelamar p;
    private Perusahaan per;
    public ControllerHasilPencarianPerusahaan(AplikasiConsole model,Perusahaan per,Pelamar p){
        this.model=model;
        view=new menuHasilPencarianPerusahaan();
        view.setVisible(true);
        view.addListener(this);
        view.setListlowongan(per.);
        
    }
    
}
