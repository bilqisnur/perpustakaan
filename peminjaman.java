/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplication;

import java.util.ArrayList;
import java.util.Scanner;

public class peminjaman {
    siswa Siswa = new siswa();
    private ArrayList<Integer>idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer>idBuku = new ArrayList<Integer>();
    private ArrayList<Integer>banyak = new ArrayList<Integer>();
 
    public peminjaman(){
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);
        
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(3);
        
        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(1);
        
        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(2);                 
        
    }
    public  void prosesPeminjaman(siswa siswa, peminjaman peminjaman, buku buku){
        Scanner input = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PERPUS GRAHA MEDIA \n  KETIK 99 UNTUK KELUAR !!!");
        
        System.out.print("Masukkan ID Siswa : ");
        int idSiswa= input.nextInt();
//        int index = Siswa.
//        System.out.println("Selamat Datang di Peminjaan buku "+siswa);
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i=0;
        int idb=0;
         do{
             System.out.println("Masukkan ID Buku : ");
             idb = input.nextInt();
             if(idb<=2){
                 idBuku.add(idb);
                 System.out.print(buku.getnamaBuku(idBuku.get(i))+" sebanyak : ");
                 banyak.add(input.nextInt());
                 i++;
             }
//          System.out.println("Apakah Anda ingin meminjam buku lainnya? (ya/tidak)");
//           String jawaban = input.nextLine();
//
//            if (jawaban.equalsIgnoreCase("ya")) {
//                System.out.println("Masukkan ID Buku : ");
//             idb = input.nextInt();
//             if(idb<=2){
//                 idBuku.add(idb);
//                 System.out.print(buku.getnamaBuku(idBuku.get(i))+" sebanyak : ");
//                 banyak.add(input.nextInt());
//                 i++;
//            } else if (jawaban.equalsIgnoreCase("tidak")) {
//                break;
//            } else {
//                System.out.println("Masukan tidak valid. Silakan jawab ya atau tidak.");
//            }
        } while (idb != 99);

System.out.print("Transaksi peminjaman sebagai berikut \nNama Siswa: " + siswa.getNama(idSiswa) + "\nJudul Buku : ");
for (int j = 0; j < idBuku.size(); j++) {
    System.out.println(buku.getnamaBuku(idBuku.get(j)));
}}
  public void setPeminjaman(buku buku, int idSiswa, int idBuku, int banyaknya){
             this.idSiswa.add(idSiswa);
             this.idBuku.add(idBuku);
             this.banyak.add(banyaknya);
             buku.editStok(idBuku, buku.getstok(idBuku)-banyaknya);
         }
    public int getIdBuku(int id){
        return this.idBuku.get(id);
    }
    public int getBanyanknya(int id){
        return this.banyak.get(id);
    }
    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    }
    public int getJmlPeminjaman(){
        return this.idSiswa.size();
    }
}


