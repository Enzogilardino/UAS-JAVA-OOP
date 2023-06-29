package com.tutorial;

public class Kendaraan {
    private String merk;
    private String jenis;
    private String bahanBakar;

    public Kendaraan(String merk, String jenis, String bahanBakar) {
        this.merk = merk;
        this.jenis = jenis;
        this.bahanBakar = bahanBakar;
    }

    public void arahkan(String lokasi) {
        System.out.println("Silahkan arahkan kendaraan anda ke " + lokasi);
    }

    public void tampilkanInfo() {
        System.out.println("Merk kendaraan: " + merk);
        System.out.println("Jenis kendaraan: " + jenis);
        System.out.println("Bahan bakar: " + bahanBakar);
    }
}