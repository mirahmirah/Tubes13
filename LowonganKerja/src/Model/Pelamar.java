/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISMA
 */
public class Pelamar extends Orang implements Serializable{
//    private String skill;
    private BerkasLamaran berkas;
 //   private String pengalaman;
    private String pendidikan;

//    public String getSkill() {
//        return skill;
//    }

    public String getPendidikan() {
        return pendidikan;
    }

//    public void setSkill(String skill) {
//        this.skill = skill;
//    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }
    
//    public void setPengalaman (String pengalaman){
//        this.pengalaman = pengalaman;
//    }
//	
//    public String getPengalaman (){
//        return pengalaman;
//    }
    
    public void createBerkas (int idBerkas){
        berkas = new BerkasLamaran();
        berkas.setIdBerkas(idBerkas);
    }
    
    public void createBerkas(String skill,String pengalaman){
        berkas= new BerkasLamaran();
        berkas.setNama(getNama());
        berkas.setNoHp(getNoHp());
        berkas.setEmail(getEmail());
        berkas.setIdBerkas(getId());
        berkas.setPendidikan(getPendidikan());
        berkas.setPengalaman(pengalaman);
        berkas.setSkill(skill);
    }

    public BerkasLamaran getBerkas() {
        return berkas;
    }
    
}
