/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import Database.Database;
import Model.Aplikasi;
import Model.Pelamar;
import Model.Perusahaan;
import View.Registrasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ISMA
 */
public class ControllerRegistrasi implements ActionListener {
    private Aplikasi model;
    private Registrasi view;
    private Database connection;
    
    public ControllerRegistrasi (Aplikasi model){
        this.model = model;
        view = new Registrasi();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source=ae.getSource();
        if(source.equals(view.getBtnDaftar())){
            String nama = view.getNama();
            String username = view.getUsername();
            String password = view.getPassword();
            String email = view.getEmail();
            String noHp = view.getNoHp();
            String pendidikan = view.getPendidikan();
            Pelamar p = new Pelamar();
            p.setNama(nama);
            p.setUsername(username);
            p.setPassword(password);
            p.setEmail(email);
            p.setNoHp(noHp);
            p.setPendidikan(pendidikan);
            model.RegistrasiPelamar(p);
        } else if (source.equals(view.getBtnDaftar1())){
            String nama1 = view.getNama1();
            String username1 = view.getUsername1();
            String password1 = view.getPassword1();
            String email1 = view.getEmail1();
            String noHp1 = view.getNoHp1();
            String alamat = view.getAlamat();
            Perusahaan p = new Perusahaan();
            p.setNama(nama1);
            p.setUsername(username1);
            p.setPassword(password1);
            p.setEmail(email1);
            p.setNoHp(noHp1);
            p.setAlamat(alamat);
            model.RegistrasiPerusahaan(p);
        }
    }
    
    
}
