/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowongankerja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adhis
 */
public class Lowongan {
    private List<BerkasLamaran> berkasMasuk=new ArrayList<>();
    private List<BerkasLamaran> berkasDiterima=new ArrayList<>();
    private String idLowongan;
    private int indexLowongan;
    private String deadline;
    private String nama;
    public Lowongan() {
    
    }
    
    public Lowongan(String deadline,String nama,String idLowongan) {
        this.deadline = deadline;
        this.nama=nama;
        this.idLowongan=idLowongan;
    }

    public String getNama() {
        return nama;
    }
    
    public void addBerkas(BerkasLamaran b){
        berkasMasuk.add(b);
    }
    public void terimaBerkas(BerkasLamaran b){
        berkasDiterima.add(b);
    }
    public BerkasLamaran getBerkasDiterima(int index){
        return berkasDiterima.get(index);
    }
    
    public BerkasLamaran getBerkasMasuk(String idBerkas){
        for (int i = 0; i < berkasMasuk.size(); i++) {
            if(berkasMasuk.get(i).getIdBerkas().equals(idBerkas)){
                return berkasMasuk.get(i);
            }
        }
        return null;
    }
    public BerkasLamaran getBerkasMasuk(int indexLowongan){
        return berkasMasuk.get(indexLowongan);
    }
    public void pindahBerkas(String idBerkas){
        terimaBerkas(getBerkasMasuk(idBerkas));    
        removeBerkas(idBerkas);
    }
    
    public void removeBerkas(String idBerkas){
        for (int i=0; i< berkasMasuk.size();i++){
            if(berkasMasuk.get(i).getIdBerkas().equals(idBerkas)){
                System.out.println("Berkas yang dihapus"+berkasMasuk.get(i).getIdBerkas());
                berkasMasuk.remove(i);
            }
        }
    }
    
    public String getIdLowongan(){
        return idLowongan;
    }
    
    public int getIndexLowongan(){
        return indexLowongan;
    }
    
    public String getDeadline() {
        return deadline;
    }
    
    public void setIdLowongan(String idLowongan) {
        this.idLowongan = idLowongan;
    }
    
    public void setIndexLowongan(int indexLowongan) {
        this.indexLowongan = indexLowongan;
    }
    public void display(){
        for(int i=0; i < berkasMasuk.size();i++){
            System.out.println("Indeks Berkas "+getBerkasMasuk(i).getIdBerkas());
        }
    }      
    public List<BerkasLamaran> getBerkasMasuk() {
        return berkasMasuk;
    }
}