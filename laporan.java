/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplication;


public class laporan {
    public void laporan(buku buku){
        int x = buku.getJmlBuku();
        System.out.println();
        System.out.println("Tabel buku");
        System.out.println();
        System.out.println("Nama Buku \tStok \tHarga");
        for(int i=0; i<x;i++) {
            System.out.println(buku.getnamaBuku(i)+"\t"+buku.getstok(i)+"\t"+buku.getharga(i));
        }

    }
    public void laporan(siswa siswa){
        int x=siswa.getJmlSiswa();
        
        System.out.println();
        System.out.println("Tabel Siswa");
        System.out.println();
        System.out.println("Nama \tAlamat \tTelepon \tStatus");
        for(int i =0;i<x;i++){
            System.out.println(siswa.getNama(i)+"\t"+
                    siswa.getAlamat(i)+"\t"+siswa.getTelepon(i)+"\t"+siswa.getStatus(i));
        }
    }
    public void laporan(peminjaman peminjaman,buku buku){
        int x=peminjaman.getJmlPeminjaman();
        System.out.println();
        System.out.println("Laporan Peminjaman");
        System.out.println();
        System.out.println("Nama Buku \tJumlah \tHarga ");
        
        int total=0;
 for (int i = 0; i < x; i++) {
 int
jumlah=peminjaman.getBanyanknya(i);

     System.out.println(buku.getnamaBuku(peminjaman.getIdBuku(i))+"\t"+peminjaman.getBanyanknya(i)+"\t"+buku.getharga(peminjaman.getIdBuku(i))+"\t"+jumlah);
     
 }
// System.out.println("Total Omset="+total);
    }
    
}
