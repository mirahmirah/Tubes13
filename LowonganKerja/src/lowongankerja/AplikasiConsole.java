/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowongankerja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author adhis
 */
public class AplikasiConsole {
    //private List<Pelamar> user1=new ArrayList<>();
    //private List<Perusahaan> user2=new ArrayList<>();
    private List<Orang> user=new ArrayList<>();
    public void addPelamar(Pelamar p){
       user.add(p);
    }
    public void addPerusahaan(Perusahaan p){
        user.add(p);
    }
    public int getIndeks(String id){
        for(int i=0;i<user.size();i++){
            if(user.get(i).getId().equals(id)){
                return i;
            }
        }
        return null;
    }
    public Pelamar getPelamar(String id){
        for(int i=0;i<user.size();i++){
            if(user.get(i).getId().equals(id)){
                if(user.get(i) instanceof Pelamar){
                    return (Pelamar) user.get(i);
                }
            }
        }
        return null;
    }
    
    public void deletePelamar(String id){
        if(user.get(i) instanceof Pelamar){
            user.remove(i);
        }
        else{
            System.out.println("Salah id");
        }
    }
    
    /*public void deletePerusahaan(int i){
        if(user.get(i) instanceof Perusahaan){
            user.remove(i);
        }
        else{
            System.out.println("Id yang dimasukkan salah");
        }
    } */
    /*public void deletePelamar(String id){
        for(int i=0;i<user.size();i++){
            if(user.get(i).getNama().equals(nama)){
                user.remove(i);
            }
            if((i==user1.size()) && (user1.get(user1.size()).getNama()!=nama)){
            System.out.println("Data tidak ditemukan");
            }
        }
    }*/
    /*public void deletePerusahaan(String nama){
        for(int i=0;i<user2.size();i++){
            if(user2.get(i).getNama().equals(nama)){
                user2.remove(i);
                System.out.println("Data berhasil di hapus");
            }
            if(i==user2.size() && user1.get(user1.size()).getNama()!=nama){
                System.out.println("Data Berhasil di Hapus");
            }
        }
    }*/
/*    public void menuPelamar(int x){
        switch(x){
            case '1':
                menuCariKerja();
                break;
            case '2':
                buatBerkas();
            case '3':
                infoLowonganKerja();
        }
    }*/
    public void menuCariKerja(){
        

    }
    public void buatBerkas(){
        
    }
    public void infoLowonganKerja(){
        
    }
    public void menuCreateLowongan(){
        
    }
    public void menuDeleteLowongan(){
        
    }
    public void menuInfoPelamar(){
        
    }
    public void mainMenu(Orang o){
        Scanner input=new Scanner(System.in);
        if(o instanceof Pelamar){
            System.out.println("1.Cari Kerja");
            System.out.println("2.Buat Berkas");
            System.out.println("3.Info Lowongan");
            System.out.print("Pilih Menu : ");
            int x=input.nextInt();
            switch(x){
                case '1' :
                    menuCariKerja();
                    break;
                case '2' :
                    buatBerkas();
                    break;
                case '3' :
                    infoLowonganKerja();
            }
        }
        else{
            System.out.println("1.Buat Lowongan");
            System.out.println("2.Hapus Lowongan");
            System.out.println("3.Info Pelamar");
            System.out.print("Pilih Menu : ");
            int y=input.nextInt();
            switch(y){
                case '1':
                    menuCreateLowongan();
                    break;
                case '2':
                    menuDeleteLowongan();
                    break;
                case '3':
                    menuInfoPelamar();
                    break;
            }
        }
    }
}
