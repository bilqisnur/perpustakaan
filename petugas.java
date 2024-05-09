/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplication;

import java.util.ArrayList;

public class petugas implements user {
    private ArrayList<String> namapetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    public petugas(){
        this.namapetugas.add("reza");
        this.alamat.add("malang");
        this.telepon.add("084367256438");
    }
    
    @Override
    public void setNama(String namaPetugas){
        this.namapetugas.add(namaPetugas);
    }
    @Override
    public void setAlamat(String alamat){
        this.namapetugas.add(alamat);
    }
    @Override
    public void setTelepon(String telepon){
        this.namapetugas.add(telepon);
    }    
    
    @Override
    public String getNama(int idPetugas){
        return this.namapetugas.get(idPetugas);
    }
    @Override
    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);
    }
    @Override
    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
    }
}
