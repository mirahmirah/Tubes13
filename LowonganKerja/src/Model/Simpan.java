/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adhis
 */
public class Simpan implements Serializable {

    public void simpanPelamar(List<Pelamar> obj) {
        try {
            FileOutputStream fos = new FileOutputStream("dtPelamar.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
        } catch (IOException ioe) {
            System.err.println("error" + ioe);
        }
    }

    public void simpanPerusahaan(List<Perusahaan> obj) {
        try {
            FileOutputStream fos = new FileOutputStream("dtPerusahaan.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
        } catch (IOException ioe) {
            System.err.println("error " + ioe);
        }
    }

    public List<Pelamar> getPelamar() {
        try {
            FileInputStream fis = new FileInputStream("dtPelamar.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Pelamar> l = (List<Pelamar>) ois.readObject();
            return l;
        } catch (Exception ioe) {
//                    System.exit(1);
            List<Pelamar> l = new ArrayList<>();
            simpanPelamar(l);
            return l;
        } 
    }

    public List<Perusahaan> getPerusahaan() {
        try {
            FileInputStream fis = new FileInputStream("dtPerusahaan.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Perusahaan> p = (List<Perusahaan>) ois.readObject();
            return p;
        } catch (Exception ioe) {
//                    System.exit(1);
            List<Perusahaan> l = new ArrayList<>();
            simpanPerusahaan(l);
            return l;
        } 
    }
}
