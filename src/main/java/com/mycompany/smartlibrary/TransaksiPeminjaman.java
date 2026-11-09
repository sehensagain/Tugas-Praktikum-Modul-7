package com.mycompany.smartlibrary;

public class TransaksiPeminjaman {

    public void prosesPinjam(Anggota anggota, String koleksi) {

        System.out.println("\n=== TRANSAKSI PEMINJAMAN ===");

        System.out.println("Peminjam : " + anggota.getNama());
        System.out.println("NPM      : " + anggota.getNpm());
        System.out.println("Koleksi  : " + koleksi);
        System.out.println("Status   : Peminjaman berhasil.");

        System.out.println("============================");
    }
}