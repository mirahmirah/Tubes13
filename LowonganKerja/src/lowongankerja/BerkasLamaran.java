/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowongankerja;

/**
 *
 * @author user
 */
public class BerkasLamaran {
        private int index;
	private String idBerkas;
	private String pengalaman;
        private String lulusan;
        private String skill;
	private String nama;
        private String email;
        private String noHp;
        public int getIndex(){
		return index;
	}
	public void setIndex(int Index){
		this.index = index;
	}
	public String getIdBerkas(){
		return idBerkas;
	}
	public void setIdBerkas(String idBerkas){
		this.idBerkas = idBerkas;
	}

         public String getLulusan() {
            return lulusan;
        }

        public void setLulusan(String lulusan) {
            this.lulusan = lulusan;
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
