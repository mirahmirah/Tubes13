/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import Model.Aplikasi;
import Model.Pelamar;
import View.BerkasDiterima;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class ControllerBerkasDiterima implements ActionListener {
    private Aplikasi model;
    private BerkasDiterima view;
    private Pelamar p;
    private int selected;

    public ControllerBerkasDiterima(Aplikasi model, Pelamar p) {
        this.model = model;
        view = new BerkasDiterima();
        view.setVisible(true);
        view.addListener(this);
        view.viewAll(model.tampilBerkas());
        this.p = p;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnKembaliBerkasDiterima())){
            new ControllerMenuCariPerusahaan(model,p);
            view.dispose();
        }
    }
    
    
}
