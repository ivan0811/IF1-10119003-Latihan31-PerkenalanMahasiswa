package com.ivanfaathirza.perkenalanmahasiswa;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menampilkan perkenalan mahasiswa berdasarkan konsep objek dan instansiasi objek
 */

public class IF110119003Latihan31Perkenalan {

    public static void main(String[] args) {
	    Mahasiswa mahasiswa = new Mahasiswa();
	    mahasiswa.nama = "Ivan Faathriza";
	    mahasiswa.nim = "10119003";
	    mahasiswa.perkenalanDiri();

	    Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Argya";
        mahasiswa1.nim = "10119023";
        mahasiswa1.perkenalanDiri();

	    Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Aras";
        mahasiswa2.nim = "10119001";
        mahasiswa2.perkenalanDiri();

	    Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nama = "Hayin";
        mahasiswa3.nim = "10119005";
        mahasiswa3.perkenalanDiri();
    }
}
