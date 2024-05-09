/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplication;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        
        siswa siswa;
        siswa = new siswa();
        petugas petugas = new petugas();
        buku buku = new buku();
        peminjaman peminjaman = new peminjaman();
        laporan laporan = new laporan();
        
        peminjaman.prosesPeminjaman(siswa,peminjaman, buku);
        
        laporan.laporan (buku);
        laporan.laporan(siswa);
        laporan.laporan(peminjaman,buku);
        
        
    }
    
}
