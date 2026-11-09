package com.mycompany.smartlibrary;

import java.util.Scanner;

public class SmartLibrary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Membuat objek Perpustakaan
        Perpustakaan perpusUnila =
                new Perpustakaan("Smart Library UNILA");

        // Membuka perpustakaan
        perpusUnila.bukaPerpustakaan();

        // AGGREGATION
        perpusUnila.tambahAnggota(
                new Anggota("2517051084", "Sehen")
        );

        perpusUnila.tambahAnggota(
                new Anggota("2517051085", "Andi")
        );

        perpusUnila.tambahAnggota(
                new Anggota("2517051086", "Budi")
        );

        int pilihan;

        do {
            System.out.println("\n=== MENU SMART LIBRARY ===");
            System.out.println("1. Lihat Semua Anggota");
            System.out.println("2. Cari Anggota");
            System.out.println("3. Transaksi Peminjaman");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1:
                    perpusUnila.lihatSemuaAnggota();
                    break;

                case 2:
                    System.out.print("Masukkan NPM: ");
                    String npm = scanner.nextLine();

                    perpusUnila.cariAnggota(npm);
                    break;

                case 3:
                    System.out.print("Masukkan NPM peminjam: ");
                    String npmPinjam = scanner.nextLine();

                    Anggota anggota =
                            perpusUnila.getAnggota(npmPinjam);

                    if (anggota == null) {
                        System.out.println("Anggota tidak ditemukan.");
                    } else {

                        System.out.print("Masukkan nama koleksi: ");
                        String koleksi = scanner.nextLine();

                        TransaksiPeminjaman transaksi =
                                new TransaksiPeminjaman();

                        // ASSOCIATION
                        transaksi.prosesPinjam(
                                anggota,
                                koleksi
                        );
                    }

                    break;

                case 4:
                    System.out.println(
                            "Terima kasih telah menggunakan Smart Library."
                    );
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        scanner.close();
    }
}