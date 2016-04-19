/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import View.menuCariPerusahaan;
import java.awt.event.ActionListener;
import lowongankerja.AplikasiConsole;
/**
 *
 * @author adhis
 */
import lowongankerja.Pelamar;
public class ControllerMenuCariPerusahaan implements ActionListener{
    private AplikasiConsole model;
    private menuCariPerusahaan view;
    private Pelamar p;
    public ControllerMenuCariPerusahaan(AplikasiConsole model){
        this.model=model;
        view= new menuCariPerusahaan();
        view.setVisible(true);
        view.addListener(this);
        view.setLowonganKerjaList(model.getPerusahaan(nama));
    }
    public ControllerMenuCariPerusahaan(AplikasiConsole model){
        this.mlo
    }
    
}
