/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplication;

import java.util.ArrayList;

public class siswa implements user{
 private ArrayList<String> namaSiswa = new ArrayList<String>();
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Boolean> status = new ArrayList<Boolean>();
 
 
 
 public siswa() {
 this.namaSiswa.add("bilkis");
 this.alamat.add("blitar");
 this.telepon.add("081878954323");
 this.status.add(false);
 
 this.namaSiswa.add("midi");
 this.alamat.add("solo");
 this.telepon.add("085237456890");
 this.status.add(false);
}
 public void pinjamBuku() {
        if (status.get(0)) { // Jika siswa sudah meminjam buku
            System.out.println("Siswa sudah meminjam buku, tidak dapat meminjam lagi");
        } else {
            // Proses peminjaman buku
            System.out.println("Siswa bisa meminjam buku");
            // Mengubah status peminjaman menjadi true
            status.set(0, true);
        }
 }
 @Override
 public void setNama(String namaSiswa){
    this.namaSiswa.add(namaSiswa);
 }
 @Override
 public void setAlamat(String alamat ){
    this.alamat.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.telepon.add(telepon);
 }

 @Override
 public String getNama(int idSiswa){
 return this.namaSiswa.get(idSiswa);
 }
 
 @Override
 public String getAlamat(int idSiswa){
 return this.alamat.get(idSiswa);
 }
 
 @Override
 public String getTelepon(int idSiswa){
 return this.telepon.get(idSiswa);
 }
 public void setStatus(boolean status ){
 this.status.add(status);
}
 public boolean getStatus(int idSiswa){
 return this.status.get(idSiswa);
 }
public int getJmlSiswa(){
    return this.status.size();
}}
 
        
        
 