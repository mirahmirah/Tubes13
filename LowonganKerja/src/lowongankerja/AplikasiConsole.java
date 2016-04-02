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

    public AplikasiConsole() {
    
    }
    
    private List<Orang> user=new ArrayList<>();
    public void addPelamar(Pelamar p){
       user.add(p);
    }
    public void addPerusahaan(Perusahaan p){
        user.add(p);
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
        for(int i=0;i<user.size();i++){
            if(user.get(i).getId().equals(id)){
                if(user.get(i) instanceof Pelamar){
                    user.remove(i);
                }
            }
        }
    }
        
    public void deletePerusahaan(String id){
        for(int i=0;i<user.size();i++){
            if(user.get(i).getId().equals(id)){
                if(user.get(i) instanceof Perusahaan){
                    user.remove(i);
                }
            }
        }
    }
    public Perusahaan getPerusahaan(String nama){
        for(int i=0;i<user.size();i++){
            if(user.get(i).getNama().equals(nama)){
                if(user.get(i) instanceof Perusahaan){
                    return (Perusahaan) user.get(i);
                }
            }
        }
        return null;
    }
    public void menuCreateBerkas(Pelamar pelamar,String lulusan,String pengalaman,String skill){
        pelamar.createBerkas(lulusan, skill, pengalaman);
    }
    public Pelamar getPelamar(int idx){
        return (Pelamar) user.get(idx);
    }
    public Perusahaan getPerusahaan(int idx){
        return (Perusahaan) user.get(idx);
    }
    public Perusahaan menuCariKerja(String nama){
        for(int i=0;i<user.size();i++){
            if(user.get(i).getNama().equals(nama)){
                if(user.get(i) instanceof Perusahaan){
                    return(Perusahaan) user.get(i);
                }
            }
        }
        return null;
    }
    public void menuDaftarKerja(Perusahaan perusahaan,Pelamar pelamar,String idLowongan){
        perusahaan.getLowongan(idLowongan).addBerkas(pelamar.getBerkas());
    }
    
    public List<BerkasLamaran> menuInfoPelamar(Perusahaan perusahaan,String idLowongan){
        return perusahaan.getLowongan(idLowongan).getBerkasMasuk();
    }
    public Orang menuLogin(String username, String password){
        for(int i=0;i<=user.size();i++){
            if((user.get(i).getUsername().equals(username)) && (user.get(i).getPassword().equals(password))){
              return user.get(i);
            }
        }
        return null;
    }
    public Lowongan menuInfoLowongan(Perusahaan perusahaan,String idLowongan){
        return perusahaan.getLowongan(idLowongan);
    }
    public void menuCreateLowongan(Perusahaan perusahaan,String deadline,String name,String idLowongan){
        perusahaan.createLowongan(deadline, name, idLowongan);
    }
    public void menuRemoveLowongan(Perusahaan perusahaan,String idLowongan){
        perusahaan.removeLowongan(idLowongan);
    }
    public void mainMenu(){
        Scanner input=new Scanner(System.in);
        System.out.println("Username : ");
        String username=input.nextLine();
        System.out.println("Password : ");
        String password=input.nextLine();
        menuLogin(username, password);
        if(menuLogin(username,password)instanceof Pelamar){
            Pelamar pelamar=(Pelamar) menuLogin(username,password);
            System.out.println("1.Cari Kerja");
            System.out.println("2.Buat Berkas");
            System.out.println("3.Info Lowongan");
            System.out.print("Pilih Menu : ");
            int x=input.nextInt();
            switch(x){
                case 1:
                    System.out.println("Menu Cari Lowongan");
                    System.out.println("Masukkan Nama Perusahaan");
                    String name=input.nextLine();
                    for(int i=0;i<menuCariKerja(name).getDaftarLowongan().size();i++){
                        System.out.println("Id Lowongan "+menuCariKerja(name).getLowongan(i).getIdLowongan());
                        System.out.println("Nama Lowongan "+menuCariKerja(name).getLowongan(i).getNama());
                        System.out.println("Deadline Lowongan "+menuCariKerja(name).getLowongan(i).getDeadline());
                    }
                    System.out.println("Daftar Kerja");
                    System.out.println("Input Id Lowongan : ");
                    String idLowongan=input.nextLine();
                    menuDaftarKerja(menuCariKerja(name),pelamar,idLowongan);
                    break;
                case 2:
                    System.out.println("Menu Buat Berkas");
                    System.out.println("Input Lulusan : ");
                    String lulusan=input.nextLine();
                    System.out.println("Input Pengalaman : ");
                    String pengalaman=input.nextLine();
                    System.out.println("Input Skill : ");
                    String skill=input.nextLine();
                    menuCreateBerkas(pelamar,lulusan,pengalaman,skill);
                    break;
                case 3:
                    System.out.println("Semua Lowongan Kerja");
                    for(int i=0;i<=user.size();i++){
                        if(user.get(i) instanceof Perusahaan){
                            System.out.println("Nama Perusahaan : "+user.get(i).getNama());
                            for(int j=0;j<=getPerusahaan(i).getDaftarLowongan().size();j++){
                                System.out.println("Id Lowongan         : "+getPerusahaan(i).getLowongan(j).getIdLowongan());
                                System.out.println("Nama Lowongan       : "+getPerusahaan(i).getLowongan(j).getNama());
                                System.out.println("Deadline Lowongan   : "+getPerusahaan(i).getLowongan(j).getDeadline());
                            }
                        }
                    }
                    System.out.println("Daftar Kerja");
                    System.out.println("Input nama Perusahaan : ");
                    String nmPerusahaan=input.nextLine();
                    System.out.println("Input Id Lowongan : ");
                    idLowongan=input.nextLine();
                    menuDaftarKerja(menuCariKerja(nmPerusahaan),pelamar,idLowongan);
            }
        }else if(menuLogin(username, password)instanceof Perusahaan){
            Perusahaan perusahaan=(Perusahaan) menuLogin(username, password);
            System.out.println("1.Buat Lowongan");
            System.out.println("2.Hapus Lowongan");
            System.out.println("3.Info Pelamar");
            System.out.print("Pilih Menu : ");
            int y=input.nextInt();
            switch(y){
                case 1:
                    System.out.print("Input Nama Lowongan   : ");
                    String name=input.nextLine();
                    System.out.print("Input Deadline        : ");
                    String deadline=input.nextLine();
                    System.out.print("Input idLowongan      : ");
                    String idLowongan=input.nextLine();
                    menuCreateLowongan(perusahaan,deadline, name, idLowongan);
                    break;
                case 2 :
                    System.out.println("Menu Hapus Lowongan");
                    System.out.print("Input id Lowongan : ");
                    idLowongan=input.nextLine();
                    perusahaan.removeLowongan(idLowongan);
                    break;
                case 3 :
                    System.out.println("Menu Info Pelamar");
                    for(int i=0;i<=perusahaan.getDaftarLowongan().size();i++){
                        System.out.println("Nama Lowongan : "+perusahaan.getLowongan(i).getNama());
                        System.out.println("Nama Lowongan : "+perusahaan.getLowongan(i).getIdLowongan());
                    }
                    System.out.print("Lihat (Y/N)");
                    String pilihan=input.nextLine();
                    if(pilihan=="y"){
                        System.out.print("Input idLowongan");
                        idLowongan=input.nextLine();
                        if(perusahaan.getLowongan(idLowongan)!=null){
                            for(int j=0;j<=menuInfoPelamar(perusahaan, idLowongan).size();j++){
                                System.out.println("Nama Pelamar : "+menuInfoPelamar(perusahaan,idLowongan).get(j).getNama());
                                System.out.println("Nama Pelamar : "+menuInfoPelamar(perusahaan,idLowongan).get(j).getIdBerkas());
                                System.out.println("Nama Pelamar : "+menuInfoPelamar(perusahaan,idLowongan).get(j).getPengalaman());
                                System.out.println("Nama Pelamar : "+menuInfoPelamar(perusahaan,idLowongan).get(j).getLulusan());
                                System.out.println("Nama Pelamar : "+menuInfoPelamar(perusahaan,idLowongan).get(j).getEmail());
                                System.out.println("Nama Pelamar : "+menuInfoPelamar(perusahaan,idLowongan).get(j).getNoHp());
                            }
                        }else{
                            System.out.println("Nama Salah");
                        }
                        System.out.println("Pilih Berkas Yang Diterima");
                        System.out.print("Input id Berkas");
                        String idBerkas=input.nextLine();
                        perusahaan.Approval(idBerkas,menuInfoLowongan(perusahaan, idLowongan));
                    }
            }
        }
    }
}