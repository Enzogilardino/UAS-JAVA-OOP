package com.tutorial;

public class Roda2 extends Kendaraan {
    public Roda2(String merk, String bahanBakar) {
        super(merk, "roda 2", bahanBakar);
    }

 @Override
    public void arahkan(String lokasi) {
         System.out.println("Silahkan arahkan kendaraan roda 2 Anda ke " + lokasi);
    }
}