package Tugas_5;

public class Mahasiswa {
    private final String nim;                  // NIM bersifat final (tidak bisa diubah)
    private String nama;                       // Nama bisa diubah
    private static int totalMahasiswa = 0;     // Static counter untuk menghitung jumlah objek
    public static final int MAX_SKS = 24;      // Konstanta global untuk batas SKS

    // Constructor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++; // Tambah setiap kali objek dibuat
    }

    // untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Maksimum SKS: " + MAX_SKS);
        System.out.println("------------------------");
    }

    // untuk mendapatkan total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}

