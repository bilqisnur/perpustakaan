/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplication;
import java.util.ArrayList;

public class buku {
    
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public buku(){
        this.namaBuku.add("novel dikta");
        this.stok.add(11);
        this.harga.add(120000);
        
        this.namaBuku.add("novel pulang");
        this.stok.add(5);
        this.harga.add(115000);
        
        this.namaBuku.add("novel pergi");
        this.stok.add(8);
        this.harga.add(130000);  
    }
    
    public void setNamaBuku(String namaBuku){
        this.namaBuku.add(namaBuku);
    }
    public String getnamaBuku(int idBuku){
        return this.namaBuku.get(idBuku);
    }
    public void setStok(int stok){
        this.stok.add(stok);
    }
    public int getstok(int idBuku){
        return this.stok.get(idBuku);
    }
    public void editStok(int idBuku,int stok){
        this.stok.set(idBuku, stok);
    }
    public void setharga(int harga){
        this.harga.add(harga);
    }
    public int getharga(int idBuku){
        return this.harga.get(idBuku);
    }
    public int getJmlBuku(){
        return this.namaBuku.size();
    }
}
