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
}
