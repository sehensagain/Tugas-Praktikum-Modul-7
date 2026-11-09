package com.mycompany.smartlibrary;

import java.util.ArrayList;
import java.util.HashMap;

public class Perpustakaan {

    private String namaPerpus;

    // COMPOSITION
    private RuangBaca ruangBacaUtama;

    // AGGREGATION
    private ArrayList<Anggota> daftarAnggota;
    private HashMap<String, Anggota> dataAnggota;

    public Perpustakaan(String namaPerpus) {
        this.namaPerpus = namaPerpus;

        // Composition
        this.ruangBacaUtama = new RuangBaca("Ruang Baca Utama", 50);

        // Aggregation
        this.daftarAnggota = new ArrayList<>();
        this.dataAnggota = new HashMap<>();
    }

    public void bukaPerpustakaan() {
        System.out.println("\n=== " + namaPerpus + " ===");
        ruangBacaUtama.bukaRuangan();
    }

    // AGGREGATION
    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
        dataAnggota.put(anggota.getNpm(), anggota);

        System.out.println("Anggota berhasil ditambahkan.");
    }

    public void cariAnggota(String npm) {
        if (dataAnggota.containsKey(npm)) {
            Anggota anggota = dataAnggota.get(npm);

            System.out.println("NPM  : " + anggota.getNpm());
            System.out.println("Nama : " + anggota.getNama());
        } else {
            System.out.println("Anggota tidak ditemukan.");
        }
    }

    public void lihatSemuaAnggota() {
        System.out.println("\n=== DAFTAR ANGGOTA ===");

        for (Anggota anggota : daftarAnggota) {
            System.out.println(
                "NPM: " + anggota.getNpm()
                + " | Nama: " + anggota.getNama()
            );
        }
    }

    public Anggota getAnggota(String npm) {
        return dataAnggota.get(npm);
    }
}