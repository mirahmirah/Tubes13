///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Contoller;
//
//import Model.AplikasiConsole;
//import Model.Pelamar;
//import View.inputIdLowongan;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
///**
// *
// * @author adhis
// */
//public class ControllerDaftarKerja2 implements ActionListener{
//    private AplikasiConsole model;
//    private inputIdLowongan view;
//    private Pelamar p;
//    public ControllerDaftarKerja2(AplikasiConsole model,Pelamar p){
//        this.model=model;
//        view= new inputIdLowongan();
//        view.setVisible(true);
//        view.addListener(this);
//    }
//    public void actionPerformed(ActionEvent e){
//        Object source=e.getSource();
//        if(source.equals(view.getBtnDaftar())){
//            String idLowongan=view.getIdLowongan();
//            String namaPerusahaan=view.getNamaperusahaan();
//            model.getPerusahaan(namaPerusahaan).getLowongan(idLowongan).addBerkas(p.getBerkas());
//        }
//    }
//}
