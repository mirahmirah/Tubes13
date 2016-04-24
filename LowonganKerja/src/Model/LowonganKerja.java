/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

//import Contoller.ControllerLogin;

import Contoller.ControllerLogin;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author adhis
 */
public class LowonganKerja {

    
    public static void main(String[] args) {
           Aplikasi drv = new Aplikasi();
           
//           drv.
//           drv.getBerkas(1);
//         drv  
//           Pelamar adhi=new Pelamar();
//           adhi.setUsername("ADHI");
//           adhi.setPassword("ADHI");
//           drv.addPelamar(adhi);
//           Perusahaan pertamina=new Perusahaan();
//           pertamina.setUsername("TES");
//           pertamina.setPassword("TES");
//           pertamina.setNama("pertamina");
//           pertamina.createLowongan("1 Februari", "Project Manager", "01");
//           drv.addPerusahaan(pertamina);

           new ControllerLogin(drv);
    }
    
}
