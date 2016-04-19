/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lowongankerja.AplikasiConsole;
import lowongankerja.Orang;
import View.menuLogIn;
import javax.swing.JOptionPane;
import lowongankerja.Pelamar;
import lowongankerja.Perusahaan;
/**
 *
 * @author adhis
 */
public class ControllerLogin implements ActionListener {
        private AplikasiConsole model;
        private menuLogIn view;
        private Orang o;    
        
        public ControllerLogin(AplikasiConsole model){
            this.model=model;
            view= new menuLogIn();
            view.setVisible(true);
            view.addListener(this);
        }
        public ControllerLogin(AplikasiConsole model,Orang o){
            this.model=model;
            this.o=o;
            view= new menuLogIn();
            view.setVisible(true);
            view.addListener(this);
            view.setUserName(o.getUsername());
            view.setPassword(o.getPassword());
            view.getBtnLogin().setText("Login");
            view.setTitle("Menu Login");
        }
        public void actionPerformed(ActionEvent e){
            Object source=e.getSource();
            if(source.equals(view.getBtnLogin())){
                String username=view.getUsername();
                String password=view.getPassword();
                if(model.menuLoginPelamar(username,password)!=null){
                    Pelamar p=model.menuLoginPelamar(username, password);
                    view.setVisible(false);
                    new ControllerMenuCariPerusahaan(model,p);
                    view.dispose();
                }else if(model.menuLoginPerusahaan(username, password)!=null){
                    Perusahaan p=model.menuLoginPerusahaan(username, password);
                    view.setVisible(false);
                    new ControllerMenuLowongan(model,p);
                    view.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Password/Username");
                }
            }
        }
        
}
