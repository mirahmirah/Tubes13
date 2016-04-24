/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class BerkasLamaran implements Serializable{
        private int idBerkas ;
        private String pengalaman;
        private String pendidikan;
        private String skill;
	private String nama;
        private String email;
        private String noHp;
        
	public int getIdBerkas(){
		return idBerkas;
	}
	public void setIdBerkas(int idBerkas){
		this.idBerkas = idBerkas;
	}

         public String getPendidikan() {
            return pendidikan;
        }

        public void setPendidikan(String pendidikan) {
            this.pendidikan = pendidikan;
        }

        public String getPengalaman() {
            return pengalaman;
        }

        public void setPengalaman(String pengalaman) {
            this.pengalaman = pengalaman;
        }

        public String getSkill() {
            return skill;
        }

        public void setSkill(String skill) {
            this.skill = skill;
        }        

        public String getNama() {
            return nama;
        }

        public String getEmail() {
            return email;
        }

        public String getNoHp() {
            return noHp;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setNoHp(String noHp) {
            this.noHp = noHp;
        }
        
        
}
