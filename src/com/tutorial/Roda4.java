package com.tutorial;

public class Roda4 extends Kendaraan {
    public Roda4(String merk, String bahanBakar) {
        super(merk, "roda 4", bahanBakar);
    }
        
@Override
    public void arahkan(String lokasi) {
        System.out.println("Silahkan arahkan kendaraan roda 4 Anda ke " + lokasi);
    }
}
