///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Contoller;
//
//import Model.AplikasiConsole;
//import Model.Perusahaan;
//import View.penyetujuPelamar;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author adhis
// */
//public class ControllerPenyetujuPelamar implements ActionListener{
//    private AplikasiConsole model;
//    private penyetujuPelamar view;
//    private String idLowongan;
//    private Perusahaan p;
//    public ControllerPenyetujuPelamar(AplikasiConsole model,Perusahaan p,String idLowongan){
//        this.model=model;
//        view=new penyetujuPelamar();
//        view.addListener(this);
//        view.setVisible(true);
//        this.idLowongan=idLowongan;
//        this.p=p;
//    }
//    public void actionPerformed(ActionEvent e){
//        Object source=e.getSource();
//        if(source.equals(view.getBtnSetuju())){
//            String idPelamar=view.getIdPelamar();
//            p.getLowongan(idLowongan).pindahBerkas(idPelamar);
//            JOptionPane.showMessageDialog(null, "Data Telah Diterima");
//        }
//    }
//    
//}
