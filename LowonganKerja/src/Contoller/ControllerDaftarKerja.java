///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Contoller;
//
//import View.daftarKerja;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import Model.AplikasiConsole;
//import Model.Pelamar;
//import Model.Perusahaan;
//
///**
// *
// * @author adhis
// */
//public class ControllerDaftarKerja implements ActionListener{
//    private AplikasiConsole model;
//    private daftarKerja view;
//    private Pelamar p;
//    private Perusahaan per;
//    public ControllerDaftarKerja(AplikasiConsole model,Perusahaan per,Pelamar p){
//        this.model=model;
//        view =new daftarKerja();
//        view.setVisible(true);
//        view.addListener(this);
//        this.p=p;
//        this.per=per;
//    }
//    public void actionPerformed(ActionEvent e){
//        Object source=e.getSource();
//        if(source.equals(view.getBtnDaftar())){
//            String idLowongan=view.getIdLowongan();
//            model.daftarKerja(per, p, idLowongan);
//        }
//    }
//}
