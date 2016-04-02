/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowongankerja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISMA
 */
public class Pelamar extends Orang {
    private String skill;
    private BerkasLamaran berkas;
    private String pengalaman;
    private String lulusan;

    public String getSkill() {
        return skill;
    }

    public String getLulusan() {
        return lulusan;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setLulusan(String lulusan) {
        this.lulusan = lulusan;
    }
    
    public void setPengalaman (String pengalaman){
        this.pengalaman = pengalaman;
    }
	
    public String getPengalaman (){
        return pengalaman;
    }
    
    public void createBerkas (String idBerkas){
        berkas = new BerkasLamaran();
        berkas.setIdBerkas(idBerkas);
    }
    
    public void createBerkas(String lulusan,String skill,String pengalaman){
        berkas= new BerkasLamaran();
        berkas.setNama(getNama());
        berkas.setNoHp(getNoHp());
        berkas.setEmail(getEmail());
        berkas.setIdBerkas(getId());
        berkas.setLulusan(lulusan);
        berkas.setPengalaman(pengalaman);
        berkas.setSkill(skill);
    }

    public BerkasLamaran getBerkas() {
        return berkas;
    }
    
}
