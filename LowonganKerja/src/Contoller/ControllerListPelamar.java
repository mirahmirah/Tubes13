///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Contoller;
//
//import Model.AplikasiConsole;
//import Model.Perusahaan;
//import View.listPelamar;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
///**
// *
// * @author user
// */
//public class ControllerListPelamar implements ActionListener{
//    private AplikasiConsole model;
//    private listPelamar view;
//    private Perusahaan p;
//    private String idLowongan;
//    public ControllerListPelamar(AplikasiConsole model, Perusahaan p, String idLowongan) {
//        this.model=model;
//        view= new listPelamar();
//        this.p=p;
//        this.idLowongan=idLowongan;
//        view.setVisible(true);
//        view.addListener(this);
//        view.setListSelectedId(p.getLowongan(idLowongan).getBerkasMasuk1());
//    }
//    public void actionPerformed(ActionEvent e){
//        Object source=e.getSource();
//        if(source.equals(view.getBtnOk())){
//            new ControllerPenyetujuPelamar(model,p,idLowongan);
//            view.dispose();
//        }
//    }
//
//       
//}
