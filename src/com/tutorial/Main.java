package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistem pembagian alur pengisian bahan bakar" );
        System.out.println();
        
        Kendaraan avanza = new Roda4("Avanza", "Pertamax");
        avanza.tampilkanInfo();
        avanza.arahkan("POM Ahmad Yani");

        System.out.println();

        Kendaraan beat = new Roda2("Beat mber", "Pertalite");
        beat.tampilkanInfo();
        beat.arahkan("POM Parakomando");

        System.out.println();

        Kendaraan hilux = new Roda4("Hilux", "Pertamax");
        hilux.tampilkanInfo();
        hilux.arahkan("POM Ahmad Yani");

        System.out.println();

        Kendaraan supra = new Roda2("Supra Danger", "Pertalite");
        supra.tampilkanInfo();
        supra.arahkan("POM Parakomando");
    }
} 