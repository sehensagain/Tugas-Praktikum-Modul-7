package com.mycompany.smartlibrary;

public class Majalah extends Koleksi implements DapatDipinjam, DapatDinilai {
    private final String edisi;
    
    public Majalah(String judul, String pengarang, int tahunTerbit, String edisi) {
        super(judul, pengarang, tahunTerbit); 
        this.edisi = edisi;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.printf("[Buku Cetak] Judul: %-15s | Pengarang: %-10s | Tahun: %d | Halaman: %d Hal%n", 
                          this.judul, this.pengarang, this.tahunTerbit, this.edisi);
    }

    @Override
    public void caraPinjam() {
        System.out.println("-> Info Pinjam: Buku cetak wajib diambil fisik bukunya di meja administrasi perpustakaan.");
    }

    @Override
    public void hitungDendaKeterlambatan() {
        System.out.println("-> Aturan Denda: Rp 2.000 / Hari keterlambatan.");
    }

    @Override
    public void prosesPinjamFisik() {
        System.out.println("-> [PROSES PINJAM] Anggota menyerahkan buku fisik & kartu perpus ke Kasir.");
    }

    @Override
    public void beriRating(int bintang) {
        System.out.println("-> [ULASAN BUKU] Buku fisik ini mendapat rating " + bintang + "/5 Bintang.");
    }

    @Override
    public void prosesPeminjaman() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void beriPenilaian(double rating) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}