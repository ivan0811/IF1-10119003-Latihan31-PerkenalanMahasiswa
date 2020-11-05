package com.ivanfaathirza.perkenalanmahasiswa;

public class Mahasiswa {
    public String nim;
    public String nama;

    public void perkenalanDiri(){
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is ".concat(nim));
        System.out.println("My Name is ".concat(nama).concat("\n"));
    }
}
